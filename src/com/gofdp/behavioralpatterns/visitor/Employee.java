package com.gofdp.behavioralpatterns.visitor;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import com.gofdp.behavioralpatterns.visitor.work.Task;

public class Employee implements Element {

	private Queue<Task> _toDoList;
	private Thread _worker;
	private boolean _isWorking;
	private Company _company;
	private String _name;
	
	public Employee(String name, Company company) {
		_name = name;
		_company = company;
		_toDoList = new LinkedBlockingQueue<>();
	}
	
	public String getName() {
		return _name;
	}
	
	public boolean startWorking() {
		if (_isWorking) return false;
		
		getNewTasks();
		_isWorking = true;
		_worker = new Thread(new Runnable() {
			@Override
			public void run() {
				
				while (_isWorking) {
					Task task = _toDoList.peek();
					int workingTime;
					
					if (task == null) workingTime = 2000;
					else workingTime = task.getEstimatedTimeHours() * 1000;
					
					try { Thread.sleep(workingTime);
					} catch (InterruptedException iE) {}
					
					_toDoList.poll();
					if (task == null) getNewTasks();
					else _company.taskCompleted(task.getTaskId());
				}
			}
		});
		_worker.start();
		
		return true;
	}
	
	private void getNewTasks() {
		Task newTask;
		for (int i = 0; i < 2; i++)
			if ((newTask = _company.getNewTask()) != null)
				_toDoList.add(newTask);
	}
	
	public boolean stopWorking() {
		if (!_isWorking) return false;
		
		_isWorking = false;
		
		return true;
	}
	
	public Queue<Task> getToDoList() {
		return _toDoList;
	}
	
	public void addTask(Task task) {
		_toDoList.add(task);
	}
	
	public void clearTasks() {
		_toDoList.clear();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public String toString() {
		return String.format("Employee %s", _name);
	}
}
