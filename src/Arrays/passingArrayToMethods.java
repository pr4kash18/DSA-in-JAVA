package Arrays;

public class passingArrayToMethods {
    public static void main(String[] args) {
        int[] arr =  {23,45,43,11};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }
    public static void change(int[] arr){           //int[] arr is the REFERENCE VARIABLE
        arr[1]=77;
    }
}
