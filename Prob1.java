package com.cg;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry = { 1, -2, 4, 5, 8 ,7 };
		if(new Prob1().getSortedOrder(arry))
			System.out.println("Arry is Sorted.. ");
	}

	private boolean getSortedOrder(int[] arry) {
		boolean isAscending = true;
		//printArry(arry);

		outer: for (int i = 0, j = i+1; i < arry.length - 1; i++, j++) {
			if (arry[i] > arry[j]) {
				System.out.println(arry[i]); 
				int swap = arry[i];
				arry[i] = arry[j];
				arry[j] = swap;
				printArry(arry);
				
				//further chk on whether next arry is sorted or not 
				//if not then return false OW true(arry is sorted)
				
					for (int index = j,nxt = j+1;nxt < (arry.length); index++, nxt++) {
						//nxt = j+1;
						if (arry[index] > arry[nxt]) {
							System.out.println("Found:" + arry[index]+" at index: "+index);
							isAscending = false;
							break outer;
						}
						
					
					}
			
			}
		}
		return isAscending;

	}

	private void printArry(int[] arry) {
		System.out.println("Printing Arry Elements:");
		for (int i : arry) {
			System.out.println(i);
		}

	}

}
