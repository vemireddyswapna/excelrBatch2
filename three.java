import java.util.Scanner;
public class three {
   public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the value: ");
    int a = obj.nextInt();
    System.out.println("Enter the value: ");
    int b = obj.nextInt();
    System.out.println("Enter the value: ");
    int c = obj.nextInt();
    if(a>b && a>c){
        System.out.println("greatest number");
    }
        else if(b>a && b>c){
            System.out.println("lowest number");
    }
    else{
        System.out.println("all are different");
    }
   } 
}
