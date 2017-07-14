package com.acme.listener;

import java.util.function.Consumer;

public class ButtomConsumer {
	private Consumer<ActionEvent> onClick;

	public void setOnClick(Consumer<ActionEvent> onClick) {
		this.onClick = onClick;
	}

	public void click() {
		if (onClick != null) {
			onClick.accept(new ActionEvent("click"));
		}
	}
}
