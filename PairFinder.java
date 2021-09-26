package com.nikita;

import java.util.Hashtable;

public class PairFinder {
    public Boolean findNumber(int[] arr, int numToFind) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        //int[] arr = new int[]{1, 2, 7, -5, 10, 2, 2, -7};
        for (int i = 0; i < arr.length; i++) {
            if (ht.containsKey(numToFind - arr[i])) {
                System.out.println("Надейнная пара: " +  (numToFind - arr[i]) + " и " + arr[i]);
                return true;
            }
            /*Нам совершенно не важно добавленное (V), работаем только с ключом (K) хэш-таблицы*/
            ht.put(arr[i] , 0);
        }
        System.out.println("Такой пары чисел в массиве не существует");
        return false;
    }
    // Cлсожность по времени O(n)
}
