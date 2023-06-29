package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int muksayi = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                muksayi += i;
            }
        }

        if (muksayi == sayi) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}