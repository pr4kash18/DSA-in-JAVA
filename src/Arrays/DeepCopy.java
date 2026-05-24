package Arrays;
import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {
        int[] x = {2,3,4,5};
        int[] y = Arrays.copyOf(x,x.length);
        y[1]=8;
        System.out.println(y[1]); //isme new array (copied array) me change hpota hai, original me changes nahi hote)
        System.out.println(x[1]);
    }
}
