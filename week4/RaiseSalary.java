import java.util.Scanner;

public class RaiseSalary { 

    static void raiseSalary(String name, double salary) {
        double BONUS=5000.0;
        double finalSalary = salary + BONUS;
        System.out.printf("Employee: %s | Final Salary: %.2f%n", name, finalSalary);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 
            System.out.print("Enter the number of employees: ");
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter employee name: ");
                String name = sc.nextLine();

                System.out.print("Enter salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                raiseSalary(name, salary);
            }
        }
    }
}