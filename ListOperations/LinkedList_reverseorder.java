//Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())
package One_c;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_reverseorder {

	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<String>();
		colors.add("green");
		colors.add("orange");
		colors.add("white");
		colors.add("purple");
		colors.add("blue");
		colors.add("red");
		colors.add("lavender");
		ListIterator<String> iterator=colors.listIterator(colors.size());
		System.out.println("Colors in reverse order:");
		while(iterator.hasPrevious()) {
			 String color=iterator.previous();
			 System.out.println(color);
		}
	}

}
