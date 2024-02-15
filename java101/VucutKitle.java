package java101;

import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        double boy, kilo, indeks;

        Scanner input = new Scanner(System.in);
        System.out.print("boyunuzu metre cinsinden giriniz: ");
        boy = input. nextDouble();

        System.out.print("kilonuz: ");
        kilo = input.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("kitle endeskiniz: " + indeks);
    }
}
