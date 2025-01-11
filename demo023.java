import java.util.Scanner;

public class demo023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        String reversedName = new StringBuilder(name).reverse().toString();
        System.out.println("Reversed name: " + reversedName);
        scanner.close();
    }
}
