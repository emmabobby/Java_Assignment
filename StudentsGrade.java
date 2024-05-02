import java.util.Scanner;

public class StudentScoresApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        String[] students = new String[numberOfStudents];
        String[] subjects = new String[numberOfSubjects];
        double[][] scores = new double[numberOfStudents][numberOfSubjects];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            students[i] = scanner.next();
        }

               for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjects[i] = scanner.next();
       