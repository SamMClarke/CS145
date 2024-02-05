import java.util.*;
import java.io.*;

public class UsingSets
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Set<String> set = new HashSet<String>();

        set.add("zoo");
        set.add("hello");
        set.add("monday");
        set.add("midterm");
        set.add("goodbye");

        System.out.println(set);

        set.remove("midterm");

        System.out.println(set);

        //try to add duplicate
        set.add("monday");

        System.out.println(set);

        Scanner input = new Scanner(new File("hamlet.txt"));
        Set<String> hamletWords = uniqueWords(input);

        System.out.println(hamletWords);

        for (String word : hamletWords)
        {
            System.out.println(word);
        }
    }

    public static Set<String> uniqueWords(Scanner input)
    {
        Set<String> words = new HashSet<String>();

        while (input.hasNext())
        {
            words.add(input.next());
        }

        return words;
    }
}