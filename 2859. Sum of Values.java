class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int n=nums.size();
        int[] arr=new int[n];
        int count;
        int sum=0;
        for(int i=0;i<n;i++){
            count=0;
            int x=i;
            while(x>0){
                count += x & 1;
                x>>=1;
            }
            if(count==k){
                sum+=nums.get(i);
            }
        }
    return sum;
    }
}