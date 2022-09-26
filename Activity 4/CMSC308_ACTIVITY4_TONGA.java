import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class pamasahe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<String>();

        System.out.println("Enter Test Case: ");
        int test = sc.nextInt();
        if (test >= 1 && test <= 10) {
            System.out.println("Test Case Number: " + test);
            for (int i = 1; i <= test; i++) {
                System.out.println("\nTest Case No. " + i);
                System.out.print("Enter Uber Fee: ");
                int uber = sc.nextInt();
                if (uber >= 1 && uber <= 1000) {
                    System.out.print("Enter Grab Fee: ");
                    int grab = sc.nextInt();
                    if (grab >= 1 && grab <= 1000) {
                        result.add(toCompare(uber, grab));
                    } else {
                        result.add("Error");
                    }
                } else {
                    result.add("Error");
                }
            }
        }
        System.out.println("\nResult: ");
        for (String string : result) {
            System.out.println(string);
        }
    }

    public static String toCompare(int uber, int grab) {
        if (uber < grab) {
            return "First";
        } else if (uber > grab) {
            return "Second";
        } else {
            return "Both";
        }
    }
}
