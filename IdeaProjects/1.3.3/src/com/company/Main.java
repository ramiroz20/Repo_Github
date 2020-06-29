package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Введите год в формате 2004");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 100 == 0) {
            System.out.println("Количество дней 365");
        } else if (year % 400 == 0) {
            System.out.println("Количество дней 366");
        } else {
            System.out.println("Количество дней 366");
        }

    }
}