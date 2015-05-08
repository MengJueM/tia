package local;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Sorts {
    public static void sort(Class<? extends SortStrategy> sortStrategy, List<Comparable> items) throws
            NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Method m = sortStrategy.getMethod("execute", List.class);
        m.invoke(sortStrategy.newInstance(), items);
    }
}
