package Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int n = arr.length + 1;

        int sum = n * (n + 1) / 2;
        int sumOfArray = 0;
        for (int ele : arr) {
            sumOfArray += ele;
        }

        System.out.println("Missing Number: " + (sum - sumOfArray));
    }
}