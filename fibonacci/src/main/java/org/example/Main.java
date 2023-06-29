package org.example;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        int seriSayisi = scanner.nextInt();

        // fibonacci başlangıç sayıları
        int ilkfibo = 0, ikincifibo = 1;

        System.out.print("Fibonacci serisi: ");

        // Hesaplama ve yazdırma
        for (int i = 0; i < seriSayisi; i++) {
            System.out.print(ilkfibo + " ");

            int fibSonraki = ilkfibo + ikincifibo;
            ilkfibo = ikincifibo;
            ikincifibo = fibSonraki;
        }
        //Close
        scanner.close();
    }
}
