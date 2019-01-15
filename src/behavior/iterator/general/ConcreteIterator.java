package behavior.iterator.general;

import java.util.List;

public class ConcreteIterator implements Iterator {

    private List<Object> list;
    // 当前游标位置
    private int cursor = 0;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {

        return cursor != list.size();
    }

    @Override
    public Object next() {
        Object obj = null;
        if (hasNext()) {
            obj = list.get(cursor++);
        }
        return obj;
    }
}