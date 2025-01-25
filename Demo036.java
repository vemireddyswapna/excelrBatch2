import java.util.Scanner;
public class Demo036 {
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the vlue of a: ");
      int a = obj.nextInt();
      System.out.println("Enter the vlue of b: ");
      int b = obj.nextInt();
      System.out.println("Enter the vlue of c: ");
      int c = obj.nextInt();
      System.out.println("Enter the vlue of d: ");
      int d = obj.nextInt();
     if(a>b && a>c && a>d){
        System.out.println("a is greater value b and c and d");
      }
      else if(b>a && b>c && b>d){
        System.out.println("b is greater value a and c and d");
      }
      else if(c>a && c>b && c>d){
        System.out.println("c is greater value a and c and d"); 
      }
       else if(d>a && d>b && d>c ){
            System.out.println("d is greater value a and c and b"); 
       }
       else{
        System.out.print("all are equl");

      }
      
       
        
    }
} 
