
import java.util.ArrayList;

/**
 *
 * @author Matt
 */
public class GradeHandler {
    private static final int MAX_GRADE = 5;
    private ArrayList<Grade> grades;
    
    public GradeHandler() {
        grades = new ArrayList<>();
    }
    
    public void add(Grade grade) {
        grades.add(grade);
    }
    
    private int numberOfGivenGrade(int grade) {
        int gradeCount = 0;
        
        for (Grade g : grades) {
            if (g.getGrade() == grade) {
                gradeCount++;
            }
        }
        
        return gradeCount;
    }
    
    private double average() {
        int sum = 0;
        for (Grade grade : grades) {
            sum += grade.getPoints();
        }
        
        return 1.0 * sum / grades.size();
    }
    
    private double passingAverage() {
        int sum = 0;
        for (Grade grade : grades) {
            if (grade.passingGrade()) {
                sum += grade.getPoints();
            }
        }
        
        if (numberOfPassingGrades() > 0) {
            return 1.0 * sum / numberOfPassingGrades();
        }
        
        return -1;
    }
    
    private int numberOfPassingGrades() {
        int count = 0;
        for (Grade grade : grades) {
            if (grade.passingGrade()) {
                count++;
            }
        }
        
        return count;
    }
    
    private double passPercentage() {
        double nPassingGrades = 1.0 * numberOfPassingGrades();
        return (100 * nPassingGrades / grades.size());
    }
    
     protected void printGradeDistribution() {
        System.out.println("Grade distribution:");
        
        for (int i = MAX_GRADE; i >= 0; i--) {
            System.out.print(i + ": ");

            int totalCountOfCurrentGrade = numberOfGivenGrade(i);
            for (int j = 0; j < totalCountOfCurrentGrade; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
     
     protected void print() {
        System.out.println("Point average (all): " + average());
        
        if (passingAverage() == -1) {
            System.out.println("Point avearge (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingAverage());
        }
        
        System.out.println("Pass percentage: " + passPercentage());
        printGradeDistribution();
    }
}
