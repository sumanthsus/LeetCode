package Mar20;

public class CustomSortString {

    public String customSortString(String order, String s) {
        char[] way = order.toCharArray();
        StringBuilder str = new StringBuilder(s);
        StringBuilder matching = new StringBuilder();
        int del =0;
        for(char ch:way){
            char[] ch2=s.toCharArray();
            for(int i=0;i<ch2.length;i++)
            {
                if(ch==ch2[i])
                {
                    int j=i;
                    matching.append(ch);
                    //System.out.println("matching : " + matching + " strbuild : " + str + " s : " + s + " i :" +i+ " j : " + j + " del : " + (j-del) );
                    str.deleteCharAt(j-del);
                    del++;
                }

            }
            del=0;
            s=str.toString();
        }

        return matching.append(str).toString();
    }
    public static void main(String[] args)
    {
        CustomSortString css= new CustomSortString();
        System.out.println(css.customSortString("kqep","pekeq"));
    }
}
