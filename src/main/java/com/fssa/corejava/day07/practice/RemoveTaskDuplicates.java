package com.fssa.corejava.day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

class Task {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	private String name;
	private String deadline;

	public Task(String name, String deadline) {
		this.name = name;
		this.deadline = deadline;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + deadline.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Task otherTask = (Task) obj;
		return name.equals(otherTask.name) && deadline.equals(otherTask.deadline);
	}
}

public class RemoveTaskDuplicates {
	public static void main(String[] args) {

		ArrayList<Task> tasksWithDuplicates = new ArrayList<>();
		tasksWithDuplicates.add(new Task("Task1", "2023-07-19"));
		tasksWithDuplicates.add(new Task("Task2", "2023-07-20"));
		tasksWithDuplicates.add(new Task("Task1", "2023-07-19"));
		tasksWithDuplicates.add(new Task("Task3", "2023-07-21"));
		tasksWithDuplicates.add(new Task("Task2", "2023-07-20"));

		HashSet<Task> uniqueTasks = new HashSet<>(tasksWithDuplicates);

		System.out.println("Unique tasks:");
		for (Task task : uniqueTasks) {
			System.out.println("Name: " + task.getName() + ", Deadline: " + task.getDeadline());
		}
	}
}
