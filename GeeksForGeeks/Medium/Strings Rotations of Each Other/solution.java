class Solution {
    public boolean areRotations(String s1, String s2) {
        // code here
        if (s1.length() != s2.length()) {
                    return false;
        }
        String temp = s1 + s1;
        return temp.lastIndexOf(s2) != -1;
    }
}