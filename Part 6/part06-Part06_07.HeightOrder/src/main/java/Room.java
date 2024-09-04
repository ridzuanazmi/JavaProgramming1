
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
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (isEmpty()) {
            return null;
        }
        
        Person shortestPerson = this.persons.get(0);
        for (int i = 1; i < this.persons.size(); i++) {
            if (this.persons.get(i).getHeight() < shortestPerson.getHeight()) {
                shortestPerson = this.persons.get(i);
            }
        }
        return shortestPerson;
    }
    
    public Person take() {
        if (isEmpty()) {
            return null;
        }
        Person shortestPerson = this.shortest();  // Find the shortest person
        this.persons.remove(shortestPerson);  // Remove the shortest person from the room
        return shortestPerson;  // Return the shortest person
    }

}
