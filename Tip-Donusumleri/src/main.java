import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir tam sayı girişi al
        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = scanner.nextInt();

        // Kullanıcıdan bir ondalıklı sayı girişi al
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = scanner.nextDouble();

        // Tip dönüşümlerini uygula ve sonuçları ekrana yazdır
        double tamSayiToDouble = (double) tamSayi;
        int ondalikliSayiToInt = (int) ondalikliSayi;

        System.out.println("Tam Sayıdan Ondalıklı Sayıya Dönüşüm: " + tamSayiToDouble);
        System.out.println("Ondalıklı Sayıdan Tam Sayıya Dönüşüm: " + ondalikliSayiToInt);
    }
}