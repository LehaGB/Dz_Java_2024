package dz_seminar_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task_2 {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        RemovingEvenNumbers(arr1);
    }
    public static List<Integer> RemovingEvenNumbers(Integer[] arr){
        List<Integer> n = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                n.add(arr[i]);
            }
        }
        System.out.println(n);
        return n.stream().filter(x -> x % 2 != 0).distinct().collect(Collectors.toList());
    }
}
