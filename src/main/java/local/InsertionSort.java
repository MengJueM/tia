package local;

import java.util.List;

public class InsertionSort<T> implements SortStrategy<T> {
    public void execute(List<Comparable<T>> items) {
        for (int i = 0; i < items.size(); i++) {
            sortify(items, i);
        }
        System.out.println(items);
    }

    @SuppressWarnings("unchecked")
    private void sortify(List<Comparable<T>> items, int curIndex) {
        int insertIndex = curIndex;
        if (curIndex < items.size()) {
            for (int i = 0; i <= curIndex; i++) {
                if (items.get(i).compareTo((T) items.get(curIndex)) > 0) {
                    insertIndex = i;
                    break;
                }
            }
            swap(items, curIndex, insertIndex);
        } else {
            throw new IllegalArgumentException("curIndex is out of range of total size of items");
        }
    }

    private void swap(List<Comparable<T>> items, int curIndex, int insertIndex) {
        Comparable<T> temp = items.get(curIndex);
        for (int i = curIndex; i > insertIndex; i--) {
            items.set(i, items.get(i - 1));
        }
        items.set(insertIndex, temp);
    }
}
