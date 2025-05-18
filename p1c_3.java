package program;
import java.util.LinkedList;

public class p1c_3 {

	    public static void main(String[] args) {
	        // Create and populate the LinkedList
	        LinkedList<String> l_list = new LinkedList<>();
	        l_list.add("Red");
	        l_list.add("Green");
	        l_list.add("Blue");

	        // Insert "Pink" at the end of the list using offerLast()
	        l_list.offerLast("Pink");

	        // Display the updated list
	        System.out.println("LinkedList after inserting 'Pink' at the end:");
	        for (String color : l_list) {
	            System.out.println(color);
	        }
	    }
}
