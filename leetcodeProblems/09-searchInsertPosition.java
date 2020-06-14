class Solution {
    public int searchInsert(int[] nums, int val) {
        int res = 0; 
        int i = nums.length-1;
        if (nums[nums.length - 1] < val) {              //Check if the last element is smaller than val      
            res = nums.length; 
        } else if (nums[0] > val) {                     //Check if the first element is greater  than val
            res = 0; 
        }
        else {
            while(val < nums[i]) {                      //Find the right position
                i--;
            }
            if(val == nums[i]) { 
                res = i;
            } else { 
                res = i + 1; 
            }
        }
        return res;
    }
}