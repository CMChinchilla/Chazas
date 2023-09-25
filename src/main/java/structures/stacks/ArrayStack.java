package structures.stacks;

import structures.List;

public class ArrayStack<T> extends List {
    private static final int fixed = 3;
    private T top;

    public ArrayStack() {
        this(fixed);
    }
    public ArrayStack(int n) {
        count = 0;
        array = (T[]) new Object[n];
        size = n;
        top = null;
    }
    public void push(T item) {
        if(full())
            throw new RuntimeException("Stack is full");
        array[count]=item;
        top = item;
        count++;
    }
    public void pop() {
        if(empty())
            throw new RuntimeException("Stack is empty");
        if(count ==1){
            top = null;
        } else {
            top = (T) array[count -2];
        }
        array[count -1]=null;
        count--;
    }
    public T peek() {
        if(empty())
            throw new RuntimeException("Stack is empty");
        return top;
    }
}
