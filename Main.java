package com.nikita;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // По заданию имеем один фиксированный массив, через ввод-вывод задааем только искомое число.
        int[] arr = new int[]{1, 2, 7, -5, 10, 2, 2, -7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int numToFind = scanner.nextInt();
	    PairFinder pairFinder = new PairFinder();
        System.out.println(pairFinder.findNumber(arr,numToFind));
    }
}
