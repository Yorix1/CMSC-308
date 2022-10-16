import java.util.Scanner;
import com.java.impcalc.*;

public class calculator {
    public static void main(String[] args) {
        impcalc calc = new impcalc();
        double first, second;
        double total = 0;
        int input;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\nTHE CALCULATOR");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponent");
            System.out.println("6. Modulo");
            System.out.println("7. Exit");
            System.out.println("Choose An Option: ");
            input = sc.nextInt();

            System.out.println("You Chose Option #" + input);
            switch (input) {
                case 1:
                System.out.println("Enter Augend: ");
                first = sc.nextInt();
                System.out.println("Enter Addend: ");
                second = sc.nextInt();
                calc.addition(first, second);
                System.out.println("The Sum of "+ first +" and "+ second+ " is "+ calc.addition(first, second));
                    break;

                case 2:
                System.out.println("Enter Minuend: ");
                first = sc.nextInt();
                System.out.println("Enter Subtrahend: ");
                second = sc.nextInt();
                calc.subtraction(first, second);
                System.out.println("The Difference of "+ first +" and "+ second+ " is "+ calc.subtraction(first, second));
                break;

                case 3:
                System.out.println("Enter Multiplicand: ");
                first = sc.nextInt();
                System.out.println("Enter Multiplier: ");
                second = sc.nextInt();
                calc.multiplication(first, second);
                System.out.println("The Product of "+ first +" and "+ second+ " is "+ calc.multiplication(first, second));
                break;

                case 4:
                System.out.println("Enter Dividend: ");
                first = sc.nextInt();
                System.out.println("Enter Divisor: ");
                second = sc.nextInt();
                calc.division(first, second);
                System.out.println("The Quotient of "+ first +" and "+ second+ " is "+ calc.division(first, second));
                break;

                case 5:
                System.out.println("Enter Base Number: ");
                first = sc.nextInt();
                System.out.println("Enter Exponent: ");
                second = sc.nextInt();
                calc.exponent(first, second, total);
                System.out.println(first+" raise to " + second+ " is "+ calc.exponent(first, second, total));
                break;

                case 6:
                System.out.println("Enter Dividend: ");
                first = sc.nextInt();
                System.out.println("Enter Divisor: ");
                second = sc.nextInt();
                calc.modulo(first, second);
                System.out.println("The Remainder of "+ first +" and "+ second+ " is "+ calc.modulo(first, second));
                break;
                case 7:
                System.exit(0);
                break;
                default:
                System.out.println("Invalid Input!");
                    break;
            }
        } while (input !=7);
    }
}
