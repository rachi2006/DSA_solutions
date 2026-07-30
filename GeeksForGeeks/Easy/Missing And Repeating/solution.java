class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        int[] count = new int[n+1];
        for(int num : arr){
            count[num]+= 1;
        }
        int repeating = -1;
        int missing = -1;
        for(int i = 1; i<=n; i++){
            if(count[i] == 2){
                repeating = i;
            }else if(count[i] == 0){
                missing = i;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating); 
        result.add(missing);   
        
        return result;
        
    }
}
