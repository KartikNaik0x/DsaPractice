class Solution {
    public int removeDuplicates(int[] nums) {
       int i =0;
       int j= 0;
       int k = 0;
       int count =0;
       while (i < nums.length && j < nums.length){
           if(nums[i] == nums[j]){
               j++;
           }else{
               nums[k]=nums[i];
               i=j;
               k=k+1;
               count++;
           }
       }
       while(i<nums.length) {
	    	   nums[k]=nums[i];
	    	   k++;
	    	   i++;
	    }
       
       return count+1;
    }
}