package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci dik kenar uzunluğunu girin: ");
        double a = scanner.nextDouble();
        System.out.print("İkinci dik kenar uzunluğunu girin: ");
        double b = scanner.nextDouble();

        // Hipotenüs hesaplama
        double hipo = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenüs: " + hipo);

        // Üçgenin alanı
        double u = (a + b + hipo) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - hipo));
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
