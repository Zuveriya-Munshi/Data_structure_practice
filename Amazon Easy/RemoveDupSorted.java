public class RemoveDupSorted {
        public static int removeDuplicates(int[] nums) {
            int len = nums.length;
            int i=0;
            for(int j=0;j<len;j++){
                if(nums[i]<nums[j]){
                    //Unique elements than swap it 
                    int temp = nums[i+1];
                    nums[i+1] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }
            return i+1;
            
        }
        public static void main(String []args){
            int[] nums = {0,0,1,1,1,2,2,3,3,4,5};
            int len = removeDuplicates(nums);
            System.out.println(len);

        }
    
}
