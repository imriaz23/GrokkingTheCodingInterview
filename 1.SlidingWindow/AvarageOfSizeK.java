import java.util.Arrays;

/**
 * AvarageOfSizeK
 */
public class AvarageOfSizeK {
    private static double[] findAvarageSumOfSizeK(int k,int [] array) {
        double [] result = new double[array.length - k + 1];
        double windowSum = 0;
        int windowStart = 0;
        for(int windowEnd = 0; windowEnd < array.length; windowEnd++){
            windowSum += array[windowEnd];
            if(windowEnd >= k - 1){
                result[windowStart] = windowSum / k;
                windowSum -= array[windowStart];
                windowStart++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        double [] result = AvarageOfSizeK.findAvarageSumOfSizeK(5, new int [] {1,3,2,6,-1,4,1,8,2});
        System.out.println("Avarage of subArray of size k : " + Arrays.toString(result));
    }
}