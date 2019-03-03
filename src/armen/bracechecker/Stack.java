package armen.bracechecker;

public interface Stack <T>{
    T pop();
    void push(T t);
    void reset();
    boolean isEmpty();
}
