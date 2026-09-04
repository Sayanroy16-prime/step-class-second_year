public class P5_MovieReviewWordLengthProfiler {

    /**
     * Splits a review into words and classifies them into Short (1–4 letters),
     * Medium (5–8 letters), or Long (9+ letters).
     *
     * @param review Movie review string
     */
    public static void classifyWordLengths(String review) {
        if (review == null || review.trim().isEmpty()) {
            System.out.println("Short: 0 | Medium: 0 | Long: 0");
            return;
        }

        // Split review into words by whitespace
        String[] words = review.trim().split("\\s+");

        int shortCount = 0;  // 1-4 letters
        int mediumCount = 0; // 5-8 letters
        int longCount = 0;   // 9+ letters

        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "");
            int len = cleanWord.isEmpty() ? word.length() : cleanWord.length();

            if (len >= 1 && len <= 4) {
                shortCount++;
            } else if (len >= 5 && len <= 8) {
                mediumCount++;
            } else if (len >= 9) {
                longCount++;
            }
        }

        System.out.println("Short: " + shortCount + " | Medium: " + mediumCount + " | Long: " + longCount);
    }

    public static void main(String[] args) {
        String review = "This movie was absolutely fantastic and thrilling";
        classifyWordLengths(review);
    }
}
