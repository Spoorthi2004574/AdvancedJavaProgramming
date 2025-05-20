//Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
//Collections.swap(l_list, 0, 2))
package One_c;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Swap_ele {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<String>();
		colors.add("green");
		colors.add("orange");
		colors.add("white");
		colors.add("purple");
		colors.add("blue");
		colors.add("red");
		colors.add("lavender");
		//Displaying original list
		System.out.println("Elements before swapping:"+colors);
		//swapping the elements
		Collections.swap(colors, 0, 2);
		System.out.println("Elements after swapping:"+colors);
		
	}
}
