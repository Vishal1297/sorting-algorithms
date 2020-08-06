package sort;

import sort.bubble.Bubble;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {35, -40, 2, 91, 110, 22};
        int n = inputArray.length;
        Bubble bubbleSort = new Bubble();
        System.out.print("Sort With O(n^2) Complexity Output :: ");
        //  Sort With O(n^2) Complexity
        bubbleSort.sort(inputArray, n);
        for (int j : inputArray) {
            System.out.print(j + " ");
        }
    }
}
