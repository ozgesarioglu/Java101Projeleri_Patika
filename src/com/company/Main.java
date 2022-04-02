package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k;
        double number, sum=0, count = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        k = inp.nextInt();

        for(int i=0; i<=k; i++){

            if((i %3==0) & (i %4==0)){
                System.out.println(i);
                sum+=i;
                count++;
            }
         }
        System.out.println(sum/count);
    }
}