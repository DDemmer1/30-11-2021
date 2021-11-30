package de.demmer.dennis;

import java.util.Arrays;
import java.util.Random;

public class Application {

	public static void main(String[] args) {

		int[] input = { 5, 5, 3, 4 };

		int[] tmp = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			tmp[i] = input[i];
		}

		System.out.println(Arrays.toString(tmp));

		int[] integerArray = new int[9999];

		for (int i = 0; i < integerArray.length; i++) {
//			integerArray[i] = 42;

//			double rnd = Math.random();
//			long gerundet = Math.round(rnd);
//			int zahl = (int) gerundet;

			integerArray[i] = (int) Math.round(Math.random());

			Random random = new Random();
			integerArray[i] = random.nextInt(2);

		}

		for (int current : integerArray) {
			System.out.println(current);
		}

		String s1 = "Test";

		String s2 = new String("Test");

		System.out.println(s2);
		System.out.println(s1 == s2);

	}

}
