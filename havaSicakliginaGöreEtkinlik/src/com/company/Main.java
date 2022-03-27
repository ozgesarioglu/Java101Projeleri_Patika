package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int heat, select;

        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklığını giriniz: ");
        heat = input.nextInt();

        System.out.println("1- Sıcaklığınız 5 dereceden küçük mü?\n2-5 Ve 25 derece arasında mı?\n4-25 dereceden fazla mı? ");
        System.out.println("Seçiminizi yapın ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Kayak yapmaya gidebilirsiniz.");
                break;

            case 2:
                System.out.println("Sinema veya pikniğe gidebilirsiniz.");
                break;
            case 3:
                System.out.println("Yüzmeye gidebilirsiniz.");


                }

        }

    }
