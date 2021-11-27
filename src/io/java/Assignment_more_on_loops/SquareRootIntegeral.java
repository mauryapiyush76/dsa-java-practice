package io.java.Assignment_more_on_loops;

import java.util.Scanner;

public class SquareRootIntegeral {

	/*
	 * Assignment Coding Problem 
	 * Problem Name: Square Root (Integral) 
	 * Problem Level:
	 * MEDIUM 
	 * Problem Description: #### Given a number N, find its square root. You
	 * need to find and print only the integral part of square root of N. #### For
	 * eg. if number given is 18, answer is 4.
	 * 
	 * ##### Input format : Integer N
	 * 
	 * ##### Output Format : Square root of N (integer part only)
	 * 
	 * ##### Constraints : 0 <= N <= 10^8 ##### Sample Input 1 : 10
	 * 
	 * ##### Sample Output 1 : 3
	 * 
	 * ##### Sample Input 2 : 4
	 * 
	 * ##### Sample Output 2 : 2
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int i = 0;
		int root = 0;
		while(i*i < n) {
			root = i;
			i =i + 1;
		}
		System.out.println(root);
	}
	
}
