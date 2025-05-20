//Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast("Pink"))
package One_c;

import java.util.LinkedList;

public class LinkedList_insertAtPos {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<String>();
		colors.add("green");
		colors.add("orange");
		colors.add("white");
		colors.add("purple");
		colors.add("blue");
		colors.add("red");
		colors.add("lavender");
		//Elements before inserting at last
		System.out.println("Before inserting:"+colors);
		//adding elements at the end of the list
		colors.offerLast("pink");
		System.out.println("After inserting:"+colors);		
	}

}
