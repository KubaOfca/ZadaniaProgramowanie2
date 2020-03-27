package com.company;

import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String dna;

        dna = in.next();
        String transkrypcja = Transkrypcja(dna);
        System.out.println(transkrypcja);

    }

    public static String Transkrypcja(String dnaToRna) {

        dnaToRna = dnaToRna.replace("T","U");
        return dnaToRna;
    }




}
