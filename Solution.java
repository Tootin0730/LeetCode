class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] stringS = s.split(" "); 

        char[] charPattern = new char[pattern.length()];
        for (int a = 0; a < pattern.length(); a++) {
            charPattern[a] = pattern.charAt(a);
        }

        if(stringS.length != charPattern.length){
            return false;
        }
        
        int result = 0;
        for (int i = 0; i < charPattern.length; i++){
            for (int j = i; j < charPattern.length; j++){
                if (charPattern[i] == charPattern[j] && !stringS[i].equals(stringS[j])) {
                    result += 1;
                } else if (stringS[i].equals(stringS[j]) && charPattern[i] != charPattern[j]) {
                    result += 1;
                }
            }
        }

        return result == 0;
    }
}
