package ru.vsu.cs.MyTestPrograms;

public class ThreeFour {
    public static void main(String[] args) {
        priamougolnik(6);
    }

    public static void priamougolnik(int h) { //h - высота

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
        }

    }

}

