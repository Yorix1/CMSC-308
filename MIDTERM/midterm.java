import java.util.*;

public class midterm {

    public static String process(Integer[] arrInput) {
        HashSet<Integer> holiday = new HashSet<Integer>(Arrays.asList(6, 7, 13, 14, 20, 21, 27, 28));

        for (int i : arrInput) {
            holiday.add(i);
        }
        List<Integer> sorted = new ArrayList<Integer>(holiday);
        Collections.sort(sorted);

        String result = String.format("%s %s", sorted.size(), sorted);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> testing = new ArrayList<String>();

        System.out.print("Enter Test Case: ");
        int testcase = sc.nextInt();

        if (testcase > 0) {
            System.out.println("Number of Test Case:" + testcase);
            for (int i = 1; i <= testcase; i++) {
                System.out.println("\nTest Case #" + i);
                System.out.print("Number of Holidays: ");
                int nh = sc.nextInt();

                System.out.print("Days of Holidays: ");
                Integer[] arrInput = new Integer[nh];
                for (int j = 0; j < nh; j++) {
                    arrInput[j] = sc.nextInt();
                }
                testing.add(process(arrInput));
            }
            System.out.println();
            for (int i = 0; i < testing.size(); i++) {
                System.out.println(String.format("Number of Holiday per Test Case %s: %s", i + 1, testing.get(i)));
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
