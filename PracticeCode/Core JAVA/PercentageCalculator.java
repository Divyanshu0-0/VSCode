import java.util.Scanner;

public class PercentageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }

        System.out.print("Enter the total possible marks: ");
        double maxMarks = scanner.nextDouble();

       
        double percentage = (totalMarks / maxMarks) * 100;

        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}