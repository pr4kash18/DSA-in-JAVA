package Arrays;

import java.util.Arrays;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {3,43,45,66,77,99};
        int max = Integer.MIN_VALUE;


        for(int i=0; i<arr.length; i++)
            if(arr[i]>max){
                max = arr[i];
            }

        System.out.println(max);

    }
}
