package io.java.Lecture_5_patterns_2;

import java.util.Scanner;

public class MirrorNumberPattern {

	/*
Coding Problem
Problem Name: Mirror Number Pattern
Problem Level: EASY
Problem Description: #### Print the following pattern for the given N number of rows. 
##### Pattern for N = 4
<br>

<img src="https://ninjasfiles.s3.amazonaws.com/0000000000003723.png" width="35" height="65" />
#### The dots represent spaces.
<br>
<br>
##### Input format : 
    Integer N (Total no. of rows)

##### Output format : 
    Pattern in N lines

##### Constraints
    0 <= N <= 50
 ##### Sample Input 1: 
    3

##### Sample Output 1:
          1 
        12
      123

##### Sample Input 2: 
    4

##### Sample Output 2:
          1 
        12
      123
    1234

	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		in.close();
		
		int i = 1, k;

		while (i <= n) {
			int j = 1;
			k = 1;
			
			int space = 2*(n-i);
			while(space >= 0) {
				System.out.print(" ");
				space = space - 1;
			}
			
			while (j <= i) {
				System.out.print(k);
				k = k + 1;
				j = j + 1;
			}
			
			System.out.println();
			i = i + 1;
		}

	}

}
