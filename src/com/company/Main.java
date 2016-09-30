package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ListaSimple ls = new ListaSimple();

        for (int i = 0; i < 4; i++) {

            ls.agregar("Nuevo"+i);
        }

            ls.imprimir();

            ls.eliminarUltimo();

            ls.imprimir();

            System.out.println(ls.tamaño);


        Cola col = new Cola();

        for (int i = 0; i < 5; i++) {

            col.encolar("enColando " + i);

        }

        col.imprimir();

        col.desencolar();

        col.imprimir();

        System.out.println(col.tamaño);
    }
}
