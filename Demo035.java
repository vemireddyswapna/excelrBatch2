import java.util.Scanner;
public class Demo035 {
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the vlue of a: ");
      int a = obj.nextInt();
      System.out.println("Enter the vlue of b: ");
      int b = obj.nextInt();
      System.out.println("Enter the vlue of c: ");
      int c = obj.nextInt(); 
      if(a>b && a>c){
        System.out.println("a is greater value b and c");
      }
      else if(b>a && b>c){
        System.out.println("b is greater value a and c");
      }
      else if(c>a && c>b){
        System.out.println("c is greater value a and c"); 
      }else{
        System.out.print("all are equl");

      }
      
       
        
    }
} 
