package May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int stars=0,pettamcounter=0,i=0,j=0;
        ArrayList<Character> arr = new ArrayList<>();
        HashMap<Character,Integer> hm = new HashMap<>();
        while(stars<tasks.length-1)
        {
            if(i==0) stars=0;
            if(tasks[i] == '*')
            {
                stars++;
                i++;
                continue;
            }

            if(hm.containsKey(tasks[i]))
            {
                System.out.println("hm.get " + hm.get(tasks[i]));
                if(j-hm.get(tasks[i]) > n)
                {
                    arr.add(tasks[i]);
                    hm.put(tasks[i],j);
                    pettamcounter=1;
                    tasks[i]='*';
                    j++;
                }
            }
            else {
                arr.add(tasks[i]);
                hm.put(tasks[i],j);
                pettamcounter=1;
                tasks[i]='*';
                j++;
            }
            System.out.println(tasks);
            System.out.println(arr);
            System.out.println(hm);
            System.out.println("i : " + i + " j : " + j + " n : " + tasks.length + " pettam :" + pettamcounter);
            i++;

            if(i==tasks.length)
            {
                System.out.println("Lopala pettam : " + pettamcounter + " i : " + i + " stars :" + stars);
                if(pettamcounter==0)
                {
                    arr.add('-');
                    j++;
                }
                i=0;
                pettamcounter=0;
            }
        }
        return arr.size();
    }
    public static void main(String[] args)
    {
        TaskScheduler ts = new TaskScheduler();
        char[] tasks = new char[]{'A','A','A','B','B','B'};
        System.out.println(ts.leastInterval(tasks,2));
    }
}
