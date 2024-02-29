package Feb20;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DailyTemps {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> deque = new ArrayDeque<>();

        int[] res = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; --i) {
            if (deque.isEmpty()) {
                deque.offerFirst(i);
                res[i] = 0;
                System.out.println("First condition : " + deque);

            } else {
                while (!deque.isEmpty() && temperatures[i] >= temperatures[deque.peekFirst()]) {
                    System.out.println("Loop lo "+i+" temp : " + temperatures[i]+" "+deque);
                    deque.pollFirst();
                }
                System.out.println(deque);
                System.out.println(Arrays.toString(res));
                if (deque.isEmpty()) {
                    res[i] = 0;
                } else {
                    res[i] = deque.peekFirst() - i;
                }
                deque.offerFirst(i);
            }
        }

        return res;
    }
        /*int[] days = new int[temperatures.length];
        int count=1;
        for(int i=0;i<temperatures.length;i++)
        {
            for(int j=i;j<days.length-1;j++)
            {
                if(temperatures[i]<temperatures[j+1])
                {
                    System.out.println("temp["+i+"] : "+ temperatures[i]+" temp["+(j+1)+"] : " + temperatures[j+1]+" count : "+count);
                    days[i]=count;
                    count =1;
                    j=days.length-1;
                }
                else
                {
                    System.out.println("temp["+i+"] : "+ temperatures[i]+" temp["+(j+1)+"] : " + temperatures[j+1] + " count : " + count + " days.length " + (days.length-1));
                    count++;
                    if(j+1==days.length-1)
                    {
                        days[i] = 0;
                        count =1;
                    }
                }
            }
        }
        return days;*/

    public static void main(String[] args)
    {
        DailyTemps dt = new DailyTemps();
        int[] arr =  new int[]{55,38,53,81,61};
        int[] res = dt.dailyTemperatures(arr);
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}
