import java.util.*;

public class UsingArrayLists
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Summing up all the values in the stack while preserving the original stack
        int sum = stack.stream().mapToInt(Integer::intValue).sum();

        // Outputting the sum
        System.out.println("Sum of values in the stack: " + sum);

        // Original stack remains intact
        System.out.println("Original stack: " + stack);
        System.out.println(stack.pop());
        // List<String> list = new ArrayList<String>();

        // list.add("hello");
        // list.add("snow");
        // list.add("alphabet");
        // list.add("computers");

        // System.out.println(list);

        // list.add(2, "lights");

        // System.out.println(list);

        // list.remove(1);

        // System.out.println(list);

        // System.out.println(list.get(3));

        // System.out.println(list.size());

        // for (int i = 0; i < list.size(); i++)
        // {
        //     System.out.print(list.get(i) + ", ");
        // }

        // for (String word : list)
        // {
        //     System.out.print(word + ", ");
        // }
        // System.out.println();

        // Collections.sort(list);

        // System.out.println(list);

        // List<Integer> intList = new ArrayList<Integer>();

        // intList.add(4);
        // intList.add(-16);
        // intList.add(8);

        // System.out.println(intList);
        
        // Collections.sort(intList);

        // System.out.println(intList);

        // List<Point> points = new ArrayList<Point>();

        // points.add(new Point(2, 2));
        // points.add(new Point(1, -1));
        // points.add(new Point(2, 2));

        // System.out.println(points);

        // Collections.sort(points);

        // System.out.println(points);
    }
}