package Arrays;
import java.util.Scanner;

public class SearchingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target element for search: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==target){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Target Element Exists in array.");
        } else{
            System.out.println("Target element is missing in array.");
        }
    }
}
