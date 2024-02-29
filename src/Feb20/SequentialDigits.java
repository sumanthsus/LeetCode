package Feb20;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> arr = new ArrayList<>();
        String str = "123456789";
        int lowdigits = (int)Math.log10(low) +1;
        int highdigits = (int) Math.log10(high) + 1;

        System.out.println(lowdigits + " " + highdigits);

        int elem = (int) (low/Math.pow(10,lowdigits-1));


        for(int i= lowdigits;i<=highdigits;i++,elem=1)
        {
            for(int j=elem-1;j+i<9+1;j++)
            {
                System.out.println(str.substring(j, j + i));
                int ar = Integer.parseInt(str.substring(j,j+i));
                if(low<=ar && ar<=high) {
                    arr.add(ar);
                }
            }
        }

        /*int lowdigits=0,lowstart=low,highth=1,a=0;
        /*while(lowstart>=10)
        {
            lowstart = lowstart/10;         //
            lowdigits++;
            highth*=10;
        }
        System.out.println(lowdigits);

        lowdigits = (int) Math.log10(low) + 1;
        System.out.println(lowdigits);
        /*
        // Calculate the number of digits in the low number
    int lowDigits = (int) Math.log10(low) + 1;

    // Calculate the highest power of 10 less than or equal to low
    int highPower = (int) Math.pow(10, lowDigits - 1);


        //lowdigits++;
        int highend = high/highth;
        System.out.println(lowstart + " "+ lowdigits +" " + highend);
        int digits = lowdigits;
        for( int i=lowstart;i<highend;i++)
        {
            a = i;
            int papam = a;
            while(digits>0)
            {
                if(papam==9)
                {
                    break;
                }
                a = a*10 + (papam+1);
                papam++;
                digits--;
            }
            digits = lowdigits;
            if(low<a&&a<high)
            {
                arr.add(a);
            }

        }*/
        return arr;
    }

    public static void main(String[] args)
    {
        SequentialDigits ds = new SequentialDigits();

        System.out.println(ds.sequentialDigits(234,2314).toString());
    }

}
