import java.util.Scanner;
public class Main {
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

    }
}