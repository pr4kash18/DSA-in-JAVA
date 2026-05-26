package Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {22,54,3,45,78,65,32,35,78};
        int n = arr.length;
        int i=0, j=n-1;

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
