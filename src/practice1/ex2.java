package practice1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float side = sc.nextFloat();

        System.out.println("Area: "+calc_area(side));
        System.out.println("Perimeter: "+calc_perimeter(side));
        System.out.println("Diagonal: "+calc_diagonal(side));
    }

    private static float calc_area(float side) {
        return side * side;
    }

    private static float calc_perimeter(float side) {
        return side * 4;
    }

    private static double calc_diagonal(float side) {
        return side * Math.sqrt(2);
    }
}
