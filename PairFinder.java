package com.nikita;

import java.util.Hashtable;

public class PairFinder {
    public Boolean findNumber(int[] arr, int numToFind) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            if (ht.containsKey(numToFind - arr[i])) {
                System.out.println("Надейнная пара: " +  (numToFind - arr[i]) + " и " + arr[i]);
                // Как только нашли первую попавшуюся пару, сразу завершаем выполнение метода и выводим true.
                return true;
            }
            /*
             * Нам совершенно не важно добавленное значение (V), работаем только с ключом (K) хэш-таблицы,
             * метод put нам для этого подходит.
             */
            ht.put(arr[i] , 0);
        }
        System.out.println("Такой пары чисел в массиве не существует");
        return false;
    }
    // Cлсожность по времени O(n)
}
