public class Point implements Comparable<Point>
{
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    public int compareTo(Point other)
    {
        if (this.x != other.x)
        {
            return this.x - other.x;
        }
        else if (this.y != other.y)
        {
            return this.y - other.y;
        }
        return 0;
    }
}