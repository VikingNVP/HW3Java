package org.task4;

import java.util.ArrayList;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Main4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            arrList.add(rnd.nextInt(0,10));
        }
        System.out.println(arrList.toString());
        int max = arrList.get(0);
        int min = arrList.get(0);
        int sum = 0;
        for(int i = 0;i < arrList.size(); i++){
            if (arrList.get(i) > max) max = arrList.get(i);
            if (arrList.get(i) < min) min = arrList.get(i);
            sum += arrList.get(i);
        }
        System.out.printf("Максимальный элемент: %d\n",max);
        System.out.printf("Минимальный элемент: %d\n",min);
        System.out.printf("Среднее арифметическое: %.1f\n",((float)sum / arrList.size()));
    }
}
