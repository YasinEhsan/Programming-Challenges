class Solution {
    public int removeElement(int[] nums, int val) {
        /*PLAN
        - loop thru nums to find number of occurences of VAL
        - create int pointer j set to num.len - 1. 
        - create another loop from 0 to num.len - occurences val
        - when counter val switch with position j. 
        - decrement j while next value of j is not val
        
        -  two pointer sol is da move
        */
        
        int i = 0; //slow runner
        for(int j = 0; j < nums.length; ++j ){
            if(nums[j] != val){
                nums[i] = nums[j]; //skips occernce of val.DN Switch. overwrites
                i++;
            }
            
        }
        return i;
        
    }
}
