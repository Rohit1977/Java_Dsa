class Solution {
    public boolean detectCapitalUse(String word) {
        
        for(int i =1; i<word.length(); i++){
            if(Character.isLowerCase(word.charAt(i)) && Character.isLowerCase(word.charAt(i-1))){
                continue;
            }
            else if(Character.isLowerCase(word.charAt(i)) && Character.isUpperCase(word.charAt(i-1))){
                if(i>1){
                    return false;
                }
                else{
                    continue;
                }
            }
            else if(Character.isUpperCase(word.charAt(i)) && Character.isUpperCase(word.charAt(i-1))){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}