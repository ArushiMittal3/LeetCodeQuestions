class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0 ; i<=rowIndex;i++){
            List<Integer> arrRow =new ArrayList<>();
            for(int j=0;j<=i;j++){
                if (j==0||j==i){
                    arrRow.add(1);
                }
                else{
                    arrRow.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
                }
                
            }
            arr.add(arrRow);
        }
        List<Integer> arrFinal=arr.get(rowIndex);
        return arrFinal;
    }
}