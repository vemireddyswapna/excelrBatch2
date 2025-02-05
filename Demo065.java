public class Demo065 {
    public void method1(){
        int arr[] = {10,20,30,40,50,60};
        System.out.println("the element in arr: "+arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }
    public static void main(String[] args){
        Demo065 d4=new Demo065();
        d4.method1();
    }
}
