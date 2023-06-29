package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int adet = input.nextInt();

        int maxSayi = Integer.MIN_VALUE;
        int minSayi = Integer.MAX_VALUE;

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int num = input.nextInt();

            if (num > maxSayi) {
                maxSayi = num;
            }

            if (num < minSayi) {
                minSayi = num;
            }
        }

        System.out.println("En büyük sayı: " + maxSayi);
        System.out.println("En küçük sayı: " + minSayi);
    }
}