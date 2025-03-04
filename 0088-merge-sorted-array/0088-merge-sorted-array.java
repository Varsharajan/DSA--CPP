class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =m-1,j=n-1,k=m+n-1;
       if(m==0)
        {
             for(int p=0;p<n;p++)
               nums1[p] = nums2[p];
            return ; 
                
        }
       while(i>=0 && j>=0)
       {
        if(nums1[i]>nums2[j])
            nums1[k--] = nums1[i--];
        else
            nums1[k--] = nums2[j--];
       }
       while(j>=0)
       {
            nums1[k--] = nums2[j--];
       }
    }
}