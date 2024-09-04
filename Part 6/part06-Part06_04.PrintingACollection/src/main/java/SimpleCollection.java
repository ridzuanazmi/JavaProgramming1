
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

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        // StringBuilder is better and efficient to accumulate Strings
        StringBuilder output = new StringBuilder("The collection " + this.name + " has " + this.elements.size() + " element");

        // for more than 1 element in array list
        if (this.elements.size() > 1) {
            output.append("s");
        }

        output.append(":\n");

        for (String element : this.elements) {
            output.append(element).append("\n");
        }

        return output.toString().trim();  // Trims the last newline character
    }

}
