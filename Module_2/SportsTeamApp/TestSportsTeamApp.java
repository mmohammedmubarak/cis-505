/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

package Module_2.SportsTeamApp;

import java.util.Scanner;

public class TestSportsTeamApp {

    public static void main(String[] args) {
        printIndentedWithTwoSpaces("Welcome to the Sports Team App\n");
        Scanner scanner = new Scanner(System.in);
        String continueWithAnotherTeam = "y";
        while (continueWithAnotherTeam.equals("y")) { // while loop to continue adding more teams until the user does
                                                      // not input 'y'
            System.out.print("\n");
            String teamName = "";
            while (teamName.trim().equals("")) { // while loop to continue asking the user to enter a name for the team
                printIndentedWithTwoSpaces("Enter a team name: ");
                teamName = scanner.nextLine();
            }
            Team team = new Team(teamName); // create an object with the team name
            System.out.print("\n");
            printIndentedWithTwoSpaces("Enter the player names:\n");
            printIndentedWithTwoSpaces("  hint: use commas for multiple players and no spaces: ");
            String playerNamesCommaSeparated = scanner.nextLine();
            if (!playerNamesCommaSeparated.equals("")) { // check if the players name are entered
                String[] playerNames = playerNamesCommaSeparated.split(","); // split the entered string by comma
                for (String playerName : playerNames) {
                    team.addPlayer(playerName); // call add player method to add the player to the team
                }
                if (playerNames.length > team.getPlayers().length) { // check if the number of players added is more
                                                                     // than team size defined
                    System.out.print("\n");
                    printIndentedWithTwoSpaces("Max Players Allowed in the team: " + team.getPlayers().length);
                    System.out.print("\n");
                }
            }
            System.out.print("\n");
            printIndentedWithTwoSpaces("--Team Summary--\n");
            printIndentedWithTwoSpaces("Team name: " + team.getTeamName() + "\n");
            printIndentedWithTwoSpaces("Number of players in team: " + team.getPlayerCount() + "\n");
            printIndentedWithTwoSpaces("Players on team: ");
            int counter = 0;
            for (String playerName : team.getPlayers()) { // for loop to print the names as comma separated
                System.out.print(playerName);
                counter++;
                if (counter != team.getPlayers().length) { // check if this is the last player
                    System.out.print(",");
                }
            }
            System.out.println("\n");
            printIndentedWithTwoSpaces("Continue? (y/n):");
            continueWithAnotherTeam = scanner.nextLine();
        }
        System.out.println("\n");
        scanner.close();
        printIndentedWithTwoSpaces("End of line...");
    } // end main

    /**
     * Method which prints the message by prefixing with two spaces as per
     * assignment guidelines
     * 
     * @param printMessage
     */
    public static void printIndentedWithTwoSpaces(String printMessage) {
        System.out.print("  " + printMessage);
    } // end printIndentedWithTwoSpaces
}
