package com.acme.funcint;

//import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.*;

import java.util.function.*;

@RunWith(JUnitPlatform.class)
public class FuncInterfacesTest {
	private String log;

	@BeforeEach
	void setUp() {
		log = "";
	}

	@DisplayName("IntBinaryOperator")
	@Test
	void intBinaryOperator() throws Exception {
		IntBinaryOperator operator = (left, right) -> {
			int result = 0;
			for (int i = left; i < right; i++) {
				result += i;
			}
			return result;
		};

		int asInt = operator.applyAsInt(1, 10);
		System.out.println(asInt);
	}

	@DisplayName("BiConsumer")
	@Test
	void biConsumer() throws Exception {
		BiConsumer biConsumer = (o, o2) -> {
			System.out.println("Concatination: ".concat(o.toString()).concat(o2.toString()));
		};

		biConsumer.accept("ho", "-hohoho");
	}

	@DisplayName("BiFunction")
	@Test
	void biFunction() throws Exception {
		BiFunction<Integer, Integer, String> biFunction = (integer, integer2) -> integer.toString().concat(" ")
				.concat(integer2.toString());

		String apply = biFunction.apply(5, 10);
		System.out.println(apply);
	}

	@DisplayName("Copy lamda to Lambda")
	@Test
	void copyLambda() {
		BiConsumer<IntSupplier, IntConsumer> copy = (intSupplier, intConsumer) -> {
			intConsumer.accept(intSupplier.getAsInt());
		};

		copy.accept(() -> 24, value -> log = String.valueOf(value));
		assertEquals("24", log);
	}
}
