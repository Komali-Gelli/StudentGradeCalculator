import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();

        int[] marks = new int[subjects];

        int total = 0;

        for (int i = 0; i < subjects; i++) {

            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            total += marks[i];
        }

        double average = (double) total / subjects;

        String grade;

        if (average >= 90) {
            grade = "A+";
        } 
        else if (average >= 80) {
            grade = "A";
        } 
        else if (average >= 70) {
            grade = "B";
        } 
        else if (average >= 60) {
            grade = "C";
        } 
        else if (average >= 50) {
            grade = "D";
        } 
        else {
            grade = "F";
        }

        System.out.println("\n=================================");
        System.out.println("       STUDENT GRADE RESULT");
        System.out.println("=================================");

        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}