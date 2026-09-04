public class P1_ExamHallSeatDuplicationChecker {

    /**
     * Scans the full list of assigned seat numbers and flags any duplicates.
     * Uses arrays and nested loops only without Collections.
     *
     * @param seatNumbers Array of seat numbers assigned to students
     */
    public static void checkDuplicateSeats(int[] seatNumbers) {
        if (seatNumbers == null || seatNumbers.length == 0) {
            System.out.println("No Duplicate Seats Found");
            return;
        }

        boolean duplicateFound = false;

        for (int i = 0; i < seatNumbers.length; i++) {
            // Check if seatNumbers[i] was already encountered before index i to avoid duplicate printing
            boolean alreadyProcessed = false;
            for (int k = 0; k < i; k++) {
                if (seatNumbers[k] == seatNumbers[i]) {
                    alreadyProcessed = true;
                    break;
                }
            }

            if (alreadyProcessed) {
                continue;
            }

            // Compare seatNumbers[i] against remaining seat numbers
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        // Test Case 1: Duplicates present
        int[] seats1 = {101, 102, 103, 102, 105};
        checkDuplicateSeats(seats1);

        // Test Case 2: No duplicates
        int[] seats2 = {101, 102, 103, 104, 105};
        checkDuplicateSeats(seats2);
    }
}
