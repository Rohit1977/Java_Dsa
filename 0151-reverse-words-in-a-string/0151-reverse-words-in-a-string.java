class Solution {
    public String reverseWords(String str) {
        str = new StringBuilder(str).reverse().toString();
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            StringBuilder word = new StringBuilder("");
            while(i<str.length() && str.charAt(i)!=' '){
                word.append(str.charAt(i));
                i++;
            }
            if(word.length()!=0){
                sb.append(" ");
                sb.append(word.reverse());
            }
        }
        return sb.substring(1).toString();
    }
}