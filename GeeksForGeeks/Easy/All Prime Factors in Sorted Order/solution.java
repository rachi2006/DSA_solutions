class Solution {
    public static void printPrimeFactorization(int n) {
        // code here
         while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        
        // Handle odd numbers up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        // If n is a prime number greater than 2
        if (n > 2) {
            System.out.print(n + " ");
        }
        
    }
}
