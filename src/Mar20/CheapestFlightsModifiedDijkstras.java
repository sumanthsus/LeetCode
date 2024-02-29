package Mar20;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightsModifiedDijkstras {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }

        int m = flights.length;

        for (int[] flight : flights) {
            adj.get(flight[0]).add(new Pair(flight[1], flight[2]));
        }

        Queue<Triple> edges = new LinkedList<>();

        edges.add(new Triple(0,src,0));

        int[] dist = new int[n];

        Arrays.fill(dist,999999999);

        dist[src]=0;

        while(!edges.isEmpty())
        {
            int node = edges.peek().second;
            int cost = edges.peek().third;
            int kvalue = edges.peek().first;

            edges.remove();
            if(kvalue>k)
                continue;

            for(Pair iter: adj.get(node))
            {
                int next= iter.first;
                int daanikidist = iter.second;

                if(cost+daanikidist < dist[next])
                {
                    dist[next] = cost + daanikidist;
                    edges.add(new Triple(kvalue+1,next,cost+daanikidist));
                }

            }

        }

        if(dist[dst] == 999999999) return -1;

        return dist[dst];

    }


    public static void main(String[] args)
    {
        CheapestFlightsModifiedDijkstras cp = new CheapestFlightsModifiedDijkstras();

        int[][] flights= {{3,4,4},{2,5,6},{4,7,10},{9,6,5},{7,4,4},{6,2,10},{6,8,6},{7,9,4},{1,5,4},{1,0,4},{9,7,3},{7,0,5},{6,5,8},{1,7,6},{4,0,9},{5,9,1},{8,7,3},{1,2,6},{4,1,5},{5,2,4},{1,9,1},{7,8,10},{0,4,2},{7,2,8}};
        System.out.println("Cheapest Flights Price : " + cp.findCheapestPrice(10,flights,6,0,7));

        System.out.println(Arrays.deepToString(flights));
    }
}

class Pair{
    int first,second;
    Pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}
class Triple{
    int first,second,third;

    Triple(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
