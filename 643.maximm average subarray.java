class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=Double.NEGATIVE_INFINITY;
        for (int i=0; i<nums.length-k+1;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                
                sum+=nums[j];
            }
            if(avg<sum){
            
                avg=sum;
            }
        }
        return avg/k;
    }
}


