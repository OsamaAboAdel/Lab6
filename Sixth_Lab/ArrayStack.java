package Sixth_Lab;

/**
 * Created by ${*  Osama Abo Adel  *} on 2/15/2022.
 */
public class ArrayStack<E> implements Stack<E>{
    static final int CAPACITY=100;
    E []data;
    int t=-1;

    public ArrayStack(int c) {
        data= (E[]) new Object[c];
    }

    public ArrayStack() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return data[t];
    }

    @Override
    public E pop() {
        E x;
        if (isEmpty())return null;
        x=data[t];
        data[t]=null;
        t--;
        return x;
    }

    @Override
    public void push(E element) {
        if (size()== data.length)
            throw new IllegalStateException("Stack is full ");
        data[++t] = element;
    }
}
