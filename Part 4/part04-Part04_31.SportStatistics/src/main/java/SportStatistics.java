
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team?");
        String teamName = scan.nextLine();

        int winCounter = 0, loseCounter = 0, gameCounter = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitorPoints = Integer.valueOf(parts[3]);

                // Check if the team was involved in the game
                if (homeTeam.equals(teamName) || visitingTeam.equals(teamName)) {
                    gameCounter++;

                    // Determine win/lose for the specified team
                    if ((homeTeam.equals(teamName) && homePoints > visitorPoints)
                            || (visitingTeam.equals(teamName) && visitorPoints > homePoints)) {
                        winCounter++;
                    } else {
                        loseCounter++;
                    }
                }
            }
            System.out.println("Games: " + gameCounter);
            System.out.println("Wins: " + winCounter);
            System.out.println("Losses: " + loseCounter);

        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
            System.out.println("Error: " + e.getMessage());
        }

    }

}
