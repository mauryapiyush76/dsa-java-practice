package io.java.Lecture_5_patterns_2;

import java.util.Scanner;

public class DiamondOfStars {

	/*
	Coding Problem
	Problem Name: Diamond of Stars
	Problem Level: MEDIUM
	Problem Description: #### Print the following pattern for the given number of rows. 
	##### Note: N is always odd.
	<br>
	##### Pattern for N = 5 
	<br>
	<img src="https://ninjasfiles.s3.amazonaws.com/0000000000003726.png" height="81" width="43" />
	#### The dots represent spaces.
	<br>
	<br>
	##### Input format : 
	    N (Total no. of rows and can only be odd)

	##### Output format : 
	    Pattern in N lines

	##### Constraints :
	    1 <= N <= 49
	 ##### Sample Input 1: 
	    5

	##### Sample Output 1:
	      *
	     ***
	    *****
	     ***
	      *

	##### Sample Input 2: 
	    3

	##### Sample Output 2:
	      *
	     ***
	      *
	*/
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.close();
		
		int i = 1;
		
		while(i <= n) {
			int j;
			int space;
			if(i <= (int)(n/2 + 1)) {
				j = 2*i - 1;
				space =(int)(n/2 - i + 1);
			} else {
				j = 2*(n - i) + 1;
				space = (int)(i - 1 - n/2) ;
			}
			while(space > 0) {
				System.out.print(" ");
				space = space - 1;
			}
			while(j > 0) {
				System.out.print("*");
				j = j - 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

}
