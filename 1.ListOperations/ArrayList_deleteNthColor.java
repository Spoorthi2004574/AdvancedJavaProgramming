//Write a java program for getting different colors through ArrayList interface and delete nth
//element from the ArrayList object by using remove by index.
package One_b;

import java.util.ArrayList;

public class ArrayList_deleteNthColor {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("green");
		colors.add("orange");
		colors.add("white");
		colors.add("purple");
		colors.add("blue");
		colors.add("red");
		colors.add("lavender");
		//Colors in arraylist
		System.out.println("Colors:"+colors);
		//deleting nth element
		colors.remove(colors.size()-1);
		System.out.println("Colors after removing nth element:"+colors);

	}

}
