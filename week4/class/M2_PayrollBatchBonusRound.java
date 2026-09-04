class Employee {
    private String empId;
    private double salary;

    // Constructor resolving field/parameter naming clash using 'this'
    public Employee(String empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    // raiseSalary resolving field/parameter naming clash using 'this'
    public void raiseSalary(double salary) {
        this.salary += salary;
    }

    public void printSummary() {
        System.out.println(empId + " | Final Salary: Rs " + salary);
    }
}

public class M2_PayrollBatchBonusRound {
    public static void main(String[] args) {
        String[] empIds = {"E-101", "E-102", "E-103", "E-104"};
        double[] startingSalaries = {40000, 55000, 62000, 48000};
        double bonusAmount = 5000;

        Employee[] employees = new Employee[empIds.length];

        for (int i = 0; i < empIds.length; i++) {
            employees[i] = new Employee(empIds[i], startingSalaries[i]);
            employees[i].raiseSalary(bonusAmount);
            employees[i].printSummary();
        }
    }
}
