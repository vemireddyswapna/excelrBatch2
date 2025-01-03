import java.util.Scanner;

public class demo5 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the username: ");
        String username=obj.next();
        System.out.println("enter the age: ");
        int age=obj.nextInt();
        System.out.println("enter the phone: ");
        int phone=obj.nextInt();
        System.out.println("Username: " + username);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
    }
}