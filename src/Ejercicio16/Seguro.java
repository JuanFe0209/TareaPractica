package Ejercicio16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seguro {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        System.out.println("Por favor ingrese su genero");
        System.out.println("1. Femenino");
        System.out.println("2. Masculino");
        System.out.println("3. Salir");
        int opcion = sn.nextInt();
        try {

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado Femenino");
                    break;
                case 2:
                    System.out.println("Has seleccionado masculino, usted recibira una ayuda de $40000");
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 3");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar una opción habilitada");
            sn.next();
        }
        if(opcion == 1){
            Scanner escanner = new Scanner(System.in);
            System.out.println("Por favor ingrese su edad");
            int edad = escanner.nextInt();
            if (edad >= 30 && edad < 500) {
                System.out.println("Usted recibira $100000 como ayuda");
            } else if (edad > 50){
                System.out.println("Usted recibira $120000 como ayuda");
            }

            }
        }
    }

