package Arrays;

import java.util.Scanner;

public class productOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input
        System.out.print("Enter values of array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //output
        int product = 1;
        for(int i = 0; i<arr.length; i++){
            product = product * arr[i];
        }
        System.out.print("Product of Array is: " + product);
    }
}
