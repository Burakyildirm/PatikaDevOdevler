package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumTarihi = scanner.nextInt();

        // Çin Zodyak hesaplamasının formülü
        int zodyakFormul = dogumTarihi % 12;

        // Çin Zodyak burçları
        String[] zodyakDizileri = {
                "Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"
        };

        // Ekrana yazdırma
        System.out.println("Çin Zodyağı Burcunuz: " + zodyakDizileri[zodyakFormul]);
    }
}