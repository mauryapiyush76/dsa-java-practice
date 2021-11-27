package io.java.Assignment_more_on_loops;

import java.util.Scanner;

public class SumOrProduct {

	/*
	 * Assignment Coding Problem Problem Name: Sum or Product Problem Level: MEDIUM
	 * Problem Description: #### Write a program that asks the user for a number N
	 * and a choice C. And then give them the possibility to choose between
	 * computing the sum and computing the product of all integers in the range 1 to
	 * N (both inclusive).
	 * 
	 * #### If C is equal to - 
	 * 1, then print the sum 
	 * 2, then print the product 
	 * Any
	 * other number, then print '-1' (without the quotes)
	 * 
	 * ##### Input format : Line 1 : Integer N Line 2 : Choice C
	 * 
	 * ##### Output Format : Sum or product according to user's choice
	 * 
	 * ##### Constraints : 1 <= N <= 12 ##### Sample Input 1 : 10 1
	 * 
	 * ##### Sample Output 1 : 55
	 * 
	 * ##### Sample Input 2 : 10 2
	 * 
	 * ##### Sample Output 2 : 3628800
	 * 
	 * ##### Sample Input 3 : 10 4
	 * 
	 * ##### Sample Output 3 : -1
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,c;
		n = in.nextInt();
		c = in.nextInt();
		in.close();
		if(c != 1 && c != 2) {
			System.out.println(-1);
			return;
		}
		
		int sum = 0, product = 1;
		
		if(c == 1) {
			while(n > 0) {
				sum = sum + n;
				n = n - 1;
			}
			System.out.println(sum);
		}
		
		if(c == 2) {
			while(n > 0) {
			product = product*n;
			n = n - 1;
			}
			System.out.println(product);
		}
	}
	
}
