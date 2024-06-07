package June;

import java.util.Arrays;

public class HandOOfStraights {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        Arrays.sort(hand);
        int cha=groupSize-1;
        int i=0,dorikindi=0;
        if(groupSize==1)
        {
            return true;
        }
        while(i<hand.length)
        {
            if(hand[i]==-99999999)
            {
                i++;
                continue;
            }

            for(int j=i+1;j<hand.length;j++)
            {
                System.out.println("hand["+i+"] : " + hand[i] + " hand["+j+"] : " + hand[j] + " cha : " + cha + " dorikindi : " + dorikindi );

                if(hand[i]==hand[j]-1)
                {
                    cha--;
                    hand[i]=-99999999;
                    i=j;
                    dorikindi=1;
                }
                if(cha==1)
                {
                    hand[j]=-99999999;
                    i=0;
                    cha=groupSize-1;
                }
            }
            if(dorikindi==0)
            {
                return false;
            }
            dorikindi=0;
        }
        return true;
    }
    public static void main(String[] args)
    {
        HandOOfStraights hs = new HandOOfStraights();
        int[] hand = new int[]{1,2,3,6,2,3,4,7,8};
        System.out.println(hs.isNStraightHand(hand,3));
    }
}
