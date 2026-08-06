class Solution {
    public int findMin(int a, int b) {
        // code here
      int minVal = Integer.MAX_VALUE;
        minVal = Math.min(minVal, a + b);
        minVal = Math.min(minVal, a - b);
        minVal = Math.min(minVal, a * b);
        try {
            int divResult = Math.floorDiv(a, b);
            minVal = Math.min(minVal, divResult);
        } catch (ArithmeticException e) {
        }
        return minVal;
    }
}