package io.java.Lecture_5_patterns_1;

import java.util.Scanner;

public class AlphaSquarePattern1 {
	/* Print this pattern
	 * ABCD 
	 * BCDE 
	 * CDEF 
	 * DEFG
	 * 
	 */	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

			int n = in.nextInt();
			int i = 1;
			in.close();
			while (i <= n) {
				int j = 1;
				char jthChar = (char)('A' + i - 1);
				while (j <= n) {
					System.out.print(jthChar);
					jthChar = (char)(jthChar + 1);
					j = j + 1;
				}
				System.out.println();
				i = i + 1;
			}
	}

}
