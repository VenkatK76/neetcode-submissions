class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        int prodWithoutZero = 1;
        int zeroes = 0;
        for(int i=0; i<nums.length; i++) {
            product *= nums[i];
            if(nums[i]==0) { 
                zeroes++; 
            }
            else {
                prodWithoutZero *= nums[i];
            }
        }
        if(zeroes > 1) {
            return result;
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) {
                result[i] = prodWithoutZero;
            }
            else {
                result[i] = product / nums[i];
            }
        }
        return result;
    }
}  
