package io.java.Lecture_3_conditionals_and_loops;

import java.util.Scanner;

public class StarPattern {

	/*
	 Coding Problem
Problem Name: Star Pattern
Problem Level: EASY
Problem Description: #### Print the following pattern
##### Pattern for N = 4
<br>
<img src="https://ninjasfiles.s3.amazonaws.com/0000000000003724.png" height="65" width="58"/>

#### The dots represent spaces.
<br>
<br>
##### Input Format : 
    N (Total no. of rows)

##### Output Format :
    Pattern in N lines

##### Constraints :
    0 <= N <= 50

 ##### Sample Input 1 :
    3

##### Sample Output 1 :
       *
      *** 
     *****
##### Sample Input 2 :
    4

##### Sample Output 2 :
        *
       *** 
      *****
     *******
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		in.close();
		
		int i = 1;

		while (i <= n) {
			int j = 2*i - 1;
			int space = n - i;
			while(space >= 0) {
				System.out.print(" ");
				space = space - 1;
			}
			
			while (j > 0) {
				System.out.print("*");
				j = j - 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
