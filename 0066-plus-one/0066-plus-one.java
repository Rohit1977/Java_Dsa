class Solution {
    public int[] plusOne(int[] arr) {
        StringBuilder sb = new StringBuilder("");
        int carry = 0;
        if(arr[arr.length-1] + 1 == 10){
            carry = 1;
            sb.append(0);
        }else{
            sb.append(arr[arr.length-1]+1);
        }
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] + carry == 10){
                sb.insert(0,0);
                carry = 1;
            }else{
                sb.insert(0, arr[i]+carry);
                carry = 0;
            }
        }
        if(carry == 1){
            sb.insert(0,1);
        }
        int[] newArr = new int[sb.length()];
        for(int i = 0; i<newArr.length; i++){
            newArr[i] = sb.charAt(i) - '0';
        }
        return newArr;
    }
}