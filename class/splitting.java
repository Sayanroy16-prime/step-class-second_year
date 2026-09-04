import java.util.Scanner;
public class splitting {
    void objectsCreated(int count, String[] arr) {
        System.out.println("Total student/college records created: " + count);
        for (int i = 0; i < count; i++) {
            System.out.println("Student " + (i + 1) + " College: " + arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        int actualCount = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of the college for student " + (i + 1) + ": ");
            String college = sc.nextLine().trim();
            arr[i] = college;
            actualCount++;
            if (i > 0 && arr[i].equalsIgnoreCase(arr[i - 1])) {
                System.out.println("Consecutive duplicate college entered. Stopping input.");
                break;
            }
        }
        splitting s = new splitting();
        s.objectsCreated(actualCount, arr);
        sc.close();
    }
}