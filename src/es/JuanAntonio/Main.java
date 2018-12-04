package es.JuanAntonio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario que introduzca un núemero y lo guardamos en una variable.
        System.out.println("Introduzca un número entero");
        String numero = sc.nextLine();


        // Hacemos las respecitvas validaciones para implementar los metodos creados en la clase Calculo de manera que si se cumplen
        // muestre el resultado y sino muestre un mensaje indicando el porque no se puede calcular.

        if (numero.length() == 2 | numero.length() == 3) System.out.println("¿Es Capicúa? " + Calculo.esCapicua(numero));
        else System.out.println("Para comprobar si es capicúa el número tiene que tener dos o tres cifras");

        if (numero.length() >= 3) System.out.println("¿Es par? " + Calculo.esPar(numero));
        else System.out.println("El número tiene que tener tres o mas cifrás para comprobar si es par");

        if (numero.length() == 1) System.out.println("¿Es divisible por tres? " + Calculo.esDivisiblePorTres(numero));
        else System.out.println("Para comprobar si el número es divisible por tres solo debe de tener una cifra");
    }
}
