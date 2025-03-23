/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

package Module_2.SportsTeamApp;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName = "";
    private String[] players = new String[20];
    private int playerCount = 0;

    /**
     * Argument Constructor that creates a team with the team name
     * 
     * @param teamName
     */
    public Team(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Method which add players to the team and print a message when player is not
     * added to the team on reaching the limit of the team size
     * 
     * @param playerName
     */
    public void addPlayer(String playerName) {

        if (playerCount < players.length) { // if the number of players added so far is less than the players size defined , proceed to add the next player
            players[playerCount] = playerName;
            playerCount++;
        } else {
            if (playerCount == players.length) { // if the players added reached the players size, do not add the player
                System.out.print("\n");
                System.out.print("  Player: " + playerName + " not added in the team\n");
            }
        }
    } // end addPlayer

    /**
     * Method which returns the name of the players added in the team by removing
     * any null elements in the array
     * 
     * @return players in the team in an array
     */
    public String[] getPlayers() {
        List<String> playersListWithoutNullValues = new ArrayList<>();
        for (String player : players) {
            if (player != null) // if array has null values, ignore them while adding to the list
                playersListWithoutNullValues.add(player);
        }
        return playersListWithoutNullValues.toArray(new String[0]);
    } // end getPlayers

    /**
     * Method which returns the count of total players added in the team
     * 
     * @return player count
     */
    public int getPlayerCount() {
        return playerCount;
    } // end getPlayerCount

    /**
     * Method which returns the name of the team
     * 
     * @return team name
     */
    public String getTeamName() {
        return teamName;
    } // end getTeamName

}
