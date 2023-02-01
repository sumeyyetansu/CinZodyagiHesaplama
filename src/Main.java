import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Çin Zodyağı nedir?\n" +
                "\n" +
                "4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.");
        Scanner scanner = new Scanner(System.in);
        int year ;
        System.out.println("Doğum yılınızı giriniz: ");
        year = scanner.nextInt();
        
        switch (year % 12 ){
            case 0 :
                System.out.println("Çin zodyağı burcunuz : Maymun");
                break;
            case 1 :
                System.out.println("Çin zodyağı burcunuz : Horoz");
                break;
            case 2 :
                System.out.println("Çin zodyağı burcunuz : Köpek");
                break;
            case 3 :
                System.out.println("Çin zodyağı burcunuz : Domuz");
                break;
            case 4 :
                System.out.println("Çin zodyağı burcunuz : Fare");
                break;
            case 5 :
                System.out.println("Çin zodyağı burcunuz : Öküz");
                break;
            case 6 :
                System.out.println("Çin zodyağı burcunuz : Kaplan");
                break;
            case 7 :
                System.out.println("Çin zodyağı burcunuz : Tavşan");
                break;
            case 8 :
                System.out.println("Çin zodyağı burcunuz : Ejdarha");
                break;
            case 9 :
                System.out.println("Çin zodyağı burcunuz : Yılan");
                break;
            case 10 :
                System.out.println("Çin zodyağı burcunuz : At");
                break;
            case 11 :
                System.out.println("Çin zodyağı burcunuz : Koyun");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
                break;
        }
    }
}