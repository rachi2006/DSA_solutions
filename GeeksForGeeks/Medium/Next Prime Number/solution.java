class Solution {
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
        int num = n+1;
         while (true) {
            if (isPrime(num)) {
                return num;
            }
            num++;
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}