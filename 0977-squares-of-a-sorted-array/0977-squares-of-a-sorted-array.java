class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                neg.add(nums[i]);
            } else {
                pos.add(nums[i]);
            }
        }
        if (neg.size() == 0) {
            for (int i = 0; i < pos.size(); i++) {
                pos.set(i, pos.get(i) * pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }
        if (pos.size() == 0) {
            for (int i = 0; i < neg.size(); i++) {
                neg.set(i, neg.get(i) * neg.get(i));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }
        Collections.reverse(neg);
        int i = 0;
        int j = 0;
        while (i < neg.size() && j < pos.size()) {
            int valuea = neg.get(i) * neg.get(i);
            int valueb = pos.get(j) * pos.get(j);
            if (valuea <= valueb) {
                c.add(valuea);
                i++;
            } else if (valuea > valueb) {
                c.add(valueb);
                j++;
            }
        }
        while (i < neg.size()) {
            int valuea = neg.get(i) * neg.get(i);
            c.add(valuea);
            i++;
        }
        while (j < pos.size()) {
            int valueb = pos.get(j) * pos.get(j);
            c.add(valueb);
            j++;
        }
        return c.stream().mapToInt(Integer::intValue).toArray();
    }
}