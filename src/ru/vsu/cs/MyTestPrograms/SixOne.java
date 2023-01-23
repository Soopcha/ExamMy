package ru.vsu.cs.MyTestPrograms;

public class SixOne {
    public static void main(String[] args) {
        System.out.println(proverkaNaUslovie(163));

        int[][] arr = {{145, 11, 100, 55, 10}, {3, 32, 45, 321, 20}, {5, 343, 23, 1, 120}};
        System.out.println(task6(arr));
    }

    public static int task6(int[][] arr) {
        int count = 0;
        for (int j = 0; j < arr[0].length; j++) {
            if (proverkaColumn(arr, j)) {
                count++;
            }
        }
        return count;
    }

    public static boolean proverkaNaUslovie(int ch) {
        int ostatok = Integer.MAX_VALUE;
        while (!(ch == 0)) {
            if (ostatok > ch % 10) {
                ostatok = ch % 10;
            } else {
                return false;
            }
            ch = ch / 10;
        }
        return true;
    }

    public static boolean proverkaColumn(int[][] arr, int j) {
        for (int i = 0; i < arr.length; i++) {
            if (proverkaNaUslovie(arr[i][j])) {
                return true;
            }
        }
        return false;
    }
}
