package chapter01.functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] srgs){

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i<10; i++){
			list.add(i);
		}

		//example 2
		List<Integer> odds = new ArrayList<Integer>();

		for(int val : list){
			if(val % 2 ==0){
				odds.add(val);
			}
		}

		for(int val : odds){
			System.out.print(val);
		}

	}

}
