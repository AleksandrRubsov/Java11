package ru.mirea.praktika.praktika11;

public abstract class AbstractQueue <E> implements Queue <E> {
    private int size = 0;
    @Override
    public void enqueue(E e) {
        assert e != null;
        size++;
         push(e);
    }
    public abstract boolean push(E e);

    @Override
    public E element() {
        assert size > 0;
        return peek();
    }

    public abstract E peek();

    @Override
    public E dequeue() {
        assert size > 0;
        size--;
        return remove();
    }

    public abstract E remove();

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {

    }
}
