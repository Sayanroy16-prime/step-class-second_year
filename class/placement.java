
import java.util.Scanner;
public class placement{
    static class PlacementRecord{
        String name;
        String company;
        float value;

    public
        void printRecord(String name,String company,float salary){

            this.name = name;
            this.company = company;
            this.value = salary;

             System.out.print(this.name+ "-->");
             System.out.print(this.company);
             System.out.println(this.value + "LPA");
        }
    };
    public static void main(String[] args) {
        String name,company;
        Float salary;
        Scanner sc=new Scanner(System.in);
        PlacementRecord p=new PlacementRecord();
        for(int i=0;i<3;i++){
        System.out.println("Enter the name of the student: ");
        name=sc.nextLine();
        System.out.println("Enter the company of the student: ");
        company=sc.nextLine();
        System.out.println("Enter the salary of the student: ");
        salary=sc.nextFloat();
        sc.nextLine();
        p.printRecord(name, company, salary);
    }
    sc.close();

        





    }
}