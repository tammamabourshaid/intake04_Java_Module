package Refliction.Refliction_190201;


public class solsticeFormulor {

    DateTime summerSolstice;

    DateTime winterSolstice;

    public solsticeFormulor(final int year) {
        final double m, summerSolstice, winterSolstice;
        m = ((double) year - 2000) / 1000;
        final double m2 = m * m;
        final double m3 = m2 * m;
        final double m4 = m3 * m;

        summerSolstice = 2451716.56767 + 365241.62603 * m + 0.00325 * m2 + 0.00888 * m3
                - 0.00030 * m4;
        this.summerSolstice = toDate(summerSolstice);

        winterSolstice = 2451900.05952 + 365242.74049 * m - 0.06223 * m2 - 0.00823 * m3
                + 0.00032 * m4;
        this.winterSolstice = toDate(winterSolstice);
    }

    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.toString());
    }

    public DateTime getSummerSolstice() {
        return summerSolstice;
    }

    public DateTime getWinterSolstice() {
        return winterSolstice;
    }

    private DateTime toDate(final double jdn) {
        final double p = Math.floor(jdn + 0.5);
        final double s1 = p + 68569;
        final double n = Math.floor(4 * s1 / 146097);
        final double s2 = s1 - Math.floor((146097 * n + 3) / 4);
        final double i = Math.floor(4000 * (s2 + 1) / 1461001);
        final double s3 = s2 - Math.floor(1461 * i / 4) + 31;
        final double q = Math.floor(80 * s3 / 2447);
        final double e = s3 - Math.floor(2447 * q / 80);
        final double s4 = Math.floor(q / 11);

        final double mm = q + 2 - 12 * s4;
        final double yy = 100 * (n - 49) + i + s4;
        final double dd = e + jdn - p + 0.5;


        return new DateTime();
    }

    public static class DateTime {

        private static final long serialVersionUID = -8184768383256338584L;

        private int year;
        private int month;
        private int day;


        DateTime() {
            this.year = year;
            this.month = month;
            this.day = day;

        }


        public int getYear() {
            return year;
        }


        public int getMonth() {
            return month;
        }


        public int getDay() {
            return day;
        }

        @Override
        public String toString() {
            return String.valueOf(year + " | " + month + " | " + day);
        }
    }
}


