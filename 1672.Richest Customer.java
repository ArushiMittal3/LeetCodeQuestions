class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int max=0,m,sum;
        for(int i=0;i<n;i++){
            sum=0;
            m=accounts[i].length;
            for (int j=0;j<m;j++){
                sum+=accounts[i][j];
            }
            if (max<sum){
                max=sum;
            }
        }
        return max;
    }
}