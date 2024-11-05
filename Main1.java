import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] arr = new Player[4];

        // Input for 4 Player objects
        for (int i = 0; i < arr.length; i++) {
            int playerId = sc.nextInt();
            sc.nextLine(); // Consume newline
            String playerName = sc.nextLine();
            int runs = sc.nextInt();
            sc.nextLine(); // Consume newline
            String playerType = sc.nextLine();
            String matchType = sc.nextLine();
            arr[i] = new Player(playerId, playerName, runs, playerType, matchType);
        }

        // Input for playerType to find the player with lowest runs
        String playerType = sc.nextLine();

        // Input for matchType to find players
        String matchType = sc.nextLine();

        // Finding the player with lowest runs for the given player type
        int res = findPlayerWithLowestRuns(arr, playerType);
        if (res == 0) {
            System.out.println("No such Player");
        } else {
            System.out.println(res);
        }

        // Finding players by matchType
        Player[] result = findPlayerByMatchType(arr, matchType);
        if (result == null) {
            System.out.println("No Player with given matchType");
        } else {
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i].getPlayerId());
            }
        }
    }

    // Method to find player with lowest runs based on playerType
    public static int findPlayerWithLowestRuns(Player[] arr, String playerType) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPlayerType().equalsIgnoreCase(playerType)) {
                if (min == 0 || arr[i].getRuns() < min) {
                    min = arr[i].getRuns();
                }
            }
        }
        return min;
    }

    // Method to find players by matchType in descending order of playerId
    public static Player[] findPlayerByMatchType(Player[] arr, String matchType) {
        Player[] refined = new Player[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getMatchType().equalsIgnoreCase(matchType)) {
                refined = Arrays.copyOf(refined, refined.length + 1);
                refined[refined.length - 1] = arr[i];
            }
        }

        Arrays.sort(refined, (a, b) -> b.getPlayerId() - a.getPlayerId());

        if (refined.length == 0) {
            return null;
        } else {
            return refined;
        }
    }
}

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRuns() {
        return runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }
}
