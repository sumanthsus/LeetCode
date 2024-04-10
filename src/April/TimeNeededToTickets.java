package April;

import java.util.Arrays;

public class TimeNeededToTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0,i=0;
        int[] ticket= new int[tickets.length];
        for(i=0;i<tickets.length;i++)
        {
            ticket[i]=tickets[i];
        }
        while(ticket[k]!=0)
        {
            if(i==ticket.length) i=0;
            if(ticket[i]==0)
            {
                i++;
                continue;
            }
            System.out.println(Arrays.toString(ticket));
            ticket[i]-=1;
            time++;
            i++;
        }
        System.out.println("Time : " + time);
        System.out.println(Arrays.toString(tickets));
        int ele=tickets[k];
        int out=0;
        for(i=0;i<tickets.length;i++) {
            if(tickets[i]>=ele) {
                if(i<=k)
                    out=out+ele;
                else
                    out=out+ele-1;
            }
            else {
                out=out+tickets[i];
            }

            System.out.println("tickets["+i+"] : "+ tickets[i] + " out : " + out + " ele : " + ele);
        }
        return out;

        //return time;
    }

    public static void main(String[] args)
    {
        TimeNeededToTickets tn = new TimeNeededToTickets();

        int[] ticks = new int[]{2,3,6,4,5,7,1,2,4,5};

        System.out.println(tn.timeRequiredToBuy(ticks,2));
    }
}
