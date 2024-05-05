package dz_seminar_5;

import java.util.Arrays;

public class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        for (int i = (sortLength -1) / 2; i >= 0; i--) {
            heapify(tree, i, sortLength);
        }
    }
    public static void heapSort(int[] sortArray, int sortLength) {
        int[] tree = new int[sortLength];
        System.arraycopy(sortArray, 0, tree, 0, sortLength);
        buildTree(tree, sortLength);

        for (int i = sortLength - 1; i >= 0; i--) {
            int temp = tree[0];
            tree[0] = tree[i];
            tree[i] = temp;
            heapify(tree, 0, i);
        }

        System.arraycopy(tree, 0, sortArray, 0, sortLength);
    }
    private static void heapify(int[] tree, int root, int heapSize) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < heapSize && tree[left] > tree[largest]) {
            largest = left;
        }

        if (right < heapSize && tree[right] > tree[largest]) {
            largest = right;
        }

        if (largest != root) {
            int temp = tree[root];
            tree[root] = tree[largest];
            tree[largest] = temp;
            heapify(tree, largest, heapSize);
        }
    }
    public static void main(String[] args) {
        int[] sortArray = {5, 8, 12, 3, 6, 9};
        int sortLength = sortArray.length;

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(sortArray));

        heapSort(sortArray, sortLength);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(sortArray));
    }
}
