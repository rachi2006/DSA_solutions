
class Solution {
    public boolean findPair(int[] arr, int x) {
        if (arr == null || arr.length < 2) {
            return false;
        }

        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num + x) || seen.contains(num - x)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}
