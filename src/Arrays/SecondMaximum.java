package Arrays;

import java.util.Arrays;

public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr = {2,4,9,-4,6,-9,0};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        //here we are first calculating largest element

        for(int i=0; i<arr.length; i++)
            if(arr[i]>max){
                max = arr[i];
            }

        //here we are choosing element except largest element(2nd largest element)

        for (int i=0; i<arr.length; i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);

    }
}
