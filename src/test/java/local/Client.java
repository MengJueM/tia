package local;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException, InstantiationException {
        int[] ints = {4, 8, 15, 2, 32, 6, 12};
        List<Comparable> intList = new ArrayList<Comparable>();
        for (int i : ints) {
            intList.add(i);
        }
        Sorts.sort(SelectionSort.class, intList);
        Sorts.sort(InsertionSort.class, intList);
    }
}
