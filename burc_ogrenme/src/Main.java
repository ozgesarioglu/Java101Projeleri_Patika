import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;
        double c;
        double u;

        Scanner input = new Scanner(System.in);

        System.out.print("1.kenarı giriniz: ");
        a = input.nextInt();

        System.out.print("2.kenarı giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüsü hesaplayınız: " + c);


        // cevresi = (a+b+c)
        // Ücgenin alani = (a+b)/2
        u = (a+b)/2;
        System.out.print("\nÜçgenin alanı: "+ u);


    }
}
