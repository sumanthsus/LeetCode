package May;

public class MaxElemAvoid {

    public static int max_reachable_index(int steps, int badElement) {int N=steps,B=badElement;
        int s = 0;
        for (int i = 1; i <= steps; i++) {
            s += i;
            if (s == badElement) {
                int sum_of_natural_nos = steps * (steps + 1) / 2;
                return sum_of_natural_nos - 1;
            }
        }
        return s;

        /*int max_index = 0;
        for (int i = 1; i <= steps; i++)
        {
            max_index += i;
        }
        int current_index = max_index,
                step = steps;

        while (true)
        {
            while (current_index > 0 &&
                    steps > 0)
            {
                current_index -= steps;
                if (current_index == badElement)
                {
                    current_index += steps;
                }
                steps--;
            }

            if (current_index <= 0)
            {
                //System.out.print(max_index + "\n");
                break;
            }

            else
            {
                steps = step;
                current_index = max_index - 1;
                max_index--;

                if (current_index == badElement)
                {
                    current_index = max_index - 1;
                    max_index--;
                }
            }
        }
        return max_index;*/
    }
    public static void main(String[] args)
    {
        int Num = 4;
        int Bad = 6;
        System.out.println(max_reachable_index(Num, Bad));
    }
}
