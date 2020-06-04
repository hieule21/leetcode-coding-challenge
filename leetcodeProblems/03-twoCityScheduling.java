class Solution {
    public int twoCitySchedCost(int[][] cost) {
        int minCost = 0;
        int refunds[] = new int[cost.length];
        for(int i=0; i<cost.length; i++) {
            refunds[i] = cost[i][1] - cost[i][0];
        };
        Arrays.sort(refunds);
        for(int i=0; i<cost.length; i++) {
            minCost += cost[i][0];
        }
        for(int i=0; i<cost.length/2; i++) {
            minCost += refunds[i];
        }
    
        return minCost;
    }
    
}