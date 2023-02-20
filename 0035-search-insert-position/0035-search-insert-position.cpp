class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        
        int s = 0, e=nums.size()-1;
        
        while(s<=e){
            int mid = (s+e)/2;
            if(target < nums[mid])
                e = mid-1;
            else if(target > nums[mid])
                s = mid+1;
            else
                return mid;
        }
        return e+1;
    }
};