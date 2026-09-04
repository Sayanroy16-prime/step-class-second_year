class SrmStudent {
    static String collegeName;
    static String academicYear;

    // Static block executed exactly once when the class is loaded
    static {
        collegeName = "SRM Institute of Science and Technology";
        academicYear = "2024-2025";
        System.out.println("College info loaded");
    }

    private String name;

    public SrmStudent(String name) {
        this.name = name;
        System.out.println("Student record created: " + this.name);
    }

    public String getName() {
        return name;
    }
}

public class M4_OneTimeCollegeSetup {
    public static void main(String[] args) {
        String[] names = {"Ravi", "Meera", "Karthik", "Divya", "Anitha"};

        for (String name : names) {
            new SrmStudent(name);
        }
    }
}
