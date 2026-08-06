class Solution { 
    private int countSubarrayWithTarget(int[] arr, int target) { 
        if (target < 0) { 
            return 0; 
        } 
        
        int left = 0; 
        long currentSum = 0; 
        long count = 0; 
        
        for (int i = 0; i < arr.length; i++) { 
            currentSum += arr[i]; 
            
            while (currentSum > target && left <= i) { 
                currentSum -= arr[left]; 
                left++; 
            } 
            
            count += (i - left + 1); 
        } 
        
        return (int) count; 
    } 

    public int countSubarray(int[] arr, int l, int r) { 
        return countSubarrayWithTarget(arr, r) - countSubarrayWithTarget(arr, l - 1); 
    } 
}
