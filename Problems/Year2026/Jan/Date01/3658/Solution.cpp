class Solution {
public:
    int gcdOfOddEvenSums(int n) {
        int sumO = 1, sumE = 2, odd = 1, even = 2;
        for(int i = 1; i<n; i++){
            odd = 2 + odd;
            even = 2+ even;
            sumO += odd; 
            sumE += even;

        }
        return sumE-sumO;
    }
};
/*
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumO = 1, sumE = 2, odd = 1, even = 2;
        for(int i = 1; i < n ; i++){
            odd = 2+odd; even = 2+even;
            sumO+=odd;sumE+=even;
            // System.out.println(sumO+" "+" "+sumE);
        }
        
        return sumE-sumO;
    }
}
*/