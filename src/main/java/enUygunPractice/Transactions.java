package enUygunPractice;

import java.util.Scanner;

public class Transactions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz : ");
        int a = scan.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz : ");
        int b = scan.nextInt();

        Calculator hesapMakinesi = new Calculator();
        System.out.println("Toplama işleminizin sonucu : " + hesapMakinesi.toplama(a, b));
        System.out.println("Çıkarma işleminizin sonucu : " + hesapMakinesi.cikarma(a, b));
        System.out.println("Çarpma işleminizin sonucu : " + hesapMakinesi.carpma(a, b));
        System.out.println("Bölme işleminizin sonucu : " + hesapMakinesi.bolme(a, b));
    }
}
