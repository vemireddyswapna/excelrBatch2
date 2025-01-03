
import java.net.PasswordAuthentication;

public class demo4 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the name: ");
        String username=obj.next();
        System.out.println("enter the psw: ");
        String psw=obj.next();
        whlie(username.equals("swapna")&&psw.equals("swapna_001")){
            System.out.println("hello wellcome to page");
            break;
        }


    }
    
}
