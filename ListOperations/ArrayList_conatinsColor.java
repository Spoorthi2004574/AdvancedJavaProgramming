//Write a java program for getting different colors through ArrayList interface and search whether
//the color "Red" is available or not.
package One_b;
import java.util.*;
public class ArrayList_conatinsColor {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
			colors.add("green");
			colors.add("orange");
			colors.add("white");
			colors.add("purple");
			colors.add("red");
			colors.add("lavender");
			//Colors in arraylist
			System.out.println(colors);
			//To check whether the red color present in arraylist or not
			System.out.println("Is the arraylist consist of red color:"+ colors.contains("red"));
	}
}
