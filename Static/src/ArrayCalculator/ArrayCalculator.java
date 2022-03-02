package ArrayCalculator;

public class ArrayCalculator {
    public static int sumOfArray(int[] arr) {
        int res = 0;
        for(int i = 0; i < arr.length; i ++)
            res += arr[i];
        return res;
    }

    public static double sumOfArray(double[] arr) {
        double res = 0;
        for(int i = 0; i < arr.length; i ++)
            res += arr[i];
        return res;
    }
}
