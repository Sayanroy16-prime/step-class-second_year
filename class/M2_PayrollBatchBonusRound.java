class Employee {
    private String empId;
    private double salary;

    public Employee(String empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

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

        for (int i = 0; i < empIds.length; i++) {
            Employee emp = new Employee(empIds[i], startingSalaries[i]);
            emp.raiseSalary(bonusAmount);
            emp.printSummary();
        }
    }
}
