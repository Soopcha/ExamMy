package ru.vsu.cs.MyTestPrograms;

public class FiveOne {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 3, 6, 5, 7, 6, 7, 3, 8, 123 };
        System.out.println(lastOfMaxIndex(arr));
    }

    public static int lastOfMaxIndex(int[] arr) {
        int maxEl = Integer.MIN_VALUE;
        int indOfMaxEl = -1;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > maxEl) {
                maxEl = arr[i];
                indOfMaxEl =i;
            }
        }
        return indOfMaxEl;
    }
}
