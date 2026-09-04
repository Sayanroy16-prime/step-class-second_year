import java.util.Scanner;

public class library {
    private String title;
    private String isbn;
    public library(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the book: ");
            String title = sc.nextLine();
            System.out.println("Enter the ISBN: ");
            String isbn = sc.nextLine();
            if (isbn.trim().isEmpty()) {
                isbn = "Pending";
            }
            System.out.println("Catalogued: true");
            library book = new library(title, isbn);
            System.out.println("Book added: " + book.title + " ISBN: " + book.isbn);
        }
    }
}
