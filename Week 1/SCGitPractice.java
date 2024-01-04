// Sam Clarke
// Lecutre 3: Git Practice
// 1/4/2024

public class SCGitPractice
{
    public static void main(String[] args)
    {
        boolean IS_DONE = false;
        double k = 0.0;

        while(!IS_DONE)
        {
            if (k <= 10)
            {
                k += repeatString("Hi", 2);
            }
            else
            {
                IS_DONE = true;
            }
        }
    }

    public static int repeatString(String string, int times)
    {
        for(int i = 0; i < times; i++)
        {
            System.out.print(string + " ");
        }
        System.out.println();
        return times/2;
    }
}