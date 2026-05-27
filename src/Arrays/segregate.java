package Arrays;

public class segregate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0};
        int zero = 0;
        int one = 0;

        for (int ele : arr) {
            if (ele == 0) {
                zero++;
            } else {
                one++;
            }
        }

        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }

        for (int i = zero; i < arr.length; i++) {
            arr[i] = 1;
        }

        System.out.print("Segregated Array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}