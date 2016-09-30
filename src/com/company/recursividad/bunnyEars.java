package com.company.recursividad;

/**
 * Created by umantram on 28/09/16.
 */
public class bunnyEars {

    public static void main(String[] args){

        System.out.println(bunnyEars(4));
    }

    public static int bunnyEars(int bunnies) {

        if (bunnies == 0){

            return 0;

        }else if (bunnies == 1){

            return 2;

        }else{

            return 2 + bunnyEars(bunnies - 1);
        }

    }

}
