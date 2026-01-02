import java.util.HashSet;

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length;
        HashSet<Integer> r = new HashSet<>();
        int [] ans = new int[len];
        int value = 0;
        for(int i = 0;i<len;i++ ){
            if(A[i]==B[i]){
                r.add(A[i]);
                value++;
                ans[i] = value;
            }
            else if(r.contains(A[i])&& r.contains(B[i])){
                value = value + 2;
                ans[i] = value;
            }
            else if(r.contains(A[i])|| r.contains(B[i])){
                r.add(A[i]);r.add(B[i]);
                value++;
                ans[i] = value;
            }
            else{
                r.add(A[i]);
                r.add(B[i]);
                ans[i] = value;
            }
            
        }
        return ans;
    }
}