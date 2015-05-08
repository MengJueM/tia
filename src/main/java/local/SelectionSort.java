package local;

import java.util.List;

public class SelectionSort<T> implements SortStrategy<T> {
    @SuppressWarnings("unchecked")
    public void execute(List<Comparable<T>> items) {
        for (int i = 0; i < items.size(); i++) {
            int smallest = i;
            for (int j = i; j < items.size(); j++) {
                if (items.get(smallest).compareTo((T) items.get(j)) > 0) {
                    smallest = j;
                }
            }
            swap(items, i, smallest);
        }
        System.out.println(items);
    }

    private void swap(List<Comparable<T>> items, int i, int j) {
        Comparable<T> temp = items.get(i);
        items.set(i, items.get(j));
        items.set(j, temp);
    }
}
