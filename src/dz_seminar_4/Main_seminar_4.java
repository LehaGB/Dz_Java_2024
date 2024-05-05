package dz_seminar_4;

import java.util.ArrayList;
import java.util.Random;

public class Main_seminar_4 {
    public static void main(String[] args) {
        Integer[] arr = {9, 5, 1, 0, 3, 8, 3, 2};

        System.out.println(SortArray(arr));
    }
    public static Integer[] SortArray(Integer[] array){
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        Integer left;
        int[] right;
        int midlle = array.length / 2;
        for (int i = 0; i <= midlle; i++) {
            if(array[i] < midlle){
                result.add(array[i]);
                for (int j = 0; j <= result.size() - 1; j++) {
                    if(array[i] > result.get(j)){
                       int arr =  array[i];
                        array[i] = result.get(j);
//                        result.get(j) = arr;
                    }
                }
            }
//            else if(array[i] > midlle){
//                result.add(right = array[i]);
//            }
        }
        return array;
    }
}
