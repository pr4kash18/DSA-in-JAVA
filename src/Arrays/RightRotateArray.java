package Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {23, 43, 21, 23, 45, 65, 3};
        int n = arr.length;
        int d = 2;        // 2 position right rotate
        d %= n;           // agar d > n ho toh handle karo
        d = n - d;        // ✅ Yahi hai Right Rotate ki trick!

        reverse(arr, 0, d - 1);   // Step 1
        reverse(arr, d, n - 1);   // Step 2
        reverse(arr, 0, n - 1);   // Step 3

        // Print result
        System.out.print("Right Rotated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}