package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        double ücret = mesafe * 0.10;
        double totalfiyat = ücret;

        // Input validation
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        // Apply age discounts
        if (yas < 12) {
            totalfiyat -= totalfiyat * 0.50; // %50 indirim
        } else if (yas <= 24) {
            totalfiyat -= totalfiyat * 0.10; // %10 indirim
        } else if (yas >= 65) {
            totalfiyat -= totalfiyat * 0.30; // %30 indirim
        }

        // Apply travel type discount
        if (yolculukTipi == 2) {
            totalfiyat -= totalfiyat * 0.20; // %20 indirim
        }

        System.out.println("Toplam Tutar = " + totalfiyat + " TL");
    }
}


