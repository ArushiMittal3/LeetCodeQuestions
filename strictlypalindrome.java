class Solution {
    String convert(int n,int base){  
            String str="";
            while(n!=0){
                str+=(n%base);
                n/=base;
            }
            return str;
        }

    boolean checkPalindrome(String str){
        
            for(int i=0;i<str.length()/2;i++){
                if(str.charAt(i)!=str.charAt(str.length()-1)){
                    return false;}
            }
            return true;
        }
    public boolean isStrictlyPalindromic(int n) {

        for(int i=2;i<n;i++){
            String str=convert(n,i);
            if (!checkPalindrome(str)) {
                return false;
            }
        }
        return true;
    }
}