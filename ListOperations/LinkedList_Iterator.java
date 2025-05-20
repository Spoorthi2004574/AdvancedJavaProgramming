//Write a Java program to iterate through all elements in a linked list starting at the
//specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))

package One_c;

import java.util.ListIterator;
import java.util.List;
import java.util.LinkedList;

public class LinkedList_Iterator {

	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<String>();
		colors.add("green");
		colors.add("orange");
		colors.add("white");
		colors.add("purple");
		colors.add("blue");
		colors.add("red");
		colors.add("lavender");
		ListIterator<String> iterator = colors.listIterator(1);
		System.out.println("Iterating from 2nd Index:");
		while(iterator.hasNext()) {
			String color = iterator.next();
			System.out.println(color);
		}

	}

}
