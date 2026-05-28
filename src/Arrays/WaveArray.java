package Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.print("Before: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        convertToWave(arr);

        System.out.print("\nAfter:  ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void convertToWave(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
    }
}