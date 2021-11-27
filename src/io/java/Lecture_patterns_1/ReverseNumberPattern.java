package io.java.Lecture_patterns_1;

import java.util.Scanner;

public class ReverseNumberPattern {
	/*
	 * Coding Problem Problem Statement: Reverse Number Pattern Problem Level: EASY
	 * Problem Description: Print the following pattern for the given N number of
	 * rows. Pattern for N = 4 
	 * 1 
	 * 21 
	 * 321 
	 * 4321
	 * 
	 * Input format : Integer N (Total no. of rows)
	 * 
	 * Output format : Pattern in N lines
	 * 
	 * Constraints 0 <= N <= 50
	 * 
	 * Sample Input 1: 5
	 * 
	 * Sample Output 1: 
	 * 1 
	 * 21 
	 * 321 
	 * 4321 
	 * 54321
	 * 
	 * Sample Input 2: 6
	 * 
	 * Sample Output 2: 
	 * 1 
	 * 21 
	 * 321 
	 * 4321 
	 * 54321 
	 * 654321
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int i = 1;
		in.close();
		while (i <= n) {
			int j = 1;
			int rev = i;
			while (j <= i) {
				System.out.print(rev);
				j = j + 1;
				rev = rev - 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
