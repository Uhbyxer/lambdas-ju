package com.acme.comparator;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorUtil {
	private static final Comparator<String> firstLetterComparator = (x, y) ->
			Character.compare(x.charAt(0), y.charAt(0));

	public static List<String> sortByFirstLetter(List<String> list) {
		Collections.sort(list, firstLetterComparator);
		return list;
	}
}
