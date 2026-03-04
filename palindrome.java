class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverse=0,lastdigit,original=x;
        while(x!=0)
        {
            lastdigit =x%10;
            reverse=reverse*10+lastdigit;
            x=x/10;
        }
        return reverse==original;
    }
  }
