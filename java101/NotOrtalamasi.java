package java101;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, muzik, tarih, turkce;
        Scanner input = new Scanner(System.in);
        System.out.print("mat notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("turkce notunuz: ");
        turkce = input.nextInt();

        double toplam = (mat + turkce);
        double ortalama = toplam / 2;
        System.out.println(ortalama);

        String msg = ortalama < 60 ? "Sınıfta kaldı" : "Sınıfı geçti";
        System.out.println(msg);
    }
}
