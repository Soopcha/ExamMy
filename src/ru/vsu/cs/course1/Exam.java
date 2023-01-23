package ru.vsu.cs.course1;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для реализации задач
 */
public class Exam {

    public static void task1(int n) {
        return;
    }

    public static void task2(int n) {
        int count = 0;
        int ch = -1;
        for(int i = 1; i <= n; i++){
            count++;
            ch = count;
            for (int j = 1; j<= count-1; j++ ){
                ch = ch + count + j;
            }
            if (i != n){
                System.out.print(ch+ ", ");
            } else {
                System.out.print(ch);
            }
        };
    }

    public static void task3(int h) {
        int count = h+1;
        for (int i = 1; i <= h; i++) {
            count--;
            for (int j = 1; j <= h; j++) {
                if (i == 1 || i == h) {
                    // System.out.print(" " + ("-" * 3) + " ");
                    if (j == 1 || j == h) {
                        System.out.print(" ");
                    } else {
                        System.out.print("-");
                    }
                } else {
                    if (j == 1 || j == h) {
                        System.out.print("|");
                    } else {
                        if (j == count) {
                            System.out.print("/");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        };
    }

    public static void task4(int h, int w) {
        return;
    }

    public static int task5(int[] arr) {
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

    public static int task6(int[][] arr) {
        int count = 0;
        for (int j = 0; j <= arr[0].length - 1; j++) {
            if (proverkaColumn(arr, j)) {
                count++;
            }
        }
        return count;
    }

    public static void task7(int[][] arr) {
        return;
    }

    public static int[][] task8(int[][] arr) {
        int count = -1;
        for (int i = arr.length-1; i >= 0; i--){
            count++;
            for (int j = arr[i].length-1; j >= 0; j--){
                arr[i][j]=Math.abs(count + (j - (arr[i].length-1)));  // == - сравниваем = - присваиваем

            }
        }
        return arr;
    }

    public static List<Integer> task9(List<Integer> list) {
        List<Integer> listFinish = new ArrayList<>();

        int nomber = 0;// число которое мы будем проверять на локальный минимум
        int left = 0;  // число слева от него
        int right = 0; // число справа от него

        int length = list.size();
        int count = 0; // эл списка на котором мы находимся в данный момент пока перебираем эти эл

        for (int value : list) {
            count++;
            if (count == 1) {
                right = value;
            } else if (count == 2) {
                nomber = right;
                right = value;
            } else {
                left = nomber;
                nomber = right;
                right = value;
            }


            if (((count >= 3) && (right <= nomber || left <= nomber)) || (count == 2 && right <= nomber)) {
                listFinish.add(nomber);
            }
            if (count == length) {
                left = nomber;
                nomber = right;
                if (left <= nomber) {
                    listFinish.add(nomber);
                }
            }
        }
        return listFinish;
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
        for (int i = 0; i <= arr.length - 1; i++) {
            if (proverkaNaUslovie(arr[i][j])) {
                return true;
            }
        }
        return false;
    }
}
