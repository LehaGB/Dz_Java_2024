package dz_seminar_4;

import java.util.LinkedList;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Object> ldResult = new LinkedList<>();


        System.out.println(revert(ldResult));
    }
    public static LinkedList<Object> revert(LinkedList<Object> ll){
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");
        LinkedList<Object> revertList = new LinkedList<>();
        for (int i = ll.size() - 1; i >= 0 ; i-- ){
            revertList.add(ll.get(i));
        }
        //System.out.println(ll);
        return revertList;
    }
}
