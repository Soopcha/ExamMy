package ru.vsu.cs.MyTestPrograms;

public class TwoTwo {
    public static void main(String[] args) {
       posledovatelnost(9);
    }

    public static void posledovatelnost(int n){

        int count = 0;
        for(int i = 1; i <= n; i++){
            int ch = i;
            for (int j = 1; j<= i-1; j++ ){
                ch = ch + i + j;
            }
            if (i != n){
                System.out.print(ch+ ", ");
            } else {
                System.out.print(ch);
            }
        }
    }
}
