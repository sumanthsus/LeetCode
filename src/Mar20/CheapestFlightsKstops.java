package Mar20;

import java.util.Arrays;

public class CheapestFlightsKstops {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] min = {99999999};
        backtrack(flights.length,flights,dst,k+1,src,min,0);
        if(min[0]==99999999) return -1;
        return min[0];
    }

    public void backtrack(int m, int[][] flights, int dst, int k, int curstation, int[] min, int price)
    {

        if(curstation==dst)
        {
            if(min[0]>price) {
                min[0] = price;
            }
        }
        if(k==0)
        {
            return;
        }

        for(int i=0;i<m;i++) {
            if (flights[i][0] == curstation) {
                flights[i][0]=-1;
                backtrack(m, flights, dst, k - 1, flights[i][1], min, price+flights[i][2]);
                flights[i][0]=curstation;
                System.out.println("current : " + curstation + "next : " + flights[i][1] + " k : " + k + " price : "+ (price+flights[i][2]));            }
        }
    }

    public static void main(String[] args)
    {
        CheapestFlightsKstops cf = new CheapestFlightsKstops();
        int[][] flights= {{3,4,4},{2,5,6},{4,7,10},{9,6,5},{7,4,4},{6,2,10},{6,8,6},{7,9,4},{1,5,4},{1,0,4},{9,7,3},{7,0,5},{6,5,8},{1,7,6},{4,0,9},{5,9,1},{8,7,3},{1,2,6},{4,1,5},{5,2,4},{1,9,1},{7,8,10},{0,4,2},{7,2,8}};
        System.out.println("Cheapest Flights Price : " + cf.findCheapestPrice(10,flights,6,0,7));

        System.out.println(Arrays.deepToString(flights));
    }
}
