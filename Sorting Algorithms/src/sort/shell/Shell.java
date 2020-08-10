package sort.shell;

public class Shell {
    public void sort(int[] arr, int n) {
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int element = arr[i];
                int j = i;
                while (j>= gap && arr[j-gap] > element){
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = element;
            }
        }
    }
}
