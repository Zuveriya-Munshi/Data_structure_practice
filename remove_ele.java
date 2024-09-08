class remove_ele {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i=0;
        while(ilen){
            if(nums[i]==val){
                 Move last element to the place where the val matched
                nums[i] = nums[len-1];
                decrease the length of array
                len--;
            }
            else{
                i++;
            }
        }
        return len;
    }
}