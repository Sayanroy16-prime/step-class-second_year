class SrmStudent {
    // Static variables common to all instances
    static String collegeName;
    static String academicYear;
    String name;
    static {
        collegeName = "SRM";
        academicYear = "2024-2025";
        System.out.println("College info loaded");
    }
    public SrmStudent(String name) {
        this.name = name;
        System.out.println("Student record created: " + this.name);
    }
}
public class Main {
    public static void main(String[] args) {
        String[] names = {"Ravi", "Meera", "Karthik", "Divya", "Anitha"};
        SrmStudent[] students = new SrmStudent[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new SrmStudent(names[i]);
        }
    }
}