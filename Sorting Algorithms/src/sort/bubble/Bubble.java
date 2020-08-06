package sort.bubble;

import sort.Swap;

public class Bubble {

    public void sort(int[] arr, int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]>arr[j]){
                    Swap.swap(arr, i, j);
                }
            }
        }
    }
}
