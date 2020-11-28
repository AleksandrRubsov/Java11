package ru.mirea.praktika.praktika11;

public class test {
    public static void main(String[] args){
        ArrayQueueModule<Integer> queueModule=new ArrayQueueModule<>();
        for(int i=0;i<5;i++){
            queueModule.enqueue(i);
        }
        System.out.println("Первый элемент в ArrayQueueModule: "+queueModule.element());
        System.out.println("Удалить и вернуть первый элемент в ArrayQueueModule: "+queueModule.dequeue());
        System.out.println("Размер ArrayDequeueModule: "+queueModule.size());
        System.out.println("Является ли ArrayDequeModule пустым: "+queueModule.isEmpty());
        System.out.println(queueModule);
        queueModule.clear();
        ArrayQueueADT<Integer> queueADT=new ArrayQueueADT<>();
        for(int i=0;i<5;i++){
            queueADT.enqueue(queueModule.getList(),i);
        }
        System.out.println("Размер ArrayQueueADT: "+ queueADT.size(queueModule.getList()));
        ArrayQueue<Integer> queue=new ArrayQueue<>(queueModule.getList());
        System.out.println("Первый элемент в ArrayQueue: "+queueModule.element());
        System.out.println(queue);
    }
}
