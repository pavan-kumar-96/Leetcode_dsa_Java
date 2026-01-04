class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int temp = 0;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (count == 2) {
                count = 0;
            } else {
                temp += cost[i];
                count++;
            }

        }
        return temp;
    }
}