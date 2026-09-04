public class P2_TypingSpeedTestAccuracyChecker {

    /**
     * Compares original passage and typed passage character by character.
     * Calculates accuracy percentage and reports the position of the first mismatch.
     *
     * @param original Original reference string
     * @param typed    User typed string
     */
    public static void checkTypingAccuracy(String original, String typed) {
        if (original == null || typed == null) {
            System.out.println("Invalid input strings.");
            return;
        }

        int total = original.length();
        int matched = 0;
        int firstMismatchPos = -1;
        char origChar = ' ';
        char typedChar = ' ';

        for (int i = 0; i < total && i < typed.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else {
                if (firstMismatchPos == -1) {
                    firstMismatchPos = i + 1; // 1-based position indexing
                    origChar = original.charAt(i);
                    typedChar = typed.charAt(i);
                }
            }
        }

        double accuracy = total == 0 ? 0.0 : ((double) matched / total) * 100;

        StringBuilder sb = new StringBuilder();
        sb.append("Matched: ").append(matched).append("/").append(total);
        sb.append(" | Accuracy: ").append(String.format("%.2f%%", accuracy));

        if (firstMismatchPos != -1) {
            sb.append(" | First Mismatch at position ").append(firstMismatchPos)
              .append(" ('").append(origChar).append("' vs '").append(typedChar).append("')");
        } else {
            sb.append(" | No Mismatches");
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        // Test Case 1: Passage with mismatch
        String original1 = "hello world";
        String typed1 = "hello worlt";
        checkTypingAccuracy(original1, typed1);

        // Test Case 2: Exact match passage
        String original2 = "coding";
        String typed2 = "coding";
        checkTypingAccuracy(original2, typed2);
    }
}
