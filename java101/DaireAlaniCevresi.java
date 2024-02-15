package java101;

import java.util.Scanner;

public class DaireAlaniCevresi {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, alan, cevre;
        Scanner input = new Scanner(System.in);

        System.out.print("dairenin yaricapini giriniz: ");
        r = input.nextInt();
        System.out.println("dairenin yaricapi: " + r);

        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("dairenin alani: " + alan);
        System.out.print("dairenin cevresi: " + cevre);
    }
}
