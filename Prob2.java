package com.cg;

import java.util.ArrayList;
import java.util.List;

public class Prob2 {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, -1, 2, 5,6};
		Prob2 solObj =new Prob2();
		System.out.println("Length:"+solObj.solution(arr));
		
	}

	public int solution(int[] A) {
		//int[] B = new int[A.length];
		List<Integer> list= new ArrayList<>();
		//B[0]=A[0];
		list.add(0,A[0]);
		//int index=B[0];
		int newIdx = A[0];
		int cnt=0;
		
		for(int i=1;i<A.length;i++){
			if(newIdx<0){
				break;
			}
			list.add(i,A[newIdx]);
			//B[i]=A[newIdx];
			newIdx = A[newIdx];
		}
		System.out.println(list);
		return list.size();
	}

	

	private void printArry(int[] arry) {
		System.out.println("Printing Arry Elements:");
		for (int i : arry) {
			System.out.println(i);
		}

	}

}
