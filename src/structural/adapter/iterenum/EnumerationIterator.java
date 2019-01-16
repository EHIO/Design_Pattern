package structural.adapter.iterenum;

import java.util.*;

/**
 * 将枚举适配成迭代器
 *
 * @param <E>
 * @author gang.wang
 */
public class EnumerationIterator<E> implements Iterator<E> {
    // 被适配者
    Enumeration<E> enumeration;

    public EnumerationIterator(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {

        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {

        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }


    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("东邪");
        v.add("西毒");
        v.add("南帝");
        v.add("北丐");
        Iterator<String> iterator = new EnumerationIterator<>(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
