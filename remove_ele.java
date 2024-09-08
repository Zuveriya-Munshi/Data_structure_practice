import java.util.*;
class remove_ele {
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i=0;
        while(i<len){
            if(nums[i]==val){
                // Move last element to the place where the val matched
                nums[i] = nums[len-1];
                //decrease the length of array
                len--;
            }
            else{
                i++;
            }
        }
        return len;
    }
	public static void main(String []args){
	Scanner s = new Scanner(System.in);
	int n = s.nextInt(); // number of elements
	int [] nums = new int[n];
	for(int i=0;i<n;i++){
		nums[i] = s.nextInt(); 
	}
	int val = s.nextInt(); // value to be removed from array
	int len = removeElement(nums,val);	
	System.out.println("Length of Array : " + len);
}
}