
class Solution {
     public int peakElement(int[] arr) {
         int n = arr.length;
         for (int i = 0; i < n; i++) {
             boolean leftOk = (i == 0) || (arr[i] > arr[i - 1]);
             boolean rightOk = (i == n - 1) || (arr[i] > arr[i + 1]);
             if (leftOk && rightOk) {
                 return i; 
             }
         }
         return -1; 
     }
 }
