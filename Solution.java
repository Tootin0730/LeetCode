class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] charS = new char[s.length()];
        char[] charT = new char[t.length()];

        for (int a = 0; a < s.length(); a++) {
            charS[a] = s.charAt(a);
            charT[a] = t.charAt(a);
        }
        
        int result = 0;
        for (int i = 0; i < charS.length; i++){
            for(int j = i; j < charS.length; j++){
                if(charS[i] == charS[j] && charT[i] != charT[j]){
                    result += 1;
                }else if(charT[i] == charT[j] && charS[i] != charS[j]){
                    result += 1;
                }
            }
        }

        if(result == 0){
            return true;
        }else{
            return false;
        }
    }
}