import java.util.*;
class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        //Putting array contents in the hashmap
        for(int i=0;i<nums.length;i++){        
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
           // If hashmap having the number get it and subtract from target  
            int num = nums[i];
           
            int rem = target - num;
            // rem number is searched and its index is get
            if(map.containsKey(rem)){
                int index = map.get(rem);
                //If 2 having same index than don't take
                if(index==i) continue;
                return new int[]{i,index};
            }

        }
        return new int[]{};
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);

        System.out.println("n : ");
        

        int n = s.nextInt(); // number of elements in nums2
        
        
        int [] arr = new int[n];
        System.out.println("nums1 elements : ");

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt(); 
        }
        System.out.println("val : ");
        

        int val = s.nextInt(); // number of elements in nums2

        int [] res = twoSum(arr,val);	
        System.out.print("Sum of the two elements at indices : ");
       for(int i=0;i<2;i++){
        System.out.print(res[i] + " ");
       }
    }
}
