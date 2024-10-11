class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.length() == 0) return true;       // Edge case: If s is empty, it's always a subsequence
        int sIndex = 0, tIndex = 0;     // Pointers for s and t
        
        while (tIndex < t.length()) {       // Iterate through t
            if (t.charAt(tIndex) == s.charAt(sIndex)) {     // If characters match, move the pointer for s
                sIndex++;
                if (sIndex == s.length()) {     // If we've traversed the entire string s, it's a subsequence
                    return true;
                }
            }
            tIndex++;       // Move the pointer for t
        }
        
        return false;       // If we exit the loop and haven't matched all characters in s, it's not a subsequence
    }
}
