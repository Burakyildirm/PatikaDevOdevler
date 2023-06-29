package org.example;
import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            System.out.println("Asal Sayılar: ");

            for (int i = 2; i <= 100; i++) {
                boolean asalSayi = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        asalSayi = false;
                        break;
                    }
                }

                if (asalSayi) {
                    System.out.print(i + " ");
                }
            }
        }
    }
