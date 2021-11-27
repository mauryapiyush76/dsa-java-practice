package io.java.Assignment_more_on_loops;

import java.util.Scanner;

public class DecimalToBinary {

	/*
	 * Assignment Coding Problem 
	 * Problem Name: Decimal to Binary 
	 * Problem Level:
	 * MEDIUM 
	 * Problem Description: #### Given a decimal number (integer N), convert
	 * it into binary and print. #### The binary number should be in the form of an
	 * integer.
	 * 
	 * ##### Note : The given input number could be large, so the corresponding
	 * binary number can exceed the integer range. So you may want to take the
	 * answer as long for CPP and Java.
	 * 
	 * <br>
	 * 
	 * ##### Input format : Integer N
	 * 
	 * ##### Output format : Corresponding Binary number (long)
	 * 
	 * ##### Constraints : 0 <= N <= 10^5 #####Sample Input 1 : 12
	 * 
	 * #####Sample Output 1 : 1100
	 * 
	 * #####Sample Input 2 : 7
	 * 
	 * #####Sample Output 2 : 111
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int i = 0;
		int bin = 0;
		while(n > 0) {
			int term = n%2;
			n = n/2;
			int itr = i;
			int numOfTen = 1;
			while(itr > 0) {
				numOfTen = numOfTen*10;
				itr = itr - 1;
			}
			bin = bin + term*numOfTen;
			i = i + 1;
		}
		System.out.println(bin);
	}
}
