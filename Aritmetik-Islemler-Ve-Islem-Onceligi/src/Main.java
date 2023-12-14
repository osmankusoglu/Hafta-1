/*Manav Kasa Programı
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL*/
import java.util.Scanner;
public class Main {
<<<<<<< HEAD
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.0;
        Scanner input = new Scanner(System.in);
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplam;
        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = input.nextDouble();
        System.out.print("Muz kaç Kilo ? : ");
        muzKg = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = input.nextDouble();
        toplam = (armutKg * armut) + (elmaKg*elma) + (domatesKg*domates) + (muzKg*muz) + (patlicanKg*patlican);
        System.out.println("Toplam Tutar : " + toplam + " TL ");


=======
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        // kullanıcı sayıları a= 10, b= 2, c= 3
        int a = 10,b = 2 ,c = 3,sonuc = a+b*c-b;
        //Kullanıcı verilen sayıları girdikçe değerler ve karşılıkları eşleşecek.
        System.out.print("a sayısını giriniz : " );
        a = input.nextInt();
        System.out.print("b sayısını giriniz : " );
        b = input.nextInt();
        System.out.print("c sayısını giriniz : " );
        c = input.nextInt();
        //En son sayı girildiğinde istenilen sonucun çıktısı otomatik verilecek.
        System.out.print("Sonuç = " + sonuc);
        sonuc = input.nextInt();
>>>>>>> 22d552da76c9f15f90542f3372abba7f9e009e0e

    }
}
