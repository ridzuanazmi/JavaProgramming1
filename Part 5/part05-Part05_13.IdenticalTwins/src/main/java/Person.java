
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {

        // Check if the obj is the same instance as this
        if (this == compared) {
            return true;
        }

        // Check if the obj is an instance of Song
        if (compared == null || getClass() != compared.getClass()) {
            return false;
        }

        // Cast the object to Song
        Person person = (Person) compared;

        return (this.name.equals(person.name) && this.birthday.equals(person.birthday) && this.height == person.height && this.weight == person.weight);
    }
}
