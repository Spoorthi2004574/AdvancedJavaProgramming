//Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj).
package One_b;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_SortColor {

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
		//Sorting the colors
		Collections.sort(colors);
		System.out.println("Colors after sorting:"+colors);
	}

}
