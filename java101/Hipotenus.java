package java101;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        double hipotenus, dikkenar1, dikkenar2;

        Scanner input = new Scanner(System.in);
        System.out.print("birinci dik kenarı giriniz: ");
        dikkenar1 = input.nextDouble();
        System.out.print("ikinci dik kenarı giriniz: ");
        dikkenar2= input.nextDouble();
        hipotenus = Math.sqrt((dikkenar1 * dikkenar1) + (dikkenar2 * dikkenar2));
        System.out.println("hipotenüs: " + hipotenus);
    }
}
