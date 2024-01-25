public class ArrayIntList
{
    private int[] elementData;
    private int size;

    public ArrayIntList()
    {
        elementData = new int[10];
        size = 0;
    }

    public String toString()
    {
        if (size == 0)
        {
            return "[]";
        }
        String result = "[" + elementData[0];
        for (int i = 1; i < size; i++)
        {
            result += ", " + elementData[i];
        }
        return result + "]";
    }

    public void add(int value)
    {
        elementData[size] = value;
        size++;
    }

    public int indexOf(int value)
    {
        for (int i = 0; i < size; i++)
        {
            if (elementData[i] == value)
            {
                return i;
            }
        }
        return -1;
    }

    public void remove(int index)
    {
        for (int i = index; i < size; i++)
        {
            elementData[i] = elementData[i+1];
        }
        size--;
    }

    public void add(int index, int value)
    {
        for (int i = size; i > index; i--)
        {
            elementData[i] = elementData[i-1];
        }
        elementData[index] = value;
        size++;
    }

    public int size()
    {
        return size;
    }

    public int get(int index)
    {
        return elementData[index];
    }
}