package com.hascode.tutorial;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(final String... args) {
		System.out.println("start");
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i <= Integer.MAX_VALUE; i++) { // going to fail
			numbers.add(i);
		}
		System.out.println("stop");
	}
}
