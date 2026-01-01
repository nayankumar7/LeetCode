class Solution {
    public boolean isHappy(int n) {
        
        String s = n+"";
        
        int nn = 0, NN=0;
        for(char c :s.toCharArray()){
            nn = Integer.valueOf(c-'0');
            NN += nn*nn;
            // System.out.println(nn+ " "+ NN);
        }
        if(NN==1 || NN == 7){
            return true;
        }String check = NN+"";
        if(check.length()==1){
            return false;
        }
        return isHappy(NN);
    }

}