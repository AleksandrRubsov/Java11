package ru.mirea.praktika.praktika11;

import java.util.LinkedList;
import java.util.List;

public class LinkedQueue<E> implements Queue<E>{
    private List<E> queue;
    private int size;

    public LinkedQueue() {
        queue = new LinkedList<>();
        size = 0;
    }

    @Override
    public void enqueue(E e) {
        assert e != null;
        size++;
        queue.add(e);
    }

    @Override
    public E element() {
        assert !queue.isEmpty();
        return queue.get(0);
    }

    @Override
    public E dequeue() {
        assert !queue.isEmpty();
        E temp = queue.get(0);
        queue.remove(0);
        size--;
        return temp;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public String toString() {
        return "LinkedQueue " + queue.toString();
    }
}
