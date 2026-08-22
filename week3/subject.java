import java.util.Scanner;

public class Subject {

    public Subject(String code, String title, int credits, int labCredits) {
        System.out.println("Code: " + code);
        System.out.println("Title: " + title);
        System.out.println("Credits: " + credits);
        System.out.println("Lab Credits: " + labCredits);
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume leftover newline
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Subject Code: ");
            String code = sc.nextLine();
            System.out.print("Enter Name of the subject: ");
            String title = sc.nextLine();
            System.out.print("Is it Theory or Lab? (t/l): ");
            String type = sc.nextLine().trim();
            int credits = 0;
            int labCredits = 0;
            if (type.equalsIgnoreCase("t")) {
                System.out.print("Enter Theory Credits: ");
                credits = sc.nextInt();
            } else {
                System.out.print("Enter Lab Credits: ");
                labCredits = sc.nextInt();
            }
            sc.nextLine(); 
            new Subject(code, title, credits, labCredits);
        }
        sc.close();
    }
}