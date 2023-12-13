import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int kilo = 105;
        double boy = 1.72,endeks;
        endeks = kilo / (boy * boy);

        Scanner input= new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : " + boy);
        System.out.println("Lütfen kilonuzu giriniz : " + kilo );
        System.out.println("Vücut Kitle İndeksiniz : " + endeks);



    }
}
