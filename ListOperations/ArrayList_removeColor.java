//Write a java program for getting different colors through ArrayList interface and remove the
//2nd element and color "Blue" from the ArrayList
package One_b;

import java.util.ArrayList;

public class ArrayList_removeColor {

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
       //To remove 2nd element
		colors.remove(2);
		System.out.println("Colors after removing 2nd element:"+colors);
		//To remove blue color
		colors.remove("blue");
		System.out.println("Colors after removing blue color:"+colors);
	}

}
