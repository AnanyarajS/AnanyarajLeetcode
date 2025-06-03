
class Solution {
public:
    int reverse(int x) {
        long rd=0;
        long sum=0;
        long k=x;
        if(k<0)
        k=k*(-1);
        while(k>0){
        rd=k%10;
        sum=sum*10+rd;
        k/=10;
        
        }
        if(x<0)
        sum=sum*-1;
        if (sum < INT_MIN || sum > INT_MAX) {
            sum=0;
        }
        return sum;
    }
};