package local;

import java.util.List;

public interface SortStrategy<T> {
    void execute(List<Comparable<T>> items);
}
