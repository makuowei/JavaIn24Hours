package com.java24hours;

import java.util.*;

public class Dice {
	public static void main(String[] arguments) {
		Random generator = new Random();
		int value = generator.nextInt();
		System.out.print("The random number is.... " + value);
	}
}
