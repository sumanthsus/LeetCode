package Mar20;

public class PivotInteger {

    public int pivotInteger(int n) {
        int x=0,y=n;
        int mid,total = n*(n+1)/2;
        int sum=0;
        while(x<=y)
        {
            mid=(x+y)/2;
            sum=mid*(mid+1)/2;
            int ikkadasum = total-sum+mid;

            System.out.println("total : " + total + " x :" + x + " y :" + y + " mid : "+mid+" sum : " + sum + " total-sum : " + ikkadasum);


            if(sum==ikkadasum)
            {
                return mid;
            }
            else if(sum<ikkadasum)
            {
                x=mid+1;
            }
            else {
                y=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        PivotInteger pt = new PivotInteger();
        System.out.println(pt.pivotInteger(8));
    }
}
