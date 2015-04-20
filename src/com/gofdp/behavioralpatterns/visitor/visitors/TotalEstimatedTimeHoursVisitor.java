package com.gofdp.behavioralpatterns.visitor.visitors;

import com.gofdp.behavioralpatterns.visitor.Employee;
import com.gofdp.behavioralpatterns.visitor.Visitor;
import com.gofdp.behavioralpatterns.visitor.work.Task;

public class TotalEstimatedTimeHoursVisitor implements Visitor<Employee> {
	
	private int _result = 0;

	@Override
	public void visit(Employee employee) {
		for (Task task : employee.getToDoList())
			_result += task.getEstimatedTimeHours();
	}
	
	public int getResult() {
		return _result;
	}
}
