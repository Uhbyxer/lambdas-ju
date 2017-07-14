package com.acme.comparator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.List;

import static java.util.Arrays.asList;

@RunWith(JUnitPlatform.class)
class ComparatorUtilTest {
	@Test
	@DisplayName("Comparator by letters test")
	void sortByFirstLetter() {
		List<String> list = ComparatorUtil.sortByFirstLetter(asList("Bob", "Ann", "Nick"));
		System.out.println(list);
	}
}