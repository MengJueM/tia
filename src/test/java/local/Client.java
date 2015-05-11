package local;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class Client {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException, InstantiationException {
        int[] ints = {4, 8, 15, 2, 32, 6, 12};
        List<Comparable> intList = new ArrayList<Comparable>();
        for (int i : ints) {
            intList.add(i);
        }
        List intList1 = new ArrayList<Comparable>(intList);
        List intList2 = new ArrayList<Comparable>(intList);
        List intList3 = new ArrayList<Comparable>(intList);
        Sorts.sort(SelectionSort.class, intList1);
        Sorts.sort(InsertionSort.class, intList2);
        Sorts.sort(ShellSort.class, intList3);
    }
}
