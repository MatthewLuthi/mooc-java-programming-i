
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();

        ArrayList<MatchResult> matchResults = readRecordsFromFile(file);
        
        System.out.println("Team:");
        String team = scan.nextLine();
        printGamesPlayed(team, matchResults);
        printWinsAndLosses(team, matchResults);
    }
    
    
    //----------------------------------------------------------------------
    private static ArrayList<MatchResult> readRecordsFromFile(String file) {
        ArrayList<MatchResult> matchResults = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String matchResult = fileReader.nextLine();
                
                if (matchResult.isEmpty()) {
                    continue;
                }
                
                String[] matchDetails = matchResult.split(",");
                
                String homeTeam = matchDetails[0];
                String visitingTeam = matchDetails[1];
                int homeTeamPoints = Integer.valueOf(matchDetails[2]);
                int visitingTeamPoints = Integer.valueOf(matchDetails[3]);
                
                matchResults.add(new MatchResult(homeTeam, visitingTeam, 
                        homeTeamPoints, visitingTeamPoints));
            }   
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return matchResults;
    }
    
    //-----------------------------------------------------------------------------------
    private static int getGamesPlayed(String team, ArrayList<MatchResult> matchResults) {
        int gamesPlayed = 0;
        
        for (MatchResult match : matchResults) {
            if (team.equals(match.getHomeTeam()) || team.equals(match.getVisitingTeam())) {
                gamesPlayed++;
            }
        }
        
        return gamesPlayed;
    }
    
    //--------------------------------------------------------------------------------------
    private static void printGamesPlayed(String team, ArrayList<MatchResult> matchResults) {
        System.out.println("Games: " + getGamesPlayed(team, matchResults));
    }
    
    //----------------------------------------------------------------------------------------
    private static void printWinsAndLosses(String team, ArrayList<MatchResult> matchResults) {
        int wins = determineWins(team, matchResults);
        System.out.println("Wins: " + wins);
        
        int losses = determineLosses(team, matchResults);
        System.out.println("Losses: " + losses);
    }
    
    //----------------------------------------------------------------------------------
    private static int determineWins(String team, ArrayList<MatchResult> matchResults) {
        int wins = 0;
        
        for (MatchResult match : matchResults) {
            if (match.isWinningTeam(team)) {
                wins++;
            }
        }
        
        return wins;
    }
    
    //------------------------------------------------------------------------------------
    private static int determineLosses(String team, ArrayList<MatchResult> matchResults) {
        int wins = determineWins(team, matchResults);
        int losses = getGamesPlayed(team, matchResults) - wins;
        
        return losses;
    }

}
