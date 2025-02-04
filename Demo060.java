public class Demo060 {
    public static void main(String[] args){
        int a=20;
        int first=0,second=1;
        System.out.println("fibonacei Series"+a+ "number");
        for(int i=0;i<a;i++){
            System.out.print(first + " ");
        int next=first+second;
        first=second;
        second=next;
        }

    }
}
