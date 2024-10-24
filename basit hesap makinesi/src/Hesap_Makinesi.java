import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Hesap makinesine hoş geldiniz.\nEğer çarpma yapmak istiyorsanız c \ntoplama yapmak istiyorsanız t \nbölme yapmak istiyorsanız b \nçıkarma yapmak istiyorsanız ci yazınız.");

        String in = input.nextLine();

        if (in.equals("c")) {
            System.out.println("Çıkmak için q yaz");

            String a = "a";
            int carpim = 1;

            while (!a.equals("q")) {
                a = input.nextLine();

                if (a.equals("q")) {
                    System.out.print(carpim);
                    break;
                } else {
                    int b = Integer.parseInt(a);
                    carpim *= b;
                }
            }
        }

        else if (in.equals("t")) {
            System.out.println("Çıkmak için q yaz");

            String a = "a";
            int toplam = 0;
            
            while (!a.equals("q")) {
                a = input.nextLine();

                if (a.equals("q")) {
                    System.out.print(toplam);
                    break;
                } else {
                    int b = Integer.parseInt(a);
                    toplam += b;
                }
            }
        }

        else if (in.equals("b")) {

            System.out.println("Çıkmak için q yaz");

            String a = "a";
            int bolum = 1;
            int sayac = 0;
            
            while (!a.equals("q")) {
                a = input.nextLine();

                if (a.equals("q")) {
                    System.out.print(bolum);
                    break;
                } else {
                    int b = Integer.parseInt(a);
                    if (sayac==0) {
                        bolum = b;
                    } else {
                        bolum /= b;
                    }
                }
                sayac++;
            }
        }

        else if(in.equals("ci")) {

            System.out.println("Çıkmak için q yaz");

            String a = "a";
            int cikarma = 0;
            int sayac = 0;
            
            while (!a.equals("q")) {
                a = input.nextLine();

                if (a.equals("q")) {
                    System.out.print(cikarma);
                    break;
                } else {
                    int b = Integer.parseInt(a);
                    if (sayac==0) {
                        cikarma = b;
                    } else {
                        cikarma -= b;
                    }
                }
                sayac++;
            }

        }

        input.close();

    }
}
