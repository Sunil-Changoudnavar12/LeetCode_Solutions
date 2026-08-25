class Solution {
    public int[] sortArrayByParity(int[] nums) {
      for(int i = 0; i <=nums.length-2; i++){
        for(int j= i+1; j <= nums.length-1; j++){
            if(nums[i] % 2 != 0 && nums[j] % 2 ==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }else{

            }
        }
      } 
        return nums;
    }
}