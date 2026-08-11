class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (seen.contains(arr[i])) {
                result.add(arr[i]);
            } else {
                seen.add(arr[i]);
            }
        }

        return result;
    }
}