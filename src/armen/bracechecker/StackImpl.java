package armen.bracechecker;

public class StackImpl<T> implements Stack<T> {

    private static int CAPACITY = 16;
    private Object[] value;
    private int tos;

    public StackImpl(int capacity){
        this.value = new Object[capacity];
        tos = -1;
    }
    public StackImpl(){
        this(CAPACITY);
    }

    public T pop(){
        if(tos == -1){
            return null;
        }
        return (T)value[tos--];
    }

    public void push(T t){
        if(tos == value.length - 1){
            ensureCapasity();
        }
        value[++tos] = t;
    }

    private void ensureCapasity(){
        Object[] newValue = new Object[(int)(1.5 * value.length) + 1];
        System.arraycopy(value, 0, newValue, 0, value.length);
            value = newValue;
        }

    public void reset(){
        tos = -1;
    }

    public boolean isEmpty(){
        return tos == -1;
    }
}
