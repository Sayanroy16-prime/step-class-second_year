

import java.util.Scanner;

class Mess {

    static class MessWallet {
        private float balance;
        public MessWallet(float opening) {
            this.balance = opening;
        }
        public void topUp(float amount) {
            this.balance += amount;
            System.out.printf("Balance after top-up: %.2f\n", this.balance);
        }
        public void deduct(float amount) {
            if (amount > this.balance) {
                System.out.println("Deduct rejected: insufficient balance");
            } else {
                this.balance -= amount;
                System.out.printf("Deduct successful. Remaining balance: %.2f\n", this.balance);
            }
            System.out.printf("Final balance: %.2f\n", this.balance);
        }
        public float getBalance() {
            return this.balance;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the opening balance: ");
        float opening = sc.nextFloat();
        System.out.print("Enter the topup amount: ");
        float topup = sc.nextFloat();
        System.out.print("Enter the amount you want to deduct: ");
        float minus = sc.nextFloat();
        MessWallet wallet = new MessWallet(opening);
        wallet.topUp(topup);
        wallet.deduct(minus);
        sc.close();
    }
}