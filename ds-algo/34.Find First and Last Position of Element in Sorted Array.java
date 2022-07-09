class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1}; // if no target found then
        
        //checking starting occurence of target 
        ans[0] = search(nums,target,true);
        // checking ending occurence of target
        ans[1] = search(nums,target,false);
        
        return ans;
    }
    
    int search(int[] nums, int t, boolean findStartingIndex){
        int ans = -1, s = 0, e = nums.length-1;
        
        while(s<=e){
            // calculating mid
            int mid = s+(e-s)/2;
            
            if(t < nums[mid]) 
                e = mid-1;
            else if(t > nums[mid]) 
                s = mid+1;
            else { 
            // potential ans found
                ans = mid;
            //  but checking more occurence in left and right
                if(findStartingIndex==true) 
                    e = mid-1;
                else 
                    s = mid+1;
            }                
        }
    return ans;

    }
}
