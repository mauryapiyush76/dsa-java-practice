package io.java.Lecture_4_operators_and_for_loop;

import java.util.Scanner;

public class AllPrimeNumbers {

	/*
	 * Coding Problem 
	 * Problem Name: All prime numbers 
	 * Problem Level: MEDIUM 
	 * Problem
	 * Description: 
	 * #### Given an integer N, print all the prime numbers that lie in
	 * the range 2 to N (both inclusive). 
	 * #### Print the prime numbers in different
	 * lines.
	 * 
	 * ##### Input Format : Integer N
	 * 
	 * ##### Output Format : Prime numbers in different lines
	 * 
	 * ##### Constraints : 1 <= N <= 100 
	 * ##### Sample Input 1: 9
	 * 
	 * ##### Sample Output 1: 
	 * 2 
	 * 3 
	 * 5 
	 * 7
	 * 
	 * ##### Sample Input 2: 20
	 * 
	 * ##### Sample Output 2: 
	 * 2 
	 * 3 
	 * 5 
	 * 7 
	 * 11 
	 * 13 
	 * 17 
	 * 19
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		for(int i = 2; i <= n ; i++) {
			for(int j = 2 ; j <= i ; j++) {
				if(i%j == 0 && i != j) {
					break;
				}
				if(i == j) {
					System.out.println(i);
					break;
				}
			}
		}
	}

}
