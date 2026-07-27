class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        StringBuilder s3 = new StringBuilder(s1+s2);
        return s3.reverse().toString();
    }
}