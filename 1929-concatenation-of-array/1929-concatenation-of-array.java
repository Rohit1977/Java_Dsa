class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArr = new int[nums.length*2];
        int index = 0;
        for(int i=0; i<newArr.length; i++){
            if(!(index<nums.length) ){
                index=0;
            }
            newArr[i] = nums[index];
            index++;
        }
        return newArr;
    }
}