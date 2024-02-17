package java101;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, newPassword, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("giriş yaptınız");
        } else if (!password.equals("java123")){
            System.out.println("şifre hatalı. Şifrenizi sıfırlamak ister misiniz? E/H");
            select = input.nextLine();

            if (select.equals("E")){
                System.out.print("yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals(password) || newPassword.equals("java123")){
                    System.out.println("şifre oluşturulamadı, lütfen başka şifre giriniz..");
                } else {
                    System.out.println("şifre oluşturuldu..");
                    System.out.println("newpass: " + newPassword);
                }
            } else {
                System.out.println("şifre yenilenmedi");
            }
        } else {
            System.out.println("hatalı giriş!");
        }
    }
}
