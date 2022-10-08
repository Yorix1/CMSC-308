import java.util.Scanner;

public class calculator {

    public static double addition(double first, double second) {
        return first + second;
    }
    public static double subtraction(double first, double second) {
        return first - second;
    }
    public static double multiplication(double first, double second) {
        return first * second;
    }
    public static double division(double first, double second) {
        return first / second;
    }
    public static double exponent(double first, double second, double total) {
        return total = Math.pow(first, second);
    }
    public static double modulo(double first, double second) {
        return first % second;
    }
    public static void main(String[] args) {
        double first, second;
        double total = 0;
        int input;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("THE CALCULATOR\n");
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
                addition(first, second);
                System.out.println("The Sum of "+ first +" and "+ second+ " is "+ addition(first, second));
                    break;

                case 2:
                System.out.println("Enter Minuend: ");
                first = sc.nextInt();
                System.out.println("Enter Subtrahend: ");
                second = sc.nextInt();
                subtraction(first, second);
                System.out.println("The Difference of "+ first +" and "+ second+ " is "+ subtraction(first, second));
                break;

                case 3:
                System.out.println("Enter Multiplicand: ");
                first = sc.nextInt();
                System.out.println("Enter Multiplier: ");
                second = sc.nextInt();
                multiplication(first, second);
                System.out.println("The Product of "+ first +" and "+ second+ " is "+ multiplication(first, second));
                break;

                case 4:
                System.out.println("Enter Dividend: ");
                first = sc.nextInt();
                System.out.println("Enter Divisor: ");
                second = sc.nextInt();
                division(first, second);
                System.out.println("The Quotient of "+ first +" and "+ second+ " is "+ division(first, second));
                break;

                case 5:
                System.out.println("Enter Base Number: ");
                first = sc.nextInt();
                System.out.println("Enter Exponent: ");
                second = sc.nextInt();
                exponent(first, second, total);
                System.out.println(first+" raise to " + second+ " is "+ exponent(first, second, total));
                break;

                case 6:
                System.out.println("Enter Dividend: ");
                first = sc.nextInt();
                System.out.println("Enter Divisor: ");
                second = sc.nextInt();
                modulo(first, second);
                System.out.println("The Remainder of "+ first +" and "+ second+ " is "+ modulo(first, second));
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
