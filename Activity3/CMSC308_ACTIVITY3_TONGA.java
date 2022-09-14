import java.util.Scanner;

public class grading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float total = 0, avg;

        System.out.println("Enter the grade of the Student: ");

        System.out.print("Filipino: ");
        int filipino = sc.nextInt();

        System.out.print("Science: ");
        int science = sc.nextInt();

        System.out.print("Math: ");
        int math = sc.nextInt();

        System.out.print("English: ");
        int english = sc.nextInt();

        sc.close();
        total = filipino + science + math + english;

        avg = total / 4;
        System.out.println("\nAverage: " + avg);

        if (avg > 100) {
            System.out.println("Invalid Grade ");
        } else if (avg >= 98 && avg <= 100) {
            System.out.println("With Highest Honors ");
        } else if (avg >= 95 && avg <= 97.99) {
            System.out.println("With High Honors ");
        } else if (avg >= 90 && avg <= 94.99) {
            System.out.println("With Honors ");
        } else if (avg >= 75 && avg <= 89.99) {
            System.out.println("Passed ");
        } else {
            System.out.println("Failed ");
        }
    }
}
