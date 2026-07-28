import java.util.ArrayDeque;
import java.util.Iterator;

class Solution {
    public static void printDeque(ArrayDeque<Integer> deq) {
        if (deq.isEmpty()) {
            System.out.println();
            return;
        }

        Iterator<Integer> it = deq.iterator();
        
        while (it.hasNext()) {
            System.out.print(it.next());
        
            if (it.hasNext()) {
                System.out.print(" ");
            }
        }
    
        System.out.println();
    }
}
