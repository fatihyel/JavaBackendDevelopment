package java101;

import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        int a, b, select;
        Scanner input = new Scanner(System.in);

        System.out.print("ilk sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        b = input.nextInt();
        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("işlem seçiniz: ");
        select = input.nextInt();

        System.out.println(a + " " + b + " " + select);

        switch (select){
            case 1:
                System.out.println("toplam= " + (a + b));
                break;
            case 2:
                System.out.println("çıkarma= " + (a - b));
                break;
            case 3:
                System.out.println("çarpma= " + (a * b));
                break;
            case 4:
                System.out.println("bölme= " + (a / b));
                break;
            default:
                System.out.println("yanlış seçim yaptınız. Tekrar deneyiniz..");
        }

    }
}
