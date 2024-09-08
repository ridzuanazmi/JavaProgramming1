
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!"); // Proper message when ending the program
                break;
            }

            switch (command) {
                case "add":
                    System.out.println("Word:");
                    String word = scanner.nextLine();
                    System.out.println("Translation:");
                    String translation = scanner.nextLine();
                    this.simpleDictionary.add(word, translation);
                    break;
                case "search":
                    System.out.println("To be translated:");
                    String tbt = scanner.nextLine();
                    String translated = this.simpleDictionary.translate(tbt);
                    if (translated != null) {
                        System.out.println("Translation: " + translated);
                    } else {
                        System.out.println("Word " + tbt + " was not found"); // More descriptive error message
                    }   break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
