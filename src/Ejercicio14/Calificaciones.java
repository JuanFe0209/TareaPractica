package Ejercicio14;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner escanner = new Scanner(System.in);
        double c1, c2, c3, c4, c5;

        System.out.println("Introduzca la calificación de Física");
        c1 = escanner.nextDouble();
        System.out.println("Introduzca la calificación de Química");
        c2 = escanner.nextDouble();
        System.out.println("Introduzca la calificación de Biología");
        c3 = escanner.nextDouble();
        System.out.println("Introduzca la calificación de Matemáticas");
        c4 = escanner.nextDouble();
        System.out.println("Introduzca la calificación de Informatica");
        c5 = escanner.nextDouble();

        if (c1 < 5.9) {
            System.out.println("La calificación de Física es mala");
        } else if (c1 > 5.9 && c1 < 8) {
            System.out.println("La calificación de Física es buena");
        } else if (c1 > 8 && c1 <= 10) {
            System.out.println("La calificación de Física es buena");
        }
        if (c2 < 5.9) {
            System.out.println("La calificación de Química es mala");
        } else if (c2 > 5.9 && c2 < 8) {
            System.out.println("La calificación de Química es buena");
        } else if (c2 > 8 && c2 <= 10) {
            System.out.println("La calificación de Química es buena");
        }
        if (c3 < 5.9) {
            System.out.println("La calificación de Biología es mala");
        } else if (c3 > 5.9 && c3 < 8) {
            System.out.println("La calificación de Biología es buena");
        } else if (c3 > 8 && c3 <= 10) {
            System.out.println("La calificación de Biología es buena");
        }
        if (c4 < 5.9){
            System.out.println("La calificación de Matemáticas es mala");
        } else if (c4 > 5.9 && c4 < 8){
            System.out.println("La calificación de Matemáticas es buena");
        } else if (c4 > 8 && c4 <= 10) {
            System.out.println("La calificación de Matemáticas es buena");
        }
        if (c5 < 5.9){
            System.out.println("La calificación de Informatica es mala");
        } else if (c5 > 5.9 && c5 < 8){
            System.out.println("La calificación de Informatica es buena");
        } else if (c5 > 8 && c5 <= 10) {
            System.out.println("La calificación de Informatica es buena");
        }
    }
}

