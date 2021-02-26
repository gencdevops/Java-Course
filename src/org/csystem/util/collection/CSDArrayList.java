package org.csystem.util.collection;

public class CSDArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private Object [] m_elems;
    private int m_index;

    private static void doWorkForIllegalArgumentException(String message)
    {
        System.out.println(message);
        System.exit(-1); //exception işlemleri konusuna kadar sabredin
    }

    private static void doWorkForIndexOutOfException(String message)
    {
        System.out.println(message);
        System.exit(-1); //exception işlemleri konusuna kadar sabredin
    }

    private void checkForIndex(int index)
    {
        if (index < 0 || index >= m_index)
            doWorkForIndexOutOfException("Index Out of bounds");
    }

    private void checkCapacityValue(int capacity)
    {
        if (capacity < 0)
            doWorkForIllegalArgumentException("Capacity can not be negative");
    }


}
