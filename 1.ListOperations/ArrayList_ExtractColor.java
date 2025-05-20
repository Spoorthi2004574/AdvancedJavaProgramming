//Write a java program for getting different colors through ArrayList interface and extract the
//elements 1st and 2nd from the ArrayList object by using SubList().

package One_b;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ExtractColor {

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
		//Getting the sublist
		List<String> sublist=colors.subList(0,2);
		System.out.println("Sublist:"+sublist);
	}

}
