package Sixth_Lab;

/**
 * Created by ${*  Osama Abo Adel  *} on 2/15/2022.
 */
public interface Stack<E> {
    boolean isEmpty();
    int size();
    E top();
    E pop();
    void push(E element);
}
