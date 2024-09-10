package practice2;

public class ex2 {
    private static class StarTriangle {
        final int maxWidth;

        public StarTriangle( int maxWidth){
           this.maxWidth = maxWidth;
        }

        public String toString () {
            int counter = 1;
            StringBuilder res = new StringBuilder();

            while (counter <= maxWidth) {
                res.append("[*]".repeat(counter) + "\n");
                counter++;
            }

            return res.toString();
        }
    }

    public static void main(String[] args) {
        StarTriangle first = new StarTriangle(10);

        System.out.println(first);
    }
}
