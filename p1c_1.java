package program;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class p1c_1 {
		    public static void main(String[] args) {
	        // Create and populate the LinkedList
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");
	        list.add("Elderberry");

	        // Start iteration from the second position (index 1)
	        ListIterator<String> iterator = list.listIterator(1);

	        // Iterate and print the elements
	        System.out.println("Iterating from the 2nd element:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	
}
