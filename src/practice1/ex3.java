package practice1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ex3 {
    private static final TreeMap<Integer, String> gradeMap = new TreeMap<>();

    static {
        gradeMap.put(95, "A+");
        gradeMap.put(90, "A");
        gradeMap.put(85, "A-");
        gradeMap.put(80, "B+");
        gradeMap.put(70, "B");
        gradeMap.put(65, "C");
        gradeMap.put(60, "D+");
        gradeMap.put(50, "D");
        gradeMap.put(0, "F");
    }

    private static String getGrade(int grade) {
        Map.Entry<Integer, String> entry = gradeMap.floorEntry(grade);
        return grade > 0 ? entry.getValue() : "Invalid Grade";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Grade: "+getGrade(sc.nextInt()));
    }


}
