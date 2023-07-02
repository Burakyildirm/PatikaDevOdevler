package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {80, 30, 40, 10, 10, 80, 40, 30};

        // Frekansları hesaplamak için bir HashMap kullanılabilir
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Dizideki elemanları dolaşarak frekansları güncelle
        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                // Eleman zaten map'te varsa frekansı bir artır
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // Eleman map'te yoksa frekansı 1 olarak başlat
                frequencyMap.put(num, 1);
            }
        }

        // Frekansları ekrana yazdır
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(num + " sayısı " + frequency + " kere tekrar edildi.");
        }
    }
}