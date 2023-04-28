public class DateConverter {

    /** Take a string input, convert to lowercase, strip whitespaces, and evaluate the first three
     * characters to see if it corresponds to a month, then return the corresponding month number
     *
     * @return The number of the month; returns zero if invalid input
     * */

    public static int getMonthNumber(String month) {
        switch (month.toLowerCase().strip()) {
            case "jan":
            case "january":
                return 1;
            case "feb":
            case "february":
                return 2;
            case "mar":
            case "march":
                return 3;
            case "apr":
            case "april":
                return 4;
            case "may":
                return 5;
            case "jun":
            case "june":
                return 6;
            case "jul":
            case "july":
                return 7;
            case "aug":
            case "august"
                return 8;
            case "sep":
            case "sept":
            case "september":
                return 9;
            case "oct":
            case "october":
                return 10;
            case "nov":
            case "november":
                return 11;
            case "dec":
            case "december":
                return 12;
            default:
                return 0;
        }


    }



}
