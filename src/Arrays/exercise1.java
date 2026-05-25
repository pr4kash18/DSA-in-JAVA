package Arrays;

public class exercise1 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        for (int i=0; i<arr.length; i++){
            if (i%2==0){
                System.out.println(arr[i]*2);
            }
            else {
                System.out.println((arr[i]+10));
            }
        }
    }
}

