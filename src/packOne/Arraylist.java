package packOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

	public static void main(Str[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Pratik Kadam");
		arr.add(1, "Index One");
		arr.add(2, "Index Two");
		arr.add(3, "three");
		System.out.println(arr.get(1));
		System.out.println("++++++++++++");
		
		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("************");
		for (String a :arr) {
			System.out.println(a);
		}
		System.out.println(arr.contains("index two"));
		
		String [] arr1 = {"Vishal","Kadam","Nilesh"};
		List<String> s =Arrays.asList(arr1);
		System.out.println(s.contains("Kadam"));
	}
}
