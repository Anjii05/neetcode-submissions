class Solution {
    public boolean isAnagram(String s, String t) {
        // Check if lengths are different, if so, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] sArr = s.toCharArray();
     char[] tArr = t.toCharArray();

        // Sort both character arrays
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        // Compare sorted arrays
        return Arrays.equals(sArr, tArr);
    }
}
    

