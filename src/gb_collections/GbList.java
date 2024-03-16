package gb_collections;

public interface GbList <T> extends Iterable<T>{
    void add(T value);
    void addd (int index, T value);
    T get (int index);
    void remove (T value);
    void removeByIndex (int index);
    int size();
}
