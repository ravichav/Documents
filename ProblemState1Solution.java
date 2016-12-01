package com.cg;

public class ProblemState1Solution {

	public static void main(String[] args) {
		int[] arry = {0, 1, 3, 1, 4, 1, 0, -3, 2, 3};
		new ProblemState1Solution().getDepthOfPit(arry);
	}

	// The depth of a pit (P, Q, R) is the number min {A[P] − A[Q], A[R] −
	// A[Q]}.
	private int getDepthOfPit(int[] arry) {
		boolean isAscending = true;
		outer: for (int i = 0, j = i + 1, r = i + 2; i < arry.length - 1; i++, j++, r++) {
			if (arry[i] > arry[j]) {
				System.out.println("1st Diff: "+(arry[i] - arry[j])+" found at index: "+i+","+j);
				if (arry[r] > arry[j]) {
					System.out.println("2nd Diff: "+(arry[r] - arry[j])+" found at index: "+j+","+r);
					int min = Math.min((arry[i] - arry[j]), (arry[r] - arry[j]));
					System.out.println("Min:" + min);
					printArry(arry);
					return min;
				}

			}
		}
		return -1;

	}

	private void printArry(int[] arry) {
		System.out.println("Printing Arry Elements:");
		for (int i : arry) {
			System.out.println(i);
		}

	}

}
