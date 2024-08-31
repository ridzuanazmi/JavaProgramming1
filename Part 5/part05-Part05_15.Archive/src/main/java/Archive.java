/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Archive {
    
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public boolean equals(Object compared) {

        // Check if the obj is the same instance as this
        if (this == compared) {
            return true;
        }

        // Check if the obj is an instance of Song
        if (!(compared instanceof Archive)) {
            return false;
        }

        // Cast the object to Song
        Archive item = (Archive) compared;

        return this.identifier.equals(item.getIdentifier());
    }
    
}
