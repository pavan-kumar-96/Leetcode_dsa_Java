class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> pair = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            pair.put(nums[i], pair.getOrDefault(nums[i], 0) + 1);
        }
        int ans = 0;
        for (int j : pair.keySet()) {
            int val = pair.get(j);
            int temp = (val * (val - 1) / 2);
            ans = ans + temp;
        }
        return ans;
        
    }
}