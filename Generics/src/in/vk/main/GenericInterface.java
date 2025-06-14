package in.vk.main;

public interface Container<T> {
    void add(T item);
    T get();
}

public class GenericInterface implements Container<String> {
    private String item;

    @Override
    public void add(String item) {
        this.item = item;
    }

    @Override
    public String get() {
        return item;
    }
}