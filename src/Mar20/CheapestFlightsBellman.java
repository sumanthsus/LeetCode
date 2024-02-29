package Mar20;

import java.util.Arrays;

public class CheapestFlightsBellman {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] prices =new int[n];
        Arrays.fill(prices, 999999999);

        prices[src] = 0;
        for(int i=0;i<=k;i++)
        {
            for( int j=0;j<n;i++)
            {

            }
        }
        return 0;
    }

    public static void main(String[] args)
    {
        CheapestFlightsKstops cp = new CheapestFlightsKstops();

        int[][] flights= {{3,4,4},{2,5,6},{4,7,10},{9,6,5},{7,4,4},{6,2,10},{6,8,6},{7,9,4},{1,5,4},{1,0,4},{9,7,3},{7,0,5},{6,5,8},{1,7,6},{4,0,9},{5,9,1},{8,7,3},{1,2,6},{4,1,5},{5,2,4},{1,9,1},{7,8,10},{0,4,2},{7,2,8}};
        System.out.println("Cheapest Flights Price : " + cp.findCheapestPrice(10,flights,6,0,7));

        System.out.println(Arrays.deepToString(flights));
    }
}
