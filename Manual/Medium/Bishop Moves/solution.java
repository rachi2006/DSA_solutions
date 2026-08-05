import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()){
		    int t = sc.nextInt();
		    for(int i=0; i<t; i++){
		        int x1 = sc.nextInt();
		        int y1 = sc.nextInt();
		        int x2 = sc.nextInt();
		        int y2 = sc.nextInt();
		        if((x1+y1)%2 != (x2+y2)%2){
		            System.out.println(-1);
		        }else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                    System.out.println(1);
                }else {
                    System.out.println(2);
                }
		    }
		}

	}
}
