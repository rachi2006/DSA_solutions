import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] c = new int[n];
            int maxSpend = 0;
            for (int i = 0; i < n; i++) {
                c[i] = sc.nextInt();
                if (c[i] > maxSpend) {
                    maxSpend = c[i];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (c[i] <= c[j]) {
                        int currentPairSum = c[i] + c[j];
                        if (currentPairSum > maxSpend) {
                            maxSpend = currentPairSum;
                        }
                    }
                }
            }
            
            System.out.println(maxSpend);
        }

	}
}
