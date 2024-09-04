
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Stack {
    
    private ArrayList<String> stacks;
    
    public Stack() {
        this.stacks = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.stacks.isEmpty();
    }
    
    public void add(String value) {
        this.stacks.add(value);
    }
    
    public ArrayList<String> values() {
        // Returns the values in the stack as an ArrayList
        return new ArrayList<>(this.stacks);
    }
    
    // returns the topmost value (i.e., the last value added to the deque) and removes it from the stack.
    public String take() {
        if (!this.stacks.isEmpty()) {
            return this.stacks.remove(this.stacks.size() - 1);
        } else {
            return null; // Or you could throw an exception if preferred
        }
    }
    
}
