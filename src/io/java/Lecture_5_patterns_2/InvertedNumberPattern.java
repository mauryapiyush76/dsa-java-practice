package io.java.Lecture_5_patterns_2;

import java.util.Scanner;

public class InvertedNumberPattern {

	/*
	 * Coding Problem Problem Name: Inverted Number Pattern Problem Level: EASY
	 * Problem Description: #### Print the following pattern for the given N number
	 * of rows. ##### Pattern for N = 4
	 * 
	 * 4444 
	 * 333 
	 * 22 
	 * 1
	 * 
	 * ##### Input format : Integer N (Total no. of rows)
	 * 
	 * ##### Output format : Pattern in N lines
	 * 
	 * ##### Constraints : 0 <= N <= 50 ##### Sample Input 1: 5
	 * 
	 * ##### Sample Output 1: 
	 * 55555 
	 * 4444 
	 * 333 
	 * 22 
	 * 1
	 * 
	 * ##### Sample Input 2: 6
	 * 
	 * ##### Sample Output 2: 
	 * 666666 
	 * 55555 
	 * 4444 
	 * 333 
	 * 22 
	 * 1
	 */
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int i = 1;
		in.close();
		while(i <= n) {
			int k = n - i + 1;
			int j = k;
			while(j > 0) {
				System.out.print(k);
				j = j - 1;
			}
			System.out.println();
			i = i + 1;
		}

	}

}
