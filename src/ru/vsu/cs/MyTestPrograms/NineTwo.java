package ru.vsu.cs.MyTestPrograms;

import java.util.ArrayList;
import java.util.List;

public class NineTwo {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(234);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(3);
        list.add(1);
        System.out.println(list);

        System.out.println(fanctionOfFindingWithoutLocalMinimums(list));
        System.out.println(task9(list));

    }
//Вариант почему-то не совсем пашущий ну и хуй с ним
    public static List<Integer> fanctionOfFindingWithoutLocalMinimums(List<Integer> list) {
        List<Integer> listFinish = new ArrayList<>();

        int nomber = 0;// число которое мы будем проверять на локальный минимум
        int left = 0;  // число слева от него
        //int right = 0; // число справа от него

        int length = list.size();

        for (int right : list) {
            if (right == 1) {
            } else if (right == 2) {
                nomber = right;
            } else {
                left = nomber;
                nomber = right;
            }


            if (((right >= 3) && (right <= nomber || left <= nomber)) || (right == 2 && right <= nomber)) {
                listFinish.add(nomber);
            }
            if (right == length) {
                left = nomber;
                nomber = right;
                if (left <= nomber) {
                    listFinish.add(nomber);
                }
            }
        }
        return listFinish;
    }
//вариант работающий
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
}
