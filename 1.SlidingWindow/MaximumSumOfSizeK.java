public class MaximumSumOfSizeK {
    private static int findMaximumSumOfSizeK(int k,int [] array) {
        int maximumSum = 0;
        int windowSum = 0;
        int windowStart = 0;
        for(int windowEnd = 0; windowEnd < array.length; windowEnd++){
            windowSum += array[windowEnd];
            if(windowEnd >= k - 1){
                maximumSum = Math.max(maximumSum, windowSum);
                windowSum -= array[windowStart];
                windowStart++;
            }
        }
        return maximumSum;
    }
    public static void main(String[] args) {
        int result = MaximumSumOfSizeK.findMaximumSumOfSizeK(3, new int [] {2,1,5,1,3,2});
        System.out.println("Maximum subArray sum of size k : " + result);
    }
}
