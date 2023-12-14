import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlıcan = 5.00;
        double toplam = 0*armut+1*elma+1*domates+2*muz+3*patlıcan;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armut = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elma = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domates = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muz = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlıcan = input.nextDouble();
        System.out.print("Toplam Tutar  : " + toplam + " TL");
        toplam = input.nextDouble();



    }
}
