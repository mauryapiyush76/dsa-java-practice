package io.java.Lecture_3_conditionals_and_loops;

import java.util.Scanner;

public class SumOfEvenNumbersTillN {

	/*
	 * Coding Problem Problem Name: Sum of Even Numbers till N Problem Level: EASY
	 * Problem Description: ####Given a number N, print sum of all even numbers from
	 * 1 to N.
	 * 
	 * 
	 * #####Input Format : Integer N
	 * 
	 * #####Output Format : Required Sum #####Sample Input 1 : 6 #####Sample Output
	 * 1 : 12
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		in.close();

		int i = 2;

		int sum = 0;

		if (n <= 1) {
			System.out.println("0");
			return;
		}

		while (i <= n) {
			sum = sum + i;
			i = i + 2;
		}

		System.out.println(sum);
	}

}
