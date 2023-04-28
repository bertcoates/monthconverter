public class DateConverter {

    /** Take a string input, convert to lowercase, strip whitespaces, and evaluate the first three
     * characters to see if it corresponds to a month, then return the corresponding month number
     *
     * @return The number of the month; returns zero if invalid input
     * */

    public static int getMonthNumber(String month) {
        return switch (month.toLowerCase().strip()) {
            case "jan", "january" -> 1;
            case "feb", "february" -> 2;
            case "mar", "march" -> 3;
            case "apr", "april" -> 4;
            case "may" -> 5;
            case "jun", "june" -> 6;
            case "jul", "july" -> 7;
            case "aug", "august" -> 8;
            case "sep", "sept", "september" -> 9;
            case "oct", "october" -> 10;
            case "nov", "november" -> 11;
            case "dec", "december" -> 12;
            default -> 0;
        };


    }



}
