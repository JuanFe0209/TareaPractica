package Ejercicio11;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
            Scanner escaner = new Scanner(System.in);
            System.out.println("Escriba un número para determinar si es positivo o negativo");

            double numero = escaner.nextDouble();

            if (numero < 0){
                System.out.println("El número ingresado es negativo");
            } else if (numero > 0){
                System.out.println("El número ingresado es positivo");
            }
        }
    }

