class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int evensum = 0;
        int oddsum = 0;
        for(int i=0; i<=N; i++){
            if(i % 2 == 0){
                evensum += i;
            }else{
                oddsum += i;
            }
        }
        result.add(evensum);
        result.add(oddsum);
        return result;
    
        
    }
}