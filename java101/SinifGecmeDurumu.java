package java101;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int turkce, mat, fizik, kimya, muzik, count = 0;
        double ortalama, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("turkce notunuz: ");
        turkce = input.nextInt();
        if (turkce >=0 && turkce <=100){
            count++;
            total += turkce;
        }
        System.out.print("mat notunuz: ");
        mat = input.nextInt();
        if (mat >=0 && mat <=100){
            count++;
            total += mat;
        }
        System.out.print("fizik notunuz: ");
        fizik = input.nextInt();
        if (fizik >=0 && fizik <=100){
            count++;
            total += fizik;
        }
        System.out.print("kimya notunuz: ");
        kimya = input.nextInt();
        if (kimya >=0 && kimya <=100){
            count++;
            total += kimya;
        }
        System.out.print("muzik notunuz: ");
        muzik = input.nextInt();
        if (muzik >=0 && muzik <=100){
            count++;
            total += muzik;
        }
        ortalama = total / count;
        System.out.println("ortalamanız: " + ortalama);
        if (ortalama <= 55) {
            System.out.println("kaldınız");
        } else {
            System.out.println("geçtiniz");
        }
    }
}
