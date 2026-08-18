class Solution {
    public int[] productExceptSelf(int[] nums) {
        // prefix product
        int[] prefix = new int[nums.length + 1];
        prefix[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] * nums[i]; 
        }

        // suffix product
        int[] suffix = new int[nums.length + 1];
        suffix[nums.length] = 1;
        for (int i = nums.length; i > 0; i--) {
            suffix[i - 1] = suffix[i] * nums[i - 1];
        }

        // add the two together to get the result
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix[i] * suffix[i + 1];
        }

        return result;
    }
}  
