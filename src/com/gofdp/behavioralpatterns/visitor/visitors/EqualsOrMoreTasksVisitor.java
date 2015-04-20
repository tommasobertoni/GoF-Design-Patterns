package com.gofdp.behavioralpatterns.visitor.visitors;

import java.util.LinkedList;
import java.util.List;

import com.gofdp.behavioralpatterns.visitor.Employee;
import com.gofdp.behavioralpatterns.visitor.Visitor;

public class EqualsOrMoreTasksVisitor implements Visitor<Employee> {
	
	private int _tasksCount;
	private List<Employee> _result = new LinkedList<>();
	
	public EqualsOrMoreTasksVisitor(int tasksCount) {
		_tasksCount = tasksCount;
	}

	@Override
	public void visit(Employee employee) {
		if (employee.getToDoList().size() >= _tasksCount)
			_result.add(employee);
	}
	
	public List<Employee> getResult() {
		return _result;
	}
}
