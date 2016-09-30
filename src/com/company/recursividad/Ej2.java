package com.company.recursividad;

/**
 * Created by umantram on 27/09/16.
 */
public class Ej2 {

    public static void main (String[] args){


        int[] vect = {1,11,3,4,10,6,-7,8,9};
        busque(vect, vect.length-1,0);

    }

    public static void busque(int[] vect, int tam, int valor){

        if(tam > 0) {

            if (vect[tam] > valor) {

                valor = vect[tam];

            }

                busque(vect, tam - 1, valor);

        }else {

            System.out.println(valor);

        }
    }


}
