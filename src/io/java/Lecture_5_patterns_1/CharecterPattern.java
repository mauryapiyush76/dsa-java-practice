package io.java.Lecture_5_patterns_1;

import java.util.Scanner;

public class CharecterPattern {

	/*
	 * Coding Problem 
	 * Problem Statement: Character Pattern 
	 * Problem Level: EASY
	 * Problem Description: Print the following pattern for the given N number of
	 * rows. Pattern for N = 4 
	 * A 
	 * BC 
	 * CDE 
	 * DEFG
	 * 
	 * Input format : Integer N (Total no. of rows)
	 * 
	 * Output format : Pattern in N lines
	 * 
	 * Constraints 0 <= N <= 13
	 * 
	 * Sample Input 1: 5
	 * 
	 * Sample Output 1: 
	 * A 
	 * BC 
	 * CDE 
	 * DEFG 
	 * EFGHI
	 * 
	 * Sample Input 2: 6
	 * 
	 * Sample Output 2: 
	 * A 
	 * BC 
	 * CDE 
	 * DEFG 
	 * EFGHI 
	 * FGHIJK
	 */
	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

			int n = in.nextInt();
			int i = 1;
			in.close();
			while (i <= n) {
				int j = 1;
				char jthChar = (char)('A' + i - 1);
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
