package sort.insertion;

public class Insertion {
    public void sort(int[] arr, int n) {
        int key, j;
        for (int i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j>=0 && key < arr[j] ) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
