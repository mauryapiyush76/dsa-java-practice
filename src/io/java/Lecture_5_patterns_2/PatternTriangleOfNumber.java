package io.java.Lecture_5_patterns_2;

import java.util.Scanner;

public class PatternTriangleOfNumber {

	/*
	Coding Problem
	Problem Name: Pattern: Triangle of numbers
	Problem Level: MEDIUM
	Problem Description: #### Print the following pattern for the given number of rows. 
	##### Pattern for N = 4
	<br>
	<img src="https://ninjasfiles.s3.amazonaws.com/0000000000003725.png" height="65" width="56" />

	#### The dots represent spaces.
	<br>
	<br>
	##### Input format : 
	    Integer N (Total no. of rows)

	##### Output format : 
	    Pattern in N lines

	##### Constraints :
	    0 <= N <= 50
	 ##### Sample Input 1: 
	    5

	##### Sample Output 1:
	               1
	             232
	           34543
	         4567654
	       567898765

	##### Sample Input 2: 
	    4

	##### Sample Output 2:
	               1
	             232
	           34543
	         4567654
	         
	         */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int i = 1;
		in.close();
		while(i <= n) {
			int k = 2*i - 1;
			int halfK = k/2;
			int j = i;
			int space = 2 * (n - i);
			while(space > 0) {
				System.out.print(" ");
				space = space - 1;
			}
			while(k > 0) {
				System.out.print(j);
				if(halfK < k - 1) {
					j = j + 1;
				} else {
					j = j - 1;
				}
				k = k - 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
	
}
