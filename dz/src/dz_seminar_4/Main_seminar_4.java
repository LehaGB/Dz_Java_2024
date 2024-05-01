package dz_seminar_4;

public class Main_seminar_4 {
    public static void main(String[] args) {
        Task_2<Integer> integerTask2 = new Task_2<>();
        if(args.length == 0){
            integerTask2.enqueue(1);
            integerTask2.enqueue(10);
            integerTask2.enqueue(15);
            integerTask2.enqueue(5);
        }
        else {
            integerTask2.enqueue(Integer.parseInt(args[0]));
            integerTask2.enqueue(Integer.parseInt(args[1]));
            integerTask2.enqueue(Integer.parseInt(args[2]));
            integerTask2.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(integerTask2.getElements());

        integerTask2.dequeue();
        integerTask2.dequeue();
        System.out.println(integerTask2.getElements());

        System.out.println(integerTask2.first());
    }
}
