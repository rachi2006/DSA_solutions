// Write the complete argumentFunction below.
// The function should take two arguments a and b
// The function should return a+b
import java.util.Scanner;
class Solution {
    // code here
    public static int argumentFunction(int a, int b){
        return a+b;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        argumentFunction(a,b);
    }
}