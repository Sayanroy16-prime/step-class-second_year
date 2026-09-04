import java.util.Scanner;

public class bankdetailschecker {

    public static void main(String[] args){
        String bankDetails;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bank details in the format: BankName,AccountNumber,IFSCCode");
        bankDetails = sc.nextLine();
        parseBankDetails(bankDetails);

        


         
    }
    
}
