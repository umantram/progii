package com.company.prograDinamica;

import java.util.Scanner;

/**
 * Created by umantram on 30/09/16.
 */
public class Fibonacci {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        int valoring = sc.nextInt();

        while (valoring != 0 ){

            if (numeros[valoring] != 0){

                System.out.println("Sin Calculas " + numeros[valoring]);

            }else{

                numeros[valoring] = fibonacci(valoring);
                System.out.println(numeros[valoring]);

            }

            for (int i = 0; i < numeros.length; i++) {

                System.out.print(numeros[i]);

            }

            valoring = sc.nextInt();


        }

        System.out.println(fibonacci(30));

    }

    public static int fibonacci(int valor){

        if (valor==1 || valor == 2){

            return 1;

        }else {

            return fibonacci(valor - 1 ) + fibonacci(valor - 2);
        }

    }

    /*
    public static int fibonacciArr(int valor){

        if (valor==1 || valor == 2){

            return 1;

        }else {

            return fibonacci(valor - 1 ) + fibonacci(valor - 2);
        }

    }
    */

}
