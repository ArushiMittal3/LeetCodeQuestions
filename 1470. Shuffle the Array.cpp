class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        int arr[n],arr2[n];
        for (int i=0;i<n;i++){
            arr[i]=nums[n+i];
            arr2[i]=nums[i];
        }
        int count=0;
        for (int i=0;i<n;i++){
            nums[i+count]=arr2[i];
            nums[i+1+count]=arr[i];
            count++;
        }
        return nums;
    }
};