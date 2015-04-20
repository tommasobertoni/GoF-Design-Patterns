package com.gofdp.behavioralpatterns.visitor;

import com.gofdp.behavioralpatterns.visitor.work.Category;

public class Main {

	public static void main(String[] args) {
		
		Company company = new Company();
		
		System.out.println("Employees name: " +
							company.getEmployeesName());
		System.out.println("Total estimated hours (current tasks): " +
							company.totalEstimatedHours());
		System.out.println("Total estimated hours (current tasks) for project id 2: " +
							company.estimatedHoursByProject(2));
		System.out.println("Total estimated hours (current tasks) for tasks of category DEVELOPMENT: " +
							company.estimatedHoursByCategory(Category.DEVELOPMENT));
		System.out.println("Total estimated hours (current tasks) for tasks of category ANALISYS: " +
							company.estimatedHoursByCategory(Category.ANALISYS));
		System.out.println("Waiting 1.5 second..");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try { Thread.sleep(1500);
				} catch (InterruptedException iE) {}
				
				System.out.println("Employees with 2 or more tasks to do: " + company.equalsOrMoreTasks(2));
				
				try { Thread.sleep(2000);
				} catch (InterruptedException iE) {}
				System.exit(0);
			}
		}).start();
	}
}
