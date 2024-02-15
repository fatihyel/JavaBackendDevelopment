package java101;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total;

        Scanner input = new Scanner(System.in);
        System.out.print("km giriniz: ");
        km = input.nextInt();

        total = (km * perKm) + 10;

        total = (total < 20) ? 20 : total;
        System.out.print("tutar: " + total);
    }
}
