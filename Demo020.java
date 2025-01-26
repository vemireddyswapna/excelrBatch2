import java.util.Scanner;
public class Demo020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBizz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Bizz");
        } else {
            System.out.println("The number is not a multiple of 3 or 5.");
        }
        scanner.close();
    }
}