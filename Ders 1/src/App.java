import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String isim = "Melike";

        System.out.print("Merhaba ");
        System.out.println(isim);

        System.out.println("lütfen adınızı giriniz");
        String sayi = input.nextLine();
        
        System.out.print("Merhaba ");
        System.out.println(sayi);

        System.out.println("Nasılsın?");

        System.out.println("Ne yapıyorsun?");

        System.out.println("Lütfen 2 adet sayı giriniz.");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = (((a+2)*b) + (a*(b+3)))*2/2;

        System.out.println(c);

    }
}
