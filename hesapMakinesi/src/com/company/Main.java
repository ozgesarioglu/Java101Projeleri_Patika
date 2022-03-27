package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double n1, n2;
        int    select;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        if (select == 1) {
            System.out.println("n1+n2: " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("n1-n2: " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("n1*n2: " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.println("n1/n2: " + (n1 / n2));
            } else {
                System.out.println("Bir sayı sıfıra bölünemez. Lütfen tekrar girin.");
            }
        }
        else {
            System.out.println("Hatalı bir seçim yaptınız. Lütfen doğru seçim yapınız.");
        }

    }
}
