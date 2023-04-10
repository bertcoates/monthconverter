public class DateConverter {

    /** Take a string input, convert to lowercase, strip whitespaces, and evaluate the first three
     * characters to see if it corresponds to a month, then return the corresponding month number
     *
     * @return The number of the month; returns zero if invalid input
     * */

    public static int getMonthNumber(String month) {
        switch (month.toLowerCase().strip().substring(0,3)) {
            case "jan":
                return 1;
            case "feb":
                return 2;
            case "mar":
                return 3;
            case "apr":
                return 4;
            case "may":
                return 5;
            case "jun":
                return 6;
            case "jul":
                return 7;
            case "aug":
                return 8;
            case "sep":
                return 9;
            case "oct":
                return 10;
            case "nov":
                return 11;
            case "dec":
                return 12;
            default:
                return 0;
        }


    }



}
