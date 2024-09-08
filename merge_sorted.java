import java.util.*;
class merge_sorted {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //p1 & p2 is points to last ele of nums1 & nums2 respectively
        int p1=m-1 , p2=n-1, i=m+n-1;
        //Loop till the length of nums2
        while(p2>=0){
            //element of nums1 > nums2 put it at the end of the array pointed by i
            if(p1>0 && nums1[p1] > nums2[p2]){
                nums1[i] = nums1[p1];
                i--;
                p1--;
            }
            else{
                nums1[i--] = nums2[p2--];
            }
        }
        for(int ele : nums1){
            System.out.println(ele);

        }
       
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("m : ");
        int m = s.nextInt(); // number of elements in nums1
        System.out.println("n : ");
        

        int n = s.nextInt(); // number of elements in nums2
        int k = m+n;
        int [] nums1 = new int[k];
        int [] nums2 = new int[n];
        System.out.println("nums1 elements : ");

        for(int i=0;i<m;i++){
            nums1[i] = s.nextInt(); 
        }
        System.out.println("nums2 elements : ");

        for(int i=0;i<n;i++){
            nums2[i] = s.nextInt(); 
        }
        merge(nums1,m,nums2,n);	
    }
}