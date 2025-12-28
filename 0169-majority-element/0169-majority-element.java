class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> Majority = new HashMap<>();
        int n = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int Element = nums[i];
            Majority.put(Element, Majority.getOrDefault(Element, 0) + 1);
        }
        int ans = 0;
        for (int major : Majority.keySet()) {
            if (Majority.get(major) > n) {
                ans = major;
                break;
            }
        }
        return ans;
        
    }
}