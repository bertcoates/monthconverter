public class Main {

    public static void main(String[] args) {
        // Test data set that will cover all eventualities
        String[] months = { "Jan", "february", "march", "apr", "May", "June ",
                "July", "august", "Sep", "oct", "November", "December", "Java", "Programming", "June   ", "  August " };
        // iterate through each string in the array
        for (String month : months) {
            // If the DateConverter exits returning a zero, highlight input as invalid
            if (DateConverter.getMonthNumber(month) == 0) {
                // Display error message for input
                System.out.println(month + " is not recognised as a month by the converter; please try again");
            } else {
                // Display month number
                System.out.println(month + " is month: " + DateConverter.getMonthNumber(month));
            }
        }
    }
}