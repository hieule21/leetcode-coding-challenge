class Solution {
    int w_sum[];
    public Solution(int[] w) {
        int sum = 0;
        w_sum = new int[w.length];
        for (int i =0; i< w.length; i++) {
            sum += w[i];
            w_sum[i] = sum;
        }
    }
    
    public int pickIndex() {
        double target = w_sum[w_sum.length - 1] * Math.random();
        int res = -1;
        int low = 0; int high = w_sum.length-1;
        System.out.println(target);
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(target < w_sum[mid]) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */