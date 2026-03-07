class Solution {
    public int searchInsert(int[] nums, int target) {
       for(int i=0;i<nums.length;i++)
       {
            if(nums[i]==target)
            {
                return(i);
            }
       }
        for(int j=0;j<nums.length;j++)
        {
           if(target<nums[j])
           {
           
           return(j);
           } 
        } return (nums.length);
    }
    
}
