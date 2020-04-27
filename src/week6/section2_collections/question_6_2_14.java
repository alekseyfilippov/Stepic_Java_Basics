package week6.section2_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class question_6_2_14 {
    /*
     * Вопрос: Реализуйте метод, вычисляющий симметрическую разность двух множеств.
     *
     * Метод должен возвращать результат в виде нового множества.
     * Изменять переданные в него множества не допускается.
     *
     * Пример
     *
     * Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.

     *
     *
     * Ответ: см. ниже
     *
     */

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);

        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            T item = it.next();
            if (set1.contains(item) && set2.contains(item)) {
                it.remove();
            }
        }

        return set;
    }
}
