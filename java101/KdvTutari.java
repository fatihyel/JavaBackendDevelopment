package java101;

import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        double deger, fiyat;
        Scanner input = new Scanner(System.in);
        System.out.print("tutar giriniz: ");
        deger = input.nextDouble();

        fiyat = (deger * 18.0 / 100.0) + deger;
        System.out.println("kdv li tutar: " + fiyat);

    }
}
