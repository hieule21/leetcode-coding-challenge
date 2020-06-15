class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int maxLen = 0;
        //Initiate map with pair (key, 1)
        for(int i = 0; i<nums.length; i++) {
            map.put(nums[i], 1);
        }
        //Increase value of key if check is true
        for(int key : map.keySet()) {
            for(int i = 0; i<nums.length ; i++) {
                if(check(key, nums[i]) == true) {
                    if(key == 1 && map.get(key) == 1) {
                        map.replace(key, 2);
                    } else {
                        map.replace(key, map.get(key) + 1);
                    }
                }
            }
        }
        //Find max length
        for(int val : map.values()) {
             if(val > maxLen) {
                 maxLen = val;
             }
        }
        if(map.containsKey(1) == true) {
            if(map.get(1) != maxLen) map.replace(1, maxLen);
        }
        for(int key : map.keySet()) {  
            if(map.get(key) == maxLen) result.add(key);
        }
        return result;
    }
    
    public boolean check(int a, int b) {
        if(a % b == 0) return true;
        if(b % a == 0) return true;
        return false;
    }
}