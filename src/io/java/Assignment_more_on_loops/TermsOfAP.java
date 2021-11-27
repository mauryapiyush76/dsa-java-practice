package io.java.Assignment_more_on_loops;

import java.util.Scanner;

public class TermsOfAP {

	/*
	 * Assignment Coding Problem Problem Name: Terms of AP Problem Level: MEDIUM
	 * Problem Description: #### Write a program to print first x terms of the
	 * series 3N + 2 which are not multiples of 4.
	 * 
	 * ##### Input format : Integer x
	 * 
	 * ##### Output format : Terms of series (separated by space)
	 * 
	 * ##### Constraints : 1 <= N <= 1,000 ##### Sample Input 1 : 10
	 * 
	 * ##### Sample Output 1 : 5 11 14 17 23 26 29 35 38 41
	 * 
	 * ##### Sample Input 2 : 4
	 * 
	 * ##### Sample Output 2 : 5 11 14 17
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int i = 1, j = 1;
		while(j <= n) {
			int term = 3*i + 2;
			if(term % 4 != 0) {
				System.out.print(term + " ");
				i = i + 1;
				j = j + 1;
			}
			else {
				i = i + 1;
			}
		}
	}
	
}
