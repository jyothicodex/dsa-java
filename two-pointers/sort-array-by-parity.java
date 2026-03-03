// Problem: Sort Array By Parity
// Platform: LeetCode
// Pattern: Two Pointers / Partition
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2==0){
                int temp=nums[i];
                nums[i]=nums[j];
               nums[j]=temp;
               i++;
            }
        }
return nums;
    }
}
   
