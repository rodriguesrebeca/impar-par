package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Escreva um programa que lê 5 números. Ao final, escreva primeiro todos os ímpares, depois todos os pares.
    Scanner scan = new Scanner(System.in);
    int[] numeros = new int[5];
    System.out.println("Digite 5 números: ");
    for (int i=0; i < numeros.length; i++){
        numeros[i]=scan.nextInt();
    }

        System.out.println("***** NÚMEROS PARES *****");
    for (int i=0; i < numeros.length; i++){
        if (numeros[i]%2 == 0){
            System.out.println(numeros[i]);;
        }
    }

        System.out.println("***** NÚMEROS ÍMPARES *****");
    for (int i=0; i < numeros.length; i++){
        if(numeros[i]%2 != 0){
            System.out.println(numeros[i]);;
        }
    }

    }
}
