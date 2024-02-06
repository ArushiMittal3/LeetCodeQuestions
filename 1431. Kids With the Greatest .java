class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> ans= new ArrayList<Boolean>(candies.length);
        for (int i=0; i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }

        for (int i=0; i<candies.length;i++){
            if(candies[i]+ extraCandies>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}