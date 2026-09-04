public class P3_TrafficSignalStreakAnalyzer {

    /**
     * Scans through the signal log string and tracks the longest streak of consecutive identical characters.
     *
     * @param signalLog String sequence of signal colors (e.g., "RRGGGYRR")
     */
    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("Signal log is empty.");
            return;
        }

        char maxColor = signalLog.charAt(0);
        int maxLength = 1;

        char currentColor = signalLog.charAt(0);
        int currentLength = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            char currentChar = signalLog.charAt(i);
            if (currentChar == currentColor) {
                currentLength++;
            } else {
                currentColor = currentChar;
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxColor = currentColor;
            }
        }

        System.out.println("Longest Streak: '" + maxColor + "' repeated " + maxLength + " times");
    }

    public static void main(String[] args) {
        // Test Case 1
        findLongestStreak("RRGGGYRR");

        // Test Case 2
        findLongestStreak("RRRRYYGG");
    }
}
