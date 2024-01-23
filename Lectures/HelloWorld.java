// CS 145, Lecture 1
// Sam Clarke
// Says hello to the world

class HelloWorld
{
    public static void main (String[] args)
    {
        System.out.println("Hello, world!");

        sayHello("Sam");

        int numTotal;
        numTotal = addNums(4, 9);
        System.out.println(numTotal);

        printLoop(numTotal);
    }

    public static void sayHello(String name)
    {
        System.out.println("Hello, " + name);
    }

    public static int addNums(int x, int y)
    {
        int total = x + y;
        System.out.println(x + " + " + y + " = " + total);
        return total;
    }

    public static void printLoop(int timesToPrint)
    {
        for (int i = 0; i < timesToPrint; i++)
        {
            System.out.print(i + " ");
        }
    }
}