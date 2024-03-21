package Mar20;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();
        int i = 0;
        int n = intervals.length;


        while (i < n && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }


        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);

        while (i < n) {
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args)
    {
        InsertInterval in = new InsertInterval();
        int[][] ints = new int[][]{{1,2},{3,6},{7,8},{9,10},{12,14}};
        int[] inter=new int[]{5,10};

        System.out.println(Arrays.deepToString(in.insert(ints,inter)));
    }
}
