import java.util.Scanner;

public class UcakBiletHesaplayici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Mesafeyi giriniz (KM): ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini seçiniz (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();


        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {

            double toplamFiyat = mesafe * 0.10;


            if (yas < 12) {
                toplamFiyat *= 0.5; 
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat *= 0.9;
            } else if (yas >= 65) {
                toplamFiyat *= 0.7;
            }

            if (yolculukTipi == 2) {
                toplamFiyat *= 0.8;
            }


            System.out.println("Toplam Bilet Fiyatı: " + toplamFiyat + " TL");
        }
    }
}
