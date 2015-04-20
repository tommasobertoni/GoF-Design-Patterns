package com.gofdp.behavioralpatterns.visitor.visitors;

import com.gofdp.behavioralpatterns.visitor.Employee;
import com.gofdp.behavioralpatterns.visitor.Visitor;
import com.gofdp.behavioralpatterns.visitor.work.Task;

public class EstimatedTimeHoursByProjectVisitor implements Visitor<Employee> {
	
	private int _projectId;
	private int _result = 0;
	
	public EstimatedTimeHoursByProjectVisitor(int projectId) {
		_projectId = projectId;
	}

	@Override
	public void visit(Employee employee) {
		for (Task task : employee.getToDoList())
			if (task.getProjectId() == _projectId)
				_result += task.getEstimatedTimeHours();
	}
	
	public int getResult() {
		return _result;
	}
}
