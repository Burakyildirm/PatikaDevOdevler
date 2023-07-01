import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi (KM) girin: ");20
        double mesafe = scanner.nextDouble();

        // Taksimetre tutar
        double acilisUcreti = 10.0;
        double kmBasinaUcret = 2.20;
        double odenecekTutar = acilisUcreti + (mesafe * kmBasinaUcret);

        // en az ödenecek tutar kontrol
        if (odenecekTutar < 20.0) {
            odenecekTutar = 20.0;
        }

        System.out.println("Taksimetre Tutarı: " + odenecekTutar + " TL");
    }
}