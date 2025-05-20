package One_c;

import java.util.LinkedList;

public class LinkedList_display_ele_pos {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<String>();
		colors.add("green");
		colors.add("orange");
		colors.add("white");
		colors.add("purple");
		colors.add("blue");
		colors.add("red");
		colors.add("lavender");
//		Display elements with their positions using get(index)
        System.out.println("Elements and their positions in the LinkedList:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
	}
	}
}
