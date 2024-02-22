import java.util.*;
public class MidtermCorrections
{
    public static void main(String[] args)
    {
        int[] list = {0,1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(list));
        rotateEveryN(list, 3);
        System.out.println(Arrays.toString(list));
        System.out.println(test());
    }

    public static void rotateEveryN(int[] list, int n)
    {
        int[] array = new int[list.length];
        boolean noMoreSwaps = false;
        for (int i = 0; i < list.length; i++)
        {
            if (i % n == 0 || noMoreSwaps)
            {
                if (i + (n-1) < list.length)
                {
                    array[i] = list[i + (n-1)];
                }
                else
                {
                    noMoreSwaps = true;
                    array[i] = list[i];
                }
            }
            else
            {
                array[i] = list[i-1];
            }
        }

        for (int i = 0; i < list.length; i++)
        {
            list[i] = array[i];
        }
    }

    public static double test()
    {
        double total = 5.8;
        int[] array = new int[10];
        return total/array.length;
    }
}
