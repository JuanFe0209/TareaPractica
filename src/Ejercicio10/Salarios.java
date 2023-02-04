package Ejercicio10;

import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        System.out.println("Por favor ingrese el número de horas trabajadas");

        double numero = escaner.nextDouble();

        if(numero < 10){
            System.out.println("El número de horas trabajadas fueron" + " " + numero + " " + "y su salario equivale a $30.000");
        } else if (numero > 10) {
            System.out.println("El número de horas trabajadas fueron" + " " + numero + " " + "Y su salario equivale a $33.000");

        }
    }
}
