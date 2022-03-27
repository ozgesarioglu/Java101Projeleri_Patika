package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double tutar, kdvTutar, kdvliTUtar, kdvOran;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");

        tutar = input.nextDouble();

        if(tutar == 0 and 1000);
        kdvOran = 0.18;
        System.out.println("kdvsiz tutar : " + tutar);
        System.out.println("Kdv oranı: " + kdvOran);
        System.out.println("kdv tutar: " + kdvTutar);
        System.out.println("kdv'li tutar: " + kdvliTUtar);

        else if(tutar > 1000);
        kdvOran =0.8;



        kdvTutar = tutar * kdvOran;
        kdvliTUtar = tutar + kdvTutar;


        System.out.println("kdvsiz tutar : " + tutar);
        System.out.println("Kdv oranı: " + kdvOran);
        System.out.println("kdv tutar: " + kdvTutar);
        System.out.println("kdv'li tutar: " + kdvliTUtar);

    }
}
