package io.java.Lecture_4_operators_and_for_loop;

import java.util.Scanner;

public class NthFibonacciNumber {

	/*
	 * Coding Problem 
	 * Problem Name: Nth Fibonacci number 
	 * Problem Level: EASY 
	 * Problem
	 * Description: 
	 * #### Nth term of fibonacci series F(n) is calculated using
	 * following formula - F(n) = F(n-1) + F(n-2), Where, F(1) = F(2) = 1
	 * 
	 * #### Provided N you have to find out the Nth Fibonacci Number.
	 * 
	 * 
	 * ##### Input Format : Integer n ##### Output Format : Nth Fibonacci term i.e.
	 * F(n) 
	 * ##### Constraints: 1 <= n <= 25 
	 * ##### Sample Input 1: 4
	 * ##### Sample Output 2: 3
	 * 
	 * ##### Sample Input 1: 6 
	 * ##### Sample Output 2: 8
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int f = 1;
		int s = 1;
		int nth = 0;
		int n = in.nextInt();
		in.close();
		if(n == 1 || n == 2) {
			System.out.println(1);
			return;
		} else {
			for(int i = 3; i <= n ; i++) {
				nth = f + s;
				f = s;
				s = nth;
			}
			System.out.println(nth);
		}
	}

}
