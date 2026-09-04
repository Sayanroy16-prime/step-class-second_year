
import java.util.Scanner;


public class bye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;
        System.out.println("Enter a sentence");
        sentence = sc.nextLine();
        parseStudentRecord(sentence);
    }

    static void parseStudentRecord(String record) {
         String[] word=record.split(",");
         if(word.length>3||word.length<3){
            System.out.println("Invalid record");

         }
         else{
            System.out.println("Name: "+word[0]+" Age: "+word[1]+" Grade: "+word[2]);
         }

    }
}