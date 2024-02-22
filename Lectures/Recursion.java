public class Recursion
{
    public static void main(String[] args)
    {
        printStarsLoop(10);
        printStarsRecursive(10);

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //55
        System.out.println(sumArray(arr));
    }

    public static int sumArray(int[] array)
    {
        return sumArrayHelper(array, 0);
    }

    private static int sumArrayHelper(int[] array, int index)
    {
        if (index >= array.length)
        {
            return 0;
        }
        else
        {
            return array[index] + sumArrayHelper(array, index + 1);
        }
    }
    public static void printStarsLoop(int numTimes)
    {
        for (int i = 0; i < numTimes; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStarsRecursive(int num)
    {
        if (num == 0)
        {
            System.out.println();
        }
        else
        {
            System.out.print("*");
            printStarsRecursive(num - 1);
        }
    }
}
