/*
Array revesal using Collection.functionName(Arrays.asList(array))
this method is less efficient but smaller code
average time taken - 150ms
*/

import java.util.*;

public class Main {

	// function reverses the elements of the array
	static void reverse(Integer a[]) {

    //Collection is a class and reverse is the function
		Collections.reverse(Arrays.asList(a)); 
		System.out.println(Arrays.asList(a));   
	}

	public static void main(String[] args) {

		Integer [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		reverse(arr);
	}
}
