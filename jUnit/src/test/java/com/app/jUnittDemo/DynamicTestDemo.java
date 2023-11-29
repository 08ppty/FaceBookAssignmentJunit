package com.app.jUnittDemo;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestDemo {




	@TestFactory
	Collection<DynamicTest> dynamicTestFromCollection() {

		return Arrays.asList(dynamicTest("Addition Test", () -> {

			int result = add(3, 5);
			assertEquals(8, result);

		}),

				dynamicTest("Subtraction Test", () -> {

					int result = subtract(8, 3);
					assertEquals(5, result);

				})

		);

	}

	private Object dynamicTest(String string, Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object dynamicTest(String string, Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	private int add(int a, int b) {

		return a + b;
	}

	private int subtract(int a, int b) {
		return a - b;

	}




}

