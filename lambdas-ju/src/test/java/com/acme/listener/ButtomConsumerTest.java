package com.acme.listener;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnitPlatform.class)
class ButtomConsumerTest {
	private Button button;
	private String log;

	@BeforeEach
	void setUp() {
		button = new Button();
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