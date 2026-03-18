import java.util.Scanner;
public class Ders2OdevCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sayi1,sayi2;
        System.out.print("1. Sayıyı giriniz: ");
        sayi1 = scanner.nextDouble();

        System.out.print("2. Sayıyı giriniz: ");
        sayi2 = scanner.nextDouble();
       
        System.out.println("\n--- İşlem Seçimi ---");
        System.out.println(" 1 - Toplama \n 2 - Çıkarma \n 3 - Çarpma \n 4 - Bölme \n 5 - Mod Alma");
        System.out.print("Seçiminiz: ");
        int secim = scanner.nextInt();

        System.out.println("--------------------");
        
        switch (secim) {
            case 1:
                System.out.println("Sonuç: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Sonuç: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Sonuç: " + (sayi1 * sayi2));
                break;
            case 4:
                if (sayi2 != 0) {
                    System.out.println("Sonuç: " + (sayi1 / sayi2));
                } else {
                    System.out.println("Uyarı: Sayı sıfıra bölünemez.");
                }
                break;
            case 5:
                if (sayi2 != 0) {
                    System.out.println("Sonuç: " + (sayi1 % sayi2));
                } else {
                    System.out.println("Uyarı: Bölen sayı sıfır olamaz.");
                }
                break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız.");
                break;
        }        
    }
}