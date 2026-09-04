import java.util.Scanner;

public class hello{
    public static void main(String[] args){
        String sentance;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentance");
        sentance=sc.nextLine();
        sentance=sentance.toLowerCase();

        countVowelsAndConstant(sentance);
    }

    static void countVowelsAndConstant(String text){
        String[] vowels = {"a","e","i","o","u"};
        int v=0;
        int c=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;

            }else if(ch>='a'&&ch<='z'){
                c++;

            }else if (ch==' '){
                continue;
            }
            
        }

        System.out.println("Number of vowels: " + v);
        System.out.println("Number of consonants: " + c);
    }
}