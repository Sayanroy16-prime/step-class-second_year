public class WarehouseInventoryBalancer {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;

        int highestQty = 0;
        String location = "";

        // Calculate total for Section A and find max
        for (int i = 0; i < sectionA.length; i++) {
            totalA = totalA + sectionA[i];
            if (sectionA[i] > highestQty) {
                highestQty = sectionA[i];
                location = "Section A, Item " + (i + 1);
            }
        }

        // Calculate total for Section B and find max
        for (int i = 0; i < sectionB.length; i++) {
            totalB = totalB + sectionB[i];
            if (sectionB[i] > highestQty) {
                highestQty = sectionB[i];
                location = "Section B, Item " + (i + 1);
            }
        }

        String status;
        if (totalA == totalB) {
            status = "Balanced";
        } else {
            status = "Not Balanced";
        }

        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB + " | Status: " + status + " | Highest Quantity: " + highestQty + " (" + location + ")");
    }

    public static void main(String[] args) {
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};
        analyzeInventory(sectionA, sectionB);
    }
}
