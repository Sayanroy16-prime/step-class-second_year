public class P4_WarehouseInventoryBalancer {

    /**
     * Computes total inventory for two warehouse sections, determines balance status,
     * and identifies the highest quantity item across both sections.
     *
     * @param sectionA Quantities in Section A
     * @param sectionB Quantities in Section B
     */
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA == null || sectionB == null) {
            System.out.println("Invalid inventory section data.");
            return;
        }

        int sumA = 0;
        for (int qty : sectionA) {
            sumA += qty;
        }

        int sumB = 0;
        for (int qty : sectionB) {
            sumB += qty;
        }

        String status = (sumA == sumB) ? "Balanced" : "Not Balanced";

        int highestQuantity = Integer.MIN_VALUE;
        String highestSection = "";
        int highestIndex = -1;

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highestQuantity) {
                highestQuantity = sectionA[i];
                highestSection = "Section A";
                highestIndex = i + 1; // 1-based Item index
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highestQuantity) {
                highestQuantity = sectionB[i];
                highestSection = "Section B";
                highestIndex = i + 1; // 1-based Item index
            }
        }

        System.out.println("Section A Total: " + sumA + " | Section B Total: " + sumB +
                " | Status: " + status + " | Highest Quantity: " + highestQuantity +
                " (" + highestSection + ", Item " + highestIndex + ")");
    }

    public static void main(String[] args) {
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        analyzeInventory(sectionA, sectionB);
    }
}
