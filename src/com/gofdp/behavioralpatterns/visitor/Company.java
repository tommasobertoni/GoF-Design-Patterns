package com.gofdp.behavioralpatterns.visitor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.gofdp.behavioralpatterns.visitor.visitors.EmployeesNameVisitor;
import com.gofdp.behavioralpatterns.visitor.visitors.EqualsOrMoreTasksVisitor;
import com.gofdp.behavioralpatterns.visitor.visitors.EstimatedTimeHoursByProjectVisitor;
import com.gofdp.behavioralpatterns.visitor.visitors.EstimatedTimeHoursByCategoryVisitor;
import com.gofdp.behavioralpatterns.visitor.visitors.TotalEstimatedTimeHoursVisitor;
import com.gofdp.behavioralpatterns.visitor.work.Category;
import com.gofdp.behavioralpatterns.visitor.work.Task;

public class Company {

	private List<Task> _toDoList;
	private int _nextTaskIndex;
	private List<Employee> _employees;
	
	public Company() {
		_nextTaskIndex = 0;
		_toDoList = new ArrayList<>();
		_employees = new LinkedList<>();
		init();
	}
	
	public int totalEstimatedHours() {
		TotalEstimatedTimeHoursVisitor visitor = new TotalEstimatedTimeHoursVisitor();
		
		synchronized (_employees) {
			for (Employee e : _employees)
				e.accept(visitor);
		}
		
		return visitor.getResult();
	}
	
	public List<Employee> equalsOrMoreTasks(int tasksCount) {
		EqualsOrMoreTasksVisitor visitor = new EqualsOrMoreTasksVisitor(tasksCount);
		
		synchronized (_employees) {
			for (Employee e : _employees)
				e.accept(visitor);
		}
		
		return visitor.getResult();
	}
	
	public int estimatedHoursByCategory(Category category) {
		EstimatedTimeHoursByCategoryVisitor visitor = new EstimatedTimeHoursByCategoryVisitor(category);
		
		synchronized (_employees) {
			for (Employee e : _employees)
				e.accept(visitor);
		}
		
		return visitor.getResult();
	}
	
	public int estimatedHoursByProject(int projectId) {
		EstimatedTimeHoursByProjectVisitor visitor = new EstimatedTimeHoursByProjectVisitor(projectId);
		
		synchronized (_employees) {
			for (Employee e : _employees)
				e.accept(visitor);
		}
		
		return visitor.getResult();
	}
	
	public List<Employee> getEmployees() {
		return _employees;
	}
	
	public List<String> getEmployeesName() {
		EmployeesNameVisitor visitor = new EmployeesNameVisitor();
		
		synchronized (_employees) {
			for (Employee e : _employees)
				e.accept(visitor);
		}
		
		return visitor.getResult();
	}
	
	public Task getNewTask() {
		if (_toDoList.size() == 0) return null;
		if (_nextTaskIndex >= _toDoList.size()) return null;
		
		return _toDoList.get(_nextTaskIndex++);
	}
	
	public boolean taskCompleted(int taskId) {
		
		synchronized (_toDoList) {
			int i = -1;
			for (i = 0; i < _toDoList.size(); i++)
				if (_toDoList.get(i).getTaskId() == taskId)
					break;
			
			if (i == -1 || i == _toDoList.size()) return false;
			
			Task task = _toDoList.remove(i);
			System.out.println("task completed id " + taskId + " (" + task.getCategory() + ")");
			return true;
		}
	}
	
	private void init() {
		Random rand = new Random(3);
		
		for (int i = 0; i < 30; i++) {
			_toDoList.add(new Task(rand.nextInt(4),
								   Category.values()[rand.nextInt(Category.values().length)],
								   rand.nextInt(3) + 1,
								   "Description " + i));
		}
		
		for (int i = 0; i < 4; i++) {
			String name = "" + (char)(rand.nextInt(26) + 65);
			for (int j = 0; j < 2; j++)
				name += "" + (char)(rand.nextInt(26) + 97);
			
			_employees.add(new Employee(name, this));
		}
		
		for (Employee e : _employees)
			e.startWorking();
	}
}
