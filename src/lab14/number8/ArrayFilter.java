package lab14.number8;
import java.util.ArrayList;
import java.util.List;

public class ArrayFilter {
    public static <T> T[] filter(T[] array, Filter filter) {
        List<T> filteredList = new ArrayList<>();

        for (T item : array) {
            if (filter.apply(item)) {
                filteredList.add(item);
            }
        }

        @SuppressWarnings("unchecked")
        T[] filteredArray = (T[]) new Object[filteredList.size()];
        return filteredList.toArray(filteredArray);
    }

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date"};

        Filter stringFilter = new Filter() {
            @Override
            public boolean apply(Object o) {
                return ((String) o).length() > 5; // Пример фильтрации по длине строки
            }
        };

        Object[] filteredStrings = filter(strings, stringFilter);

        for (Object str : filteredStrings) {
            System.out.println(str);
        }
    }
}
