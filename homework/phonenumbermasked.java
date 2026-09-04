import java.util.Scanner;

public class phonenumbermasked {
    public static void main(String[] args){
        String phoneNumber;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a phone number");
        phoneNumber = sc.nextLine();
        System.out.println(maskPhoneNumber(phoneNumber));
    }

    static String maskPhoneNumber(String phone){
        int length = phone.length();
        if (length != 10) {
            return "Invalid phone number";
        } else {
            return "******-" + phone.substring(6);
        }
    }
}

