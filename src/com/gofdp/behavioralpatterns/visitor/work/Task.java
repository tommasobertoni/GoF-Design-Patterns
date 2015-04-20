package com.gofdp.behavioralpatterns.visitor.work;

public class Task {
	
	private static int taskId = 123;
	
	private synchronized static int getNextTaskId() {
		return taskId++;
	}

	private int _projectId;
	private int _taskId;
	private String _description;
	private int _estimatedTimeHours;
	private Category _category;
	
	public Task(int projectId, Category category, int estimatedTimeHours, String description) {
		_taskId = Task.getNextTaskId();
		_projectId = projectId;
		_category = category;
		_estimatedTimeHours = estimatedTimeHours;
		_description = description;
	}
	
	public int getProjectId() {
		return _projectId;
	}
	public int getTaskId() {
		return _taskId;
	}
	public String getDescription() {
		return _description;
	}
	public int getEstimatedTimeHours() {
		return _estimatedTimeHours;
	}
	public Category getCategory() {
		return _category;
	}
	
	@Override
	public String toString() {
		return String.format("%d:%d %d (%s): %s", _projectId, _taskId, _estimatedTimeHours, _category.toString(), _description);
	}
}
