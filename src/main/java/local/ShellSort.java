package local;

import java.util.List;

@SuppressWarnings("unchecked")
public class ShellSort<T> implements SortStrategy<T> {
    private static final int GAP = 3;

    public void execute(List<Comparable<T>> items) {
        for (int i = GAP; i > 0; i--) {
            hSort(items, i);
        }
        System.out.println(items);
    }

    private void hSort(List<Comparable<T>> items, int curGap) {
        for (int i = 0; i + curGap < items.size(); i++) {
           if (items.get(i).compareTo((T) items.get(i + curGap)) > 0) {
                swap(items, i, i + curGap);
            }
        }
    }

    private void swap(List<Comparable<T>> items, int i, int j) {
        Comparable<T> temp = items.get(i);
        items.set(i, items.get(j));
        items.set(j, temp);
    }
}
