package com.company;

import java.util.Scanner;

public class zadaniepetle {
    public static void main(String[] args) {
//        int a = 0;
//        while(a<10){
//            System.out.println(a);
//            a++;
//        }
//        int b = 0;
//        do {
//            System.out.println(b);
//            b++;
//        } while (b < 10);

        //dzielenie

//        System.out.println("Daj liczbę pierwszą: ");
//        Scanner scanner = new Scanner(System.in);
//        int liczba1 = scanner.nextInt();
//        double liczba2 = 0;
//        do {
//            System.out.println("Daj liczbę drugą (różną od 0!): ");
//            scanner = new Scanner(System.in);
//            liczba2 = scanner.nextInt();
//        } while(liczba2 ==0);
//
//        double dzielenie;
//        dzielenie = liczba1/liczba2;
//        System.out.println("Wynik to: " + dzielenie );

        String[] tablica = {"Monika", "Ola", "Ala"};
        int sum = 0;
        for (int i=0; i < tablica.length; i++){
            System.out.println(tablica[i].toLowerCase());
            System.out.println(tablica[i].length());
            sum += tablica[i].length();
        }
        System.out.println(sum);

    }
}
