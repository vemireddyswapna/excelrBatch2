import java.util.Scanner;
public class Demo083 {
    public void method(){
Scanner obj=new Scanner(System.in);
System.out.println("Enter the String: ");
String ab = obj.nextLine();
char ch=ab.charAt(0);
if(ch == 'a'|| ch =='e'|| ch=='i'|| ch=='o'||ch=='u'){
    System.out.println("is a vowel");

}
else{
    System.out.println("is a consonent");
}
    }
public static void main(String[] args){
    Demo083 d3=new Demo083();
    d3.method();
    }
}
