package Arrays;
import java.util.Arrays;

public class SortArrayBuiltin {
    public static void main(String[] args) {
        int[] arr = {2,4,9,-4,6,-9,0};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
