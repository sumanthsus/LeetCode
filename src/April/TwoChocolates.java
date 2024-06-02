package April;

public class TwoChocolates {
    public int buyChoco(int[] prices, int money) {
        int a=0,min=99999,sum=0;

        for(int i=0;i<prices.length;i++)
        {
            if(min>prices[i])
            {
                min=prices[i];
                a=i;
            }
        }
        sum=sum+min;
        min=999;
        for(int i=0;i<prices.length;i++)
        {
            if(i==a)continue;
            if(min>prices[i])
            {
                min=prices[i];

            }
        }
        if(sum+min>money) return money;

        return money-(sum+min);
    }
    public static void main(String[] args)
    {
        TwoChocolates tc = new TwoChocolates();

        int[] choc = new int[]{3,2,5,3};

        System.out.println(tc.buyChoco(choc,5));
    }
}
