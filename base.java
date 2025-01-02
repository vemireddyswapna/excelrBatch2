import java.util.Scanner;
public class base {
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter the value: ");
      int a=obj.nextInt();
      System.out.println("Enter the value: ");
      int b=obj.nextInt();  
      if(a>b){
        System.out.println("greatest number");
      }
        else if(b>a){
            System.out.println("lowest number");
        }
        else{
            System.out.println("equal");
        }
    } 
 }
 