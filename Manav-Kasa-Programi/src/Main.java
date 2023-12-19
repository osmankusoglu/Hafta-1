import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutFiyat = 2.14,elmaFiyat = 3.67,domatesFiyat = 1.11,muzFiyat = 0.95,patlicanFiyat = 5,toplam;
        double alinanArmut,alinanElma,alinanDomates,alinanMuz,alinanPatlican;
        int alinanKg;

        System.out.print("Armut Kaç Kilo ? : " );
        alinanKg = input.nextInt();
        alinanArmut = alinanKg * armutFiyat;

        System.out.print("Elma Kaç Kilo ? : " );
        alinanKg = input.nextInt();
        alinanElma = alinanKg * elmaFiyat;

        System.out.print("Domates Kaç Kilo ? : " );
        alinanKg = input.nextInt();
        alinanDomates = alinanKg * domatesFiyat;

        System.out.print("Muz Kaç Kilo ? : " );
        alinanKg = input.nextInt();
        alinanMuz = alinanKg * muzFiyat;

        System.out.print("Patlıcan  Kaç Kilo ? : " );
        alinanKg = input.nextInt();
        alinanPatlican = alinanKg * patlicanFiyat;

        toplam = (alinanArmut)+(alinanElma)+(alinanDomates)+(alinanMuz)+(alinanPatlican);
        System.out.println("Toplam tutar : " + toplam);


    }
}