package practice1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        System.out.println('+' + "-".repeat(name.length()) + '+');
        System.out.println('|' + name + '|');
        System.out.println('-' + "-".repeat(name.length()) + '-');
    }
}
