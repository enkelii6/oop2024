package practice1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double init = sc.nextDouble();
        double percent = sc.nextDouble();

        System.out.println(calc_value(init, percent));
    }

    private static double calc_value(double init, double percent) {
        return init * (1 + percent / 100);
    }
}
