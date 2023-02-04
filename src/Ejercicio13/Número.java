package Ejercicio13;

import java.util.Scanner;

public class Número {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Escriba un número para determinar si es par o impar");

        double numero = escaner.nextDouble();

        if(numero % 2 == 0){
            System.out.println("El número ingresado es par");
        } else{
            System.out.println("El número ingresado es impar");
        }



    }
}
