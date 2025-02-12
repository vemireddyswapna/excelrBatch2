import java.util.HashSet;

public class Demo073 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 2, 3, 6, 7, 8, 1};
        
        System.out.println("Duplicate elements in the array:");
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        
        for (int num : duplicates) {
            System.out.println(num);
        }
    }
}