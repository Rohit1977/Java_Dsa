class Solution {
    public int missingNumber(int[] nums) {
        boolean flag = false;
        int sum = (nums.length*(nums.length+1)) / 2;
        int numsSum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                flag = true;
            }
            numsSum += nums[i];
        }
        if(sum - numsSum == 0 && flag == false){
            return 0;
        }
        return sum-numsSum;
    }
}