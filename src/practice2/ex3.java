package practice2;

public class ex3 {
    private static class Time {
        private int hour;
        private int minute;
        private int second;

        public Time(int hour, int minute, int second) throws TimeException {
            if (hour <= 24 & hour >= 0 ) {
                this.hour = hour;
            } else {
                throw new TimeException("Please provide a valid hour (0-24)");
            }

            if (minute <= 59 & minute >= 0) {
                this.minute = minute;
            } else {
                throw new TimeException("Please provide a valid minute (0-59)");
            }

            if (second <= 59 & second >= 0) {
                this.second = second;
            } else {
                throw new TimeException("Please provide a valid second (0-59)");
            }
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
            this.hour += time.hour;
            this.minute += time.minute;
            this.second += time.second;

            if (this.second >= 60) {
                this.second -= 60;
            }
            if (this.minute >= 60) {
                this.minute -= 60;
            }
            if (this.hour >= 24) {
                this.hour -= 24;
            }
        }
    }


    public static class TimeException extends Exception {
        public TimeException(String message) {
            super();
        }
    }

    public static void main(String[] args) throws TimeException {
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
