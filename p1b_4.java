package program;
import java.util.ArrayList;
import java.util.List;
public class p1b_4 {
	
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the ArrayList
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Display the original list
	        System.out.println("Original Color List: " + colors);

	        // Extract the 1st and 2nd elements using subList (indexes 0 and 1)
	        List<String> subColors = colors.subList(0, 2);

	        // Display the sublist
	        System.out.println("Extracted Colors (1st and 2nd): " + subColors);
	    }
}
