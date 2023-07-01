package org.example;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Dairenin yarıçapını giriniz: ");
    double yaricap = scanner.nextDouble();

    // Alan hesaplaması
    double alan = Math.PI * yaricap * yaricap;
    System.out.println("Dairenin Alanı: " + alan);

    // Çevre hesaplaması
    double cevre = 2 * Math.PI * yaricap;
    System.out.println("Dairenin Çevresi: " + cevre);

    System.out.print("Merkez açının ölçüsünü giriniz: ");
    double aci = scanner.nextDouble();

    // Daire  alanı hesaplaması
    double dilimAlan = (Math.PI * yaricap * yaricap * aci) / 360;
    System.out.println("Daire Diliminin Alanı: " + dilimAlan);
}
}


