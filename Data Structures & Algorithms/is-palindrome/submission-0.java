class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(right > left){
            char rightChar = Character.toLowerCase(s.charAt(right));
            char leftChar = Character.toLowerCase(s.charAt(left));

            // ignore non-alphanumeric characters
            if(!Character.isLetterOrDigit(leftChar)){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(rightChar)){
                right--;
                continue;
            }

            if(rightChar != leftChar){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
