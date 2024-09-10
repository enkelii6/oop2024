package practice2;

import java.util.UUID;

public class ex1 {
    private static class Student {
        private String name;
        private final UUID id;
        private int yearOfStudy;

        public Student(String name, int yearOfStudy) {
            this.name = name;
            this.yearOfStudy = yearOfStudy;
            this.id = UUID.randomUUID();
        }

        public String getName() {
            return name;
        }

        public UUID getId() {
            return id;
        }

        public void incrementYearOfStudy() {
            this.yearOfStudy++;
        }
    }

    public static void main(String[] args) {
        Student gleb = new Student("gleb", 2023);
        Student ernur = new Student("ernur", 2023);

        System.out.println(gleb.yearOfStudy);
        gleb.incrementYearOfStudy();
        System.out.println(gleb.yearOfStudy);

        System.out.println(ernur.getName());
        System.out.println(ernur.getId());
    }
}
