package com.company.recursividad;

/**
 * Created by umantram on 27/09/16.
 */
public class Ej1 {

    public static void main(String[] args){

        imprimir(10);

    }

    public static void imprimir(int num){

        if(num > 0){

            System.out.println(9*num);
            imprimir(num - 1);

        }


    }
}
