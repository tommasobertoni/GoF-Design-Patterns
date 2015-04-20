package com.gofdp.behavioralpatterns.visitor.visitors;

import java.util.LinkedList;
import java.util.List;

import com.gofdp.behavioralpatterns.visitor.Employee;
import com.gofdp.behavioralpatterns.visitor.Visitor;

public class EmployeesNameVisitor implements Visitor<Employee> {
	
	private List<String> _result = new LinkedList<>();

	@Override
	public void visit(Employee employee) {
		_result.add(employee.getName());
	}
	
	public List<String> getResult() {
		return _result;
	}
}
