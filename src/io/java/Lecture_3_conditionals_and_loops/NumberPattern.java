package io.java.Lecture_3_conditionals_and_loops;

import java.util.Scanner;

public class NumberPattern {

	/*
	 * Coding Problem 
	 * Problem Name: Number Pattern 
	 * Problem Level: EASY Problem
	 * Description: ####Print the following pattern ####Pattern for N = 4
	 * 
	 * 1 
	 * 23 
	 * 345 
	 * 4567
	 * 
	 * #####Input Format : N (Total no. of rows)
	 * 
	 * #####Output Format : Pattern in N lines #####Sample Input 1 : 3
	 * 
	 * #####Sample Output 1 : 
	 * 1 
	 * 23 
	 * 345
	 */

	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		in.close();

		int i = 1, k;

		while (i <= n) {
			int j = 1;
			k = i;
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


