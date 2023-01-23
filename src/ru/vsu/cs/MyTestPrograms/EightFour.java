package ru.vsu.cs.MyTestPrograms;

import java.util.Arrays;

public class EightFour {
        public static void main(String[] args) {
            int[][] arr = new int[8][4];
            arr = fillingTheArray(arr);

            for (int i = 0 ; i <= arr.length-1; i++){
                System.out.println(Arrays.toString(arr[i]));
            }
        }

    public static int[][] fillingTheArray (int[][] arr){
        // первое строки второе столбцы

        int count = -1;
        for (int i = arr.length-1; i >= 0; i--){
            count++;
            for (int j = arr[i].length-1; j >= 0; j--){
                arr[i][j]=Math.abs(count + (j - (arr[i].length-1)));  // == - сравниваем = - присваиваем

            }
        }
        return arr;
    }
}
