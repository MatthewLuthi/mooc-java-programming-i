/**
 *
 * @author Matt
 */
public class MatchResult {
    private String homeTeam, visitingTeam;
    private int homeTeamPoints, visitingTeamPoints;
    
    public MatchResult(String homeTeam, String visitingTeam,
            int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }
    
    public boolean isWinningTeam(String team) {
        if (team.equals(homeTeam)) {
            if (homeTeamPoints > visitingTeamPoints) {
                return true;
            }
        }
        
        if (team.equals(visitingTeam)) {
            if (visitingTeamPoints > homeTeamPoints) {
                return true;
            }
        }
        
        return false;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public int getHomeTeamPoints() {
        return homeTeamPoints;
    }

    public int getVisitingTeamPoints() {
        return visitingTeamPoints;
    }
    
    
}
