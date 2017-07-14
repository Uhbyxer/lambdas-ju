package com.acme.listener;

public class ActionEvent {
	private String name;

	public ActionEvent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override public String toString() {
		return "ActionEvent{" + "name='" + name + '\'' + '}';
	}
}
