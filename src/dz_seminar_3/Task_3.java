package dz_seminar_3;

import javax.naming.InsufficientResourcesException;
import java.time.chrono.MinguoChronology;
import java.util.*;
import java.util.stream.IntStream;

public class Task_3 {
    public static void main(String[] args) {
        Integer[] arr = {4, 2, 7, 5, 1, 3, 8, 6, 9};

        SortArray(arr);

        MinNumber(arr);

        MaxNumber(arr);

        NumberAverage(arr);
    }
    public static void SortArray(Integer[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);
        System.out.println(list);
    }


    public static void MinNumber(Integer[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int minNumber = Collections.min(list);
        System.out.println("Minimum is" + " " + minNumber);
    }


    public static void MaxNumber(Integer[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int maxNumber = Collections.max(list);
        System.out.println("Maximum is" + " " + maxNumber);
    }


    public static void NumberAverage(Integer[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        double res = 0;
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            res = res + list.get(i);
        }
        System.out.println("Average is" + " = " + res / arr.length);
    }
}
