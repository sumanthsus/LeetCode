package April;

import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        if(n<0) return false;
        HashSet<Integer> hs = new HashSet<>();
        int num=Sumof(n);
        while(num!=1)
        {
            if(hs.contains(num)) return false;
            hs.add(num);
            num=Sumof(num);
            System.out.println(num);
        }
        return true;

    }
    public int Sumof(int n){
        int temp=n,sum=0,rem=0;
        while(temp!=0)
        {
            rem=temp%10;
            temp=temp/10;
            sum=sum+(rem*rem);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        HappyNumber hn = new HappyNumber();
        System.out.println(hn.isHappy(19));
    }
}
