/**
 *
 * @author Matt
 */
public class Grade {
    private int points;
    private int grade;
    
    public Grade() {
        this(0);
    }
    
    public Grade(int points) {
        this.points = points;
        this.grade = calculateGrade();
    }
    
    public boolean passingGrade() {
        return points > 49;
    }
    
    private int calculateGrade() {
        int pendingGrade = 0;
        
        if (!passingGrade()) {
            pendingGrade = 0;
        } else if (points < 60) {
            pendingGrade = 1;
        } else if (points < 70) {
            pendingGrade = 2;
        } else if (points < 80) {
            pendingGrade = 3;
        } else if (points < 90) {
            pendingGrade = 4;
        } else {
            pendingGrade = 5;
        }
        
        return pendingGrade;
    }
    
    public int getPoints() {
        return points;
    }
    
    public int getGrade() {
        return grade;
    }
}
