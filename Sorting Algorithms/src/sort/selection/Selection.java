package sort.selection;

import sort.Swap;

public class Selection {
    public void sort(int[] arr, int n){
        int min = 0;
        for (int i = 0; i < n-1; i++) {
            int j = min+1;
            for (; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            Swap.swap(arr, min, i);
        }
    }
}
