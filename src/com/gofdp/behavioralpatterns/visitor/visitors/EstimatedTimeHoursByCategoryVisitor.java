package com.gofdp.behavioralpatterns.visitor.visitors;

import com.gofdp.behavioralpatterns.visitor.Employee;
import com.gofdp.behavioralpatterns.visitor.Visitor;
import com.gofdp.behavioralpatterns.visitor.work.Category;
import com.gofdp.behavioralpatterns.visitor.work.Task;

public class EstimatedTimeHoursByCategoryVisitor implements Visitor<Employee> {
	
	private Category _category;
	private int _result = 0;
	
	public EstimatedTimeHoursByCategoryVisitor(Category category) {
		_category = category;
	}

	@Override
	public void visit(Employee employee) {
		for (Task task : employee.getToDoList())
			if (task.getCategory() == _category)
				_result += task.getEstimatedTimeHours();
	}
	
	public int getResult() {
		return _result;
	}
}
