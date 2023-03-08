package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		 
		int [] arr = {1,2,3,4,7,6,8};
		List<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < arr.length-1; i++) {
			num.add(arr[i]);
			}
		Collections.sort(num);
		for (int i = 0; i < arr.length; i++) {
			if(num.get(i)!=(i+1)) {
				System.out.println((i+1));
				break;
			}
		}
		
}
}