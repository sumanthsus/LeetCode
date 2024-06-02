package May;

import java.util.Arrays;

public class EventConflict {
    public boolean haveConflict(String[] event1, String[] event2) {
        /*String[] s1=new String[2];
        String[] s2=new String[2];
        if(Integer.parseInt(event1[0].split(":",2)[0])>Integer.parseInt(event2[0].split(":", 2)[0]))
        {
            s2 = event1[0].split(":", 2);
            s1 = event2[1].split(":", 2);
        }
        else if(Integer.parseInt(event1[0].split(":",2)[0])<Integer.parseInt(event2[0].split(":", 2)[0])){
            s1 = event1[1].split(":", 2);
            s2 = event2[0].split(":", 2);
        }
        else {
            if(Integer.parseInt(event1[0].split(":",2)[1])>Integer.parseInt(event2[0].split(":", 2)[1]))
            {
                s2 = event1[0].split(":", 2);
                s1 = event2[1].split(":", 2);
            }
            else if(Integer.parseInt(event1[0].split(":",2)[1])<Integer.parseInt(event2[0].split(":", 2)[1])){
                s1 = event1[1].split(":", 2);
                s2 = event2[0].split(":", 2);
            }

        }

        System.out.println(Arrays.toString(s1) +"  - " + Arrays.toString(s2));

        if(Integer.parseInt(s1[0]) > Integer.parseInt(s2[0]))
        {
            return true;
        }
        else if (Integer.parseInt(s1[0]) == Integer.parseInt(s2[0]))
        {
            return Integer.parseInt(s1[1]) >= Integer.parseInt(s2[1]);
        }
        return false;*/

        System.out.println(event1[0].compareTo(event2[1]));

        return event1[0].compareTo(event2[1]) <= 0 && event2[0].compareTo(event1[1]) <= 0;
    }
    public static void main(String[] args)
    {
        EventConflict ec = new EventConflict();
        String[] s1 = new String[]{"08:27","15:55"};
        String[] s2 = new String[]{"08:21","08:23"};
        System.out.println(ec.haveConflict(s1,s2));

    }
}
