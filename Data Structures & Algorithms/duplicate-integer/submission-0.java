class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> nonDups = new HashSet<>();
        for (int num : nums) {
            nonDups.add(num);
        }
        return (nonDups.size() != nums.length);
    }
}