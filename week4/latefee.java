import java.util.Scanner;

public class latefee {
    final double calculateLateFee(int daysLate, double starting) {
        if (daysLate > 3) {
            return (daysLate / 100.0) * starting;
        } else {
            return 0.0;
        }
    }
    final void printSummary(String name, double starting, double lateFee) {
        if (lateFee > 0) {
            System.out.println(name + " | Total Base Fee: Rs " + starting + " | Late Fee: Rs " + lateFee + " | Total Payable: Rs " + (starting + lateFee));
        } else {
            System.out.println(name + " | Total Base Fee: Rs " + starting + " | Late Fee: Rs 0.0 (No late fee)");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        latefee app = new latefee();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter student name: ");
            String name = sc.next();

            System.out.print("Enter base fee / starting amount: ");
            double starting = sc.nextDouble();

            System.out.print("Enter the number of days late: ");
            int daysLate = sc.nextInt();

            double lateFee = app.calculateLateFee(daysLate, starting);
            app.printSummary(name, starting, lateFee);
        }
        sc.close();
    }
}