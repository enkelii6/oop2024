package practice2;

public class ex3 {
    private static class Time {
        private int hour;
        private int minute;
        private int second;

        public Time(int hour, int minute, int second) {
            this.hour = hour % 24;
            this.minute = minute % 60;
            this.second = second % 60;
        }

        public String toUniversal() {
            return hour + ":" + minute + ":" + second;
        }

        public String toStandard() {
            if (hour > 12) {
                return (hour - 12) + ":" + minute + ":" + second + " PM";
            }

            return hour + ":" + minute + ":" + second + " AM";
        }

        public void add(Time time) {
            this.hour += time.hour % 24;
            this.minute += time.minute % 60;
            this.second += time.second % 60;
        }
    }

    public static void main(String[] args) {
        Time t1 = new Time(16, 10, 0);
        Time t2 = new Time(9, 10, 1);

        System.out.println(t1.toUniversal());
        System.out.println(t1.toStandard());
        System.out.println(t1.toUniversal());
        System.out.println(t2.toUniversal());
        System.out.println(t2.toStandard());

        t1.add(t2);
        System.out.println(t1.toUniversal());
    }
}
