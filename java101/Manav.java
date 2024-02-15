package java101;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        int elmaKg, armutKg;
        double elmaFiyat = 3.67;
        double armutFiyat = 2.14;
        Scanner input = new Scanner(System.in);
        System.out.print("elma kaç kg: ");
        elmaKg = input.nextInt();
        System.out.print("armut kaç kg: ");
        armutKg = input. nextInt();

        double toplamFiyat = (elmaFiyat * elmaKg) + (armutFiyat * armutKg);
        System.out.println("toplam fiyat: " + toplamFiyat);

    }
}
