package org.example;


   import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            String[] subjects = { "Matematik", "Fizik", "Türkçe", "Kimya", "Müzik" };
            int passingGrade = 55;
            int totalGrade = 0;
            int validGrades = 0;

            Scanner input = new Scanner(System.in);

            for (String subject : subjects) {
                System.out.print(subject + " ders notunu giriniz: ");
                int grade = input.nextInt();

                if (grade >= 0 && grade <= 100) {
                    totalGrade += grade;
                    validGrades++;
                }
            }

            if (validGrades > 0) {
                double average = (double) totalGrade / validGrades;

                if (average >= passingGrade) {
                    System.out.println("conguralation, ortalaman " + average + " , geçme notunun üzeri puan :')");
                } else {
                    System.out.println("sorry, ortalaman " + average + " , kaldın :/ ");
                }
            } else {
                System.out.println("Geçersiz not.");
            }
        }
    }