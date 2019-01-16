package behavior.iterator.example2;

public class Cat {
    public Cat(int id) {
        super();
        this.id = id;
    }

    private int id;

    @Override
    public String toString() {
        return "cat:" + id;
    }
}
