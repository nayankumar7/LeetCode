 
class Solution {
    public int[] plusOne(int[] digits) {
        int k = 0;
        for(int i = digits.length-1; i>=0; i--){
            int a = digits[i]+1;

            if (a != 10){
                digits[i] =a;
                break;
                
            }else{
                digits[i] = 0;
            }
            if (i==0){
                k =1;
            }
        }
        int [] ans = new int[digits.length+k];
        if(ans.length== digits.length){
            return digits;
        }else{
            ans[0]=1;
            for(int p = 0; p<digits.length; p++){
                ans[p+1]= digits[p];

            }
            return ans;
        }
        
    }
}