package structural.adapter.iterenum;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * 将迭代器适配成枚举
 */
public class IteratorEnumeration<E> implements Enumeration<E> {
    // 被适配者
    Iterator<E> iterator;

    public IteratorEnumeration(Iterator<E> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public E nextElement() {
        return iterator.next();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("东邪");
        list.add("西毒");
        list.add("南帝");
        list.add("北丐");
        Enumeration<String> enumeration = new IteratorEnumeration<>(list.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
