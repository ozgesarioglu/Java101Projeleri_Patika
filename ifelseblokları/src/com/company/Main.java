package com.company;

public class Main {

    public static void main(String[] args) {

        int sayi1 = 15;
        int sayi2 = 4;
        int sayi3 = 22;
        int enBuyuk = sayi1; // en büyük sayıyı, sayi1 kabul edelim.

        if (enBuyuk < sayi2) {
            System.out.println("en büyük sayi : " + sayi2);
        }
        if (enBuyuk < sayi3) {
            System.out.println("En büyük sayi : " + sayi3);
        }
    }
}

