import java.util.Scanner;
public class demo6{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
String name = "swapna";
String psw = "fsw";
String login;
do{
System.out.println("welcome to mallareddyuniversity");
System.out.println("you are valid for this site");
login=obj.nextLine();
if(login=="no"){
    System.out.println("login here");
    System.out.println("Enter your name and psw");
    name=obj.nextLine();
    psw=obj.nextLine();
} else
    System.out.println("you are valid user");
} while ((name=="swapna") && (psw=="fsw"));

    }
}