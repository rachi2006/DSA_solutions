class Solution {
    public static void difference(int n1, int n2) {

        // Write your code here
        if(n1 > n2){
            int n3 = n1-n2;
            for(int i=1; i<=10; i++){
                System.out.print((n3 *i)+ " ");
            }
        }
    }
}