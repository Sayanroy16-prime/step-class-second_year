

import java.util.Scanner;

public class fileextensionvalidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name with extension");
        String filename = sc.nextLine();
        System.out.println(validateFileExtension(filename));
        sc.close();

    }
    static String validateFileExtension(String filename) {
        String[] validExtensions = {".pdf"};
        for (String ext : validExtensions) {
            if (filename.endsWith(ext)) {
                return "Valid file extension: " + ext;
            }
        }
        return "Invalid file extension";
    }
}
