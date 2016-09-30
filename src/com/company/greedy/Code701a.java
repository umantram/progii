package com.company.greedy;

import java.util.Scanner;

/**
 * Created by umantram on 30/09/16.
 */
public class Code701a {

    public static void main (String[] args){

    Scanner sc = new Scanner(System.in);

    int cantCartas = sc.nextInt();
    int[] cartas = new int[cantCartas];
    int cantjug = cantCartas/2;
        int suma = 0;


        for (int i = 0; i < cartas.length; i++) {

            cartas[i] = sc.nextInt();
            suma += cartas[i];

        }

        int valorSuma = suma / cantjug;

        for (int i = 0; i < cartas.length; i++) {

            if(cartas[i] != 0){

                for (int j = 0; j < cartas.length; j++) {

                    if(cartas[i]+cartas[j] == valorSuma && i != j){

                        System.out.println((i+1) +" "+ (j+1));
                        cartas[i] = 0;
                        cartas[j] = 0;

                    }
                }

            }
        }
    }
}
