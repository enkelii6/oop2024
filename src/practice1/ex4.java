package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();


        double d = calc_d(a, b, c);
        if (d < 0) {
            System.out.println("No rational roots");
            return;
        }

        System.out.println("Roots are: "+Arrays.toString(calc_roots(a, b, d)));
    }

    private static double calc_d(double a, double b, double c) {
        return a * a - 4 * b * c;
    }

    private static double[] calc_roots(double a, double b, double d) {
        return new double[] {
            (-b + Math.sqrt(d)) / 2 * a, (-b - Math.sqrt(d)) / 2 * a,
        };
    }
}
