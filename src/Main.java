import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String savePassword = "java123";

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adını giriniz : ");
        String userName = input.next();

        System.out.print("lütfen şifrenizi giriniz : ");
        String password = input.next();

        /*
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız.");
        } else {
            System.out.println("Bilgileriniz yanlış !!!");
        }
        */

        if (userName.equals("patika")) {
            if (password.equals((savePassword))) {
                System.out.println("Giriş yaptınız.");
            } else {
                System.out.println("Şifrenizi yanlış girdiniz !!!");
            }
        } else {
            System.out.println("Şİfrenizi sıfırlamak ister misiniz?");
            System.out.println("1-Evet istiyorum !!\n2-Hayır istemiyorum !!");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Yeni şifrenizi giriniz ?? ");
                String newPassword = input.next();
                if (newPassword.equals(password) || newPassword.equals(savePassword)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                    savePassword = newPassword;
                }

            }
        }
    }
}
