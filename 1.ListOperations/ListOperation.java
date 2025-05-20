//Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList

//and a LinkedList to perform the following operations with different functions directed as
//follows
//1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
//Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
//size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list

package One_a;

import java.util.*;

public class ListOperation {
    public static void main(String[] args) {
        // 1. Adding elements
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Initial ArrayList: " + arrayList);
        System.out.println("Initial LinkedList: " + linkedList);

        // 2. Adding element at specific index
        arrayList.add(1, "Grapes");
        linkedList.add(1, "Grapes");

        System.out.println("\nAfter adding 'Grapes' at index 1:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);

        System.out.println("\nAfter adding multiple elements:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 4. Accessing elements
        System.out.println("\nAccess element at index 2:");
        System.out.println("ArrayList: " + arrayList.get(2));
        System.out.println("LinkedList: " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(2, "Kiwi");
        linkedList.set(2, "Kiwi");

        System.out.println("\nAfter updating element at index 2 to 'Kiwi':");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 6. Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        System.out.println("\nAfter removing 'Banana':");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 7. Searching elements
        System.out.println("\nSearching for 'Apple':");
        System.out.println("ArrayList contains 'Apple'? " + arrayList.contains("Apple"));
        System.out.println("LinkedList contains 'Apple'? " + linkedList.contains("Apple"));

        // 8. List size
        System.out.println("\nSize of the lists:");
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // 9. Iterating over list (enhanced for loop)
        System.out.println("\nIterating using enhanced for loop:");
        System.out.print("ArrayList: ");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }
        System.out.print("\nLinkedList: ");
        for (String fruit : linkedList) {
            System.out.print(fruit + " ");
        }

        // 10. Using Iterator
        System.out.println("\n\nIterating using Iterator:");
        Iterator<String> arrayIterator = arrayList.iterator();
        System.out.print("ArrayList: ");
        while (arrayIterator.hasNext()) {
            System.out.print(arrayIterator.next() + " ");
        }

        Iterator<String> linkedIterator = linkedList.iterator();
        System.out.print("\nLinkedList: ");
        while (linkedIterator.hasNext()) {
            System.out.print(linkedIterator.next() + " ");
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);

        System.out.println("\n\nAfter sorting:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 12. Sublist
        List<String> subArrayList = arrayList.subList(1, 3); // from index 1 to 2
        List<String> subLinkedList = linkedList.subList(1, 3);

        System.out.println("\nSublist from index 1 to 2:");
        System.out.println("ArrayList sublist: " + subArrayList);
        System.out.println("LinkedList sublist: " + subLinkedList);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();

        System.out.println("\nAfter clearing the lists:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
