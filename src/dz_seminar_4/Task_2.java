package dz_seminar_4;

import java.util.Arrays;
import java.util.LinkedList;

public class Task_2<T> {

    LinkedList<T> intList = new LinkedList<>();

    public void enqueue(T element){
        // Напишите свое решение ниже
        intList.addLast(element);
    }

    public T dequeue(){
        // Напишите свое решение ниже
        if(intList == null){
            throw new RuntimeException("Список пуст");
        }
        else {
           return intList.pop();
        }
    }

    public T first(){
        // Напишите свое решение ниже
        if(intList == null){
            throw new RuntimeException("Список пуст");
        }
        else {
            return intList.getFirst();
        }
    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return intList;
    }
}
