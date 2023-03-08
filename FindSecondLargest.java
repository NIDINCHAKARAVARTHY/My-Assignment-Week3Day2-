package week3.day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list= new ArrayList<Integer>();
			list.add(3);
			list.add(2);
			list.add(11);
			list.add(4);
			list.add(6);
			list.add(7);
			Collections.sort(list);
			System.out.println(list);
			int secondLargest= list.get(4);
			
			System.out.println("Second Largest Number Is : " +secondLargest);
		
	}
	}


