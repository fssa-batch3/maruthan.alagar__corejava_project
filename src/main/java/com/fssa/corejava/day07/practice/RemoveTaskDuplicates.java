package com.fssa.corejava.day07.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

class Task {
	public String getName() {
		return name;
	}

	public String getDeadline() {
		return deadline;
	}

	private String name;
	private String deadline;
	private int id;

	public int getId() {
		return id;
	}

	public Task(String name, String deadline ,int id) {
		this.name = name;
		this.deadline = deadline;
		this.id = id;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		} else {
			Task task = (Task) obj;
			return Objects.equals(name, task.name) && Objects.equals(deadline, task.deadline);
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(name, deadline);
	}

}

public class RemoveTaskDuplicates {
	public static void main(String[] args) {

		ArrayList<Task> tasksWithDuplicates = new ArrayList<>();

		Task task1 = new Task("Task1", "2023-07-19" ,1);
		Task task2 = new Task("Task2", "2023-07-20" ,2);
		Task task3 = new Task("Task1", "2023-07-19" ,1);
		Task task4 = new Task("Task3", "2023-07-21" ,3);
		Task task5 = new Task("Task2", "2023-07-20" ,2);

		tasksWithDuplicates.add(task1);
		tasksWithDuplicates.add(task2);
		tasksWithDuplicates.add(task3);
		tasksWithDuplicates.add(task4);
		tasksWithDuplicates.add(task5);

		HashSet<Task> uniqueTasks = new HashSet<>(tasksWithDuplicates);

		System.out.println("Unique tasks:");
		for (Task task : uniqueTasks) {
			System.out.println("Name: " + task.getName() + ", Deadline: " + task.getDeadline()+ ", ID: " + task.getId());
		}
	}
}
