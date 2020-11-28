package ru.mirea.praktika.praktika11;

import java.util.ArrayList;
import java.util.List;

public class ArrayQueueModule<E> {
    private ArrayList<E> queue=new ArrayList<E>();
    // Предусловие - входящий элемент не нулевой
    // Постусловие - добавление элемента в очередь
    public void enqueue(E element){
        if(element!=null) queue.add(element);
    }
    public ArrayList<E> getList() {
        return queue;
    }
    // Предусловие - очередь не пуста
    // Постусловие - возвращение ненулевого элемента
    public E element(){
        if(!queue.isEmpty()) return  queue.get(0);
        return null;
    }

    // Предусловие - очередь не пуста
    // Постусловие - удаление элемента и его возвращение
    public E dequeue(){
        if(!queue.isEmpty()){
            E temp=queue.get(0);
            queue.remove(0);
            return temp;
        }
        return null;
    }

    public int size(){
        return queue.size();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void clear(){
        queue.clear();
    }

    @Override
    public String toString() {
        return "ArrayQueueModule: " + queue;
    }
}
