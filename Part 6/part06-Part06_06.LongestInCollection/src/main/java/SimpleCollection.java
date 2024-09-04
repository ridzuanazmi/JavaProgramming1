
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
     public String longest() {
        if (this.elements.isEmpty()) {
            return null; // Return null if the collection is empty
        }

        String longest = this.elements.get(0);

        for (String element : this.elements) {
            if (element.length() > longest.length()) {
                longest = element; // Update longest if the current element is longer
            }
        }

        return longest; // Return the longest string found
    }

}
