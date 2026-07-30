class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length + 1;
        long esum = n*(n+1)/2;
        long asum = 0;
        for(int num : arr){
            asum += num;
        }
        long mnumber = esum - asum;
        return (int) mnumber;
        
    }
}