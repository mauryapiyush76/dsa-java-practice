package io.java.Lecture_3_conditionals_and_loops;

import java.util.Scanner;

public class PatternExample1 {

	/*
	 * Print this pattern
	 * 
	 * 1 
	 * 2 3 
	 * 4 5 6 
	 * 7 8 9 10
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		in.close();

		int i = 1, k = 1;

		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print(k + " ");
				k = k + 1;
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

}
