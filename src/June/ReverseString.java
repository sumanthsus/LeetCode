package June;

public class ReverseString {
    public void reverseString(char[] s) {

        int i=0;
        int j=s.length-1;
        while(i<j)
        {
            char c=s[i];
            s[i]=s[j];
            s[j]=c;
            i++;
            j--;
        }
    }
    public static void main(String[] args)
    {
        ReverseString rs = new ReverseString();
        char[] c = new char[]{'H','e','l','l','o'};
        rs.reverseString(c);
        System.out.println(c);
    }
}
