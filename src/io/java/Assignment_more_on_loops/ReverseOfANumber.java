package io.java.Assignment_more_on_loops;

import java.util.Scanner;

public class ReverseOfANumber {

	/*
	 * Assignment Coding Problem 
	 * Problem Name: Reverse of a number 
	 * Problem Level:
	 * MEDIUM 
	 * Problem Description: #### Write a program to generate the reverse of a
	 * given number N. Print the corresponding reverse number.
	 * 
	 * ##### Note : If a number has trailing zeros, then its reverse will not
	 * include them. For e.g., reverse of 10400 will be 401 instead of 00401. <br>
	 * 
	 * ##### Input format : Integer N
	 * 
	 * ##### Output format : Corresponding reverse number
	 * 
	 * ##### Constraints: 0 <= N < 10^8 ##### Sample Input 1 : 1234
	 * 
	 * ##### Sample Output 1 : 4321
	 * 
	 * ##### Sample Input 2 : 1980
	 * 
	 * ##### Sample Output 2 : 891
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int m = n;
		int i = 0;
		while(m > 0) {
			m = m/10;
			i = i + 1;
		}
		i = i - 1;
		int revN = 0;
		while(n > 0) {
			int term = n%10;
			n = n/10;
			int itr = i;
			int numOfZeros = 1;
			while(itr > 0) {
				numOfZeros = numOfZeros*10;
				itr = itr - 1;
			}
			revN = revN + term*numOfZeros;
			i = i - 1;
		}
		System.out.println(revN);
	}

}
