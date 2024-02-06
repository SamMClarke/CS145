import java.util.*;
import java.io.*;

public class UsingMaps
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("zoo", 9);
        map.put("hello", 5);
        map.put("computer", 3);
        map.put("apple", 8);

        System.out.println(map);

        map.put("apple", 1);
        System.out.println(map);

        map.remove("hello");
        System.out.println(map);

        System.out.println(map.containsKey("computer"));
        System.out.println(map.containsKey("dog"));

        for(String s : map.keySet())
        {
            System.out.println(s + ": " + map.get(s));
        }

        Scanner input = new Scanner(new File("hamlet.txt"));
        Map<String, Integer> hamletWordCounts = getCounts(input);

        for(String word : hamletWordCounts.keySet())
        {
            System.out.println(word + ": " + hamletWordCounts.get(word));
        }
    }

    public static Map<String, Integer> getCounts(Scanner input)
    {
        Map<String, Integer> counts = new HashMap<String, Integer>();
        while(input.hasNext())
        {
            String word = input.next();
            if (!counts.containsKey(word))
            {
                counts.put(word, 0);
            }
            counts.put(word, counts.get(word) + 1);
        }

        return counts;
    }
}