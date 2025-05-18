package program;
import java.util.LinkedList;
import java.util.Iterator;
public class p1c_2 {
	
	    public static void main(String[] args) {
	        // Create and populate the LinkedList
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");

	        // Get the descending iterator
	        Iterator<String> reverseIterator = list.descendingIterator();

	        // Iterate and print elements in reverse order
	        System.out.println("Iterating the list in reverse order:");
	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }

}
