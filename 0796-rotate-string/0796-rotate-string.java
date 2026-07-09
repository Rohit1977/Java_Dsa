class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(s+s);
        for(int i=0; i<=sb.length()-goal.length(); i++){
            int start = i;
            int end = goal.length()+i;
            if(sb.substring(start,end).equals(goal)){
                return true;
            }
        }
        return false;
    }
}