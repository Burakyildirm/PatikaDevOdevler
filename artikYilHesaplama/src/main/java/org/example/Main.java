package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        int year = scanner.nextInt();

        boolean artikYil = false;

        // Kontrol Paneli
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    artikYil = true;
                }
            } else {
                artikYil = true;
            }
        }

        //Ekrana yazdırma
        if (artikYil) {
            System.out.println(year + " bir artık yıldır!");
        } else {
            System.out.println(year + " bir artık yıl değildir!");
        }
    }
}