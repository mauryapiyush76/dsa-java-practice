package io.java.Lecture_5_patterns_1;

import java.util.Scanner;

public class InterestingAlphabets {

	/*
	 * Coding Problem 
	 * Problem Statement: Interesting Alphabets 
	 * Problem Level: EASY
	 * Problem Description: Print the following pattern for the given number of
	 * rows. Pattern for N = 5 
	 * E 
	 * DE 
	 * CDE 
	 * BCDE 
	 * ABCDE
	 * 
	 * Input format : N (Total no. of rows)
	 * 
	 * Output format : Pattern in N lines
	 * 
	 * Constraints 0 <= N <= 26
	 * 
	 * Sample Input 1: 8
	 * 
	 * Sample Output 1: 
	 * H 
	 * GH 
	 * FGH 
	 * EFGH 
	 * DEFGH 
	 * CDEFGH 
	 * BCDEFGH 
	 * ABCDEFGH
	 * 
	 * Sample Input 2: 7
	 * 
	 * Sample Output 2: 
	 * G 
	 * FG 
	 * EFG 
	 * DEFG 
	 * CDEFG 
	 * BCDEFG 
	 * ABCDEFG
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i = 1;
		in.close();
		while (i <= n) {
			int j = 1;
			char jthChar = (char)('A' + n - i);
			while (j <= i) {
				System.out.print(jthChar);
				jthChar = (char)(jthChar + 1);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
	
}
