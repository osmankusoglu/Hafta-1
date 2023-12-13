import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00;
        System.out.println("Armut Kaç Kilo ? : "  + 0 );
        System.out.println("Elma Kaç Kilo ? : "  + 1 );
        System.out.println("Domates Kaç Kilo ? : "  + 1 );
        System.out.println("Muz Kaç Kilo ? : "  + 2  );
        System.out.println("Patlıcan Kaç Kilo ? : "  + 3 );
        System.out.println("Toplam Tutar : " + ((elma)+(domates)+(2*muz)+(3*patlıcan)));
    }

}