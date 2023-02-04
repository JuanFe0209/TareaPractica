package Ejercicio17;

import java.util.Scanner;

public class Gimnasio {
    public static void main(String[] args) {
        Scanner escanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el tiempo que desea en días en el gimnasio para calcular el valor de mensualidad");

        double numero = escanner.nextDouble();

        if(numero < 15){
            System.out.println("La mensualidad es de $18.000");
        } else if (numero > 15 && numero < 30) {
            System.out.println("La mensualidad es de $35.000");
        }else {
            System.out.println("Por favor ingrese días exactos de un mes");
        } if (numero == 3) {
            System.out.println("La mensualidad es de $86.000");
        }
    }
}
