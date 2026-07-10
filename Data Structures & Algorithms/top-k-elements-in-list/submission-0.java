class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(counts.keySet());
        keys.sort((a, b) -> counts.get(b) - counts.get(a));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }

        return result;
    }
}
