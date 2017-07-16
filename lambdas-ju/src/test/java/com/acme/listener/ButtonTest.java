package com.acme.listener;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RunWith(JUnitPlatform.class)
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

	@Test
	void clickLambdaQuadro() {
		button.setOnClick(System.out::println);

		button.click();
		// assertEquals("on-click", log);

	}

	@DisplayName(":: method")
	@Test
	void QuadroMethod() {
		List<String> list = new ArrayList<String>() {
			{
				add("four");
				add("two");
				add("five");
			}
		};

		Comparator<String> comparator = (o1, o2) -> o1.compareToIgnoreCase(o2);
		Collections.sort(list, comparator);
		System.out.println("Old style: " + list);

		Collections.shuffle(list);
		System.out.println("Shuffle: " + list);

		Comparator<String> newComparator = String::compareToIgnoreCase;
		Collections.sort(list, newComparator);
		System.out.println("New school: "+ list);
	}
}