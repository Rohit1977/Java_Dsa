class Solution {
    public int majorityElement(int[] arr) {
        int majority = 0;
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(count==0){
                majority = arr[i];
                count ++;
            }else if(arr[i] == majority){
                count++;
            }else if(arr[i]!=majority){
                count--;
            }
        }
        return majority;
    }
}