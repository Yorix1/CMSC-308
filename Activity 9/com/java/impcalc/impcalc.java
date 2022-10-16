package com.java.impcalc;

public class impcalc {
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
}
