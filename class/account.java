// Base class for Day-Scholar Fee Account
class FeeAccount {
}

// Subclass for Hostel Fee Account
class HostelFeeAccount extends FeeAccount {
}

public class account {

    public static void processPayment(FeeAccount account, double amount) {
        if (account instanceof HostelFeeAccount) {
            System.out.println("Paid in two installments (hostel account)");
        } else if (account instanceof FeeAccount) {
            System.out.println("Paid in one go (day-scholar account)");
        }
    }
    public static void main(String[] args) {
        FeeAccount[] accounts = {
            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount(),
            new FeeAccount()
        };
        double amount = 60000;
        int hostelCount = 0;
        int dayScholarCount = 0;

        for (FeeAccount account : accounts) {
            processPayment(account, amount);

            if (account instanceof HostelFeeAccount) {
                hostelCount++;
            } else {
                dayScholarCount++;
            }
        }
        System.out.println("Hostel accounts processed: " + hostelCount + " | Day-scholar accounts processed: " + dayScholarCount);
    }
}