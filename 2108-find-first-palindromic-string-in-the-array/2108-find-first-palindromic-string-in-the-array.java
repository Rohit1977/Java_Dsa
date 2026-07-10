class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            int st = 0;
            int end = words[i].length()-1;
            while(st <= end){
                boolean flag = false;
                if(!(Character.toString(words[i].charAt(st))).equals(Character.toString(words[i].charAt(end)))){
                    break;
                }else if(st == end  || st==end-1){
                    flag = true;
                }
                if(flag == true){
                    return words[i];
                }
                st ++;
                end --;
            }
        }
        return "";
    }
}