class Solution {   
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0, cur = 0, j = n - 1;
        while(i <= j){
            if(nums[cur] == 0){
                swap(nums, i, cur);
                i++;
                cur++;
            }
            else if(nums[cur] == 1){
                cur++;
            }
            else if(nums[cur] == 2){
                swap(nums, cur, j);
                j--;
            }
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}