package io.java.Lecture_patterns_1;

import java.util.Scanner;

public class SquarePattern {

	/*
	 * Coding Problem 
	 * Problem Statement: Square Pattern 
	 * Problem Level: EASY Problem
	 * Description: Print the following pattern for the given N number of rows.
	 * Pattern for N = 4 
	 * 4444 
	 * 4444 
	 * 4444 
	 * 4444
	 * 
	 * Input format : Integer N (Total no. of rows)
	 * 
	 * Output format : Pattern in N lines
	 * 
	 * Constraints 0 <= N <= 50
	 * 
	 * Sample Input 1: 7
	 * 
	 * Sample Output 1: 
	 * 7777777 
	 * 7777777 
	 * 7777777 
	 * 7777777 
	 * 7777777 
	 * 7777777 
	 * 7777777
	 * 
	 * Sample Input 1: 6
	 * 
	 * Sample Output 1: 
	 * 666666 
	 * 666666 
	 * 666666 
	 * 666666 
	 * 666666 
	 * 666666
	 */
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int i = 1;
		in.close();
		while(i <= n) {
			int j = 1;
			while(j <= n) {
				System.out.print(n);
				j = j+1;
			}
			System.out.println();
			i = i + 1;
		}

	}

}
