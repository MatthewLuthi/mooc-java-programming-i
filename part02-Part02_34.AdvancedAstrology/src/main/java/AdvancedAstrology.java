
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int spaceWidth = 1;
        int starWidth = 1;
        for (int i = 0; i < size; i++) {
            printSpaces(size - spaceWidth);
            printStars(starWidth);

            spaceWidth++;
            starWidth++;
        }
        
         // let's start from 1 because the first line should have one star!
//        int i = 1;
//        while (i <= size) {
//            printSpaces(size - i);
//            printStars(i);
//            i++;
//        }
    }

    public static void christmasTree(int height) {
        int spaceWidth = 1;
        int starWidth = 1;
        for (int i = 0; i < height; i++) {
            printSpaces(height - spaceWidth);
            printStars(starWidth);
            spaceWidth++;
            starWidth += 2;
        }
        
        //Base (tree trunk) of xmas tree
        int middleOfWidestStarWidth = height - 2;
        for (int i = 0; i < 2; i++) {
            printSpaces(middleOfWidestStarWidth);
            printStars(3);
        }
//        int i = 1;
//        while (i <= height) {
//            printSpaces(height - i);
//            printStars(i + (i - 1));
//            i++;
//        }
//
//        // End then the bottom.
//        printSpaces(height - 2);
//        printStars(3);
//        printSpaces(height - 2);
//        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
