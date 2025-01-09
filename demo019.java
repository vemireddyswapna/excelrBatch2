public class demo019 {
        public static void main(String[] args) {
            int n = 30; // Number of terms in the Fibonacci series
            int firstnumber = 0, secondnumber = 1;
    
            System.out.println("Fibonacci Series up to " + n + " numbers:");
    
            for (int i = 1; i <= n; i++) {
                System.out.print(firstnumber + " ");
                int temp = firstnumber + secondnumber;
                firstnumber = secondnumber;
                secondnumber = temp;
            }
        }
    }
