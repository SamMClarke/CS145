public class ArrayIntListMain
{
    public static void main(String[] args)
    {
        ArrayIntList list = new ArrayIntList();
        
        System.out.println(list);

        list.add(24);
        list.add(18);
        list.add(-267);

        System.out.println(list);

        System.out.println(list.indexOf(18));
        System.out.println(list.indexOf(34));

        System.out.println(list.size());
        System.out.println(list.get(0));

        list.remove(2);

        System.out.println(list);

        list.add(2,99);

        System.out.println(list);

        list.remove(1);
        
        System.out.println(list);

        // Special cases for testing
        // Empty
        // Front
        // Middle/general
        // End
    }
}