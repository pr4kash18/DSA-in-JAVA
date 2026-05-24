package Arrays;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] x = {2,3,4,5};
        int[] y = x;        //SHALLOW COPY (means x aur y ekdum copy array hai but ek dusre se connected hai)
        x[1]=9;
        System.out.println(y[1]);
    }
}

