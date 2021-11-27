package io.java.Assignment_more_on_loops;

import java.util.Scanner;

public class BinaryToDecimal {

	/*
	 * Assignment Coding Problem 
	 * Problem Name: Binary to decimal 
	 * Problem Level:
	 * MEDIUM 
	 * Problem Description: ####Given a binary number as an integer N,
	 * convert it into decimal and print.
	 * 
	 * #####Input format : An integer N in the Binary Format
	 * 
	 * #####Output format : Corresponding Decimal number (as integer)
	 * 
	 * ##### Constraints : 0 <= N <= 10^9
	 * 
	 * #####Sample Input 1 : 1100
	 * 
	 * #####Sample Output 1 : 12
	 * 
	 * #####Sample Input 2 : 111
	 * 
	 * #####Sample Output 2 : 7
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int i = 0;
		int dec = 0;
		while(n > 0) {
			int term = n%10;
			n = n/10;
			int itr = i;
			int numOfTwos = 1;
			while(itr > 0) {
				numOfTwos = numOfTwos*2;
				itr = itr - 1;
			}
			dec = dec + term*numOfTwos;
			i = i + 1;
		}
		System.out.println(dec);
	}
	
}
