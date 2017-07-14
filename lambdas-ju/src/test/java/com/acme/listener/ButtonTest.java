package com.acme.listener;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ButtonTest {
	private Button button;
	private String log;

	@BeforeEach
	void setUp() {
		button = new Button();
	}

	@Test
	void click() {
		button.setOnClick(new OnClickListener() {
			@Override
			public void handle(ActionEvent event) {
				log = "on-" + event.getName();
				System.out.println(log);
			}
		});

		button.click();
		assertEquals("on-click", log);
	}

	@Test
	void clickLambda() {
		button.setOnClick(event -> {
			log = "on-" + event.getName();
			System.out.println(log);
		});

		button.click();
		assertEquals("on-click", log);

	}
}