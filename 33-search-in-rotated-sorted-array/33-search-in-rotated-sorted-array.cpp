class Solution {
public:
    int search(vector<int>& nums, int target) {
        
        //Brute force

        for(int i=0; i<nums.size(); i++){
            if(nums[i]==target){
                return i;
        }
        }
        return -1;    
        
        //Optimize using Binary Search
     
        
        
    }
};