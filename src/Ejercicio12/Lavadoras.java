package Ejercicio12;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lavadoras {
    public static void main(String[] args) {

            Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion;

                System.out.println("1. Lavadora Grande");
                System.out.println("2. Lavadora Pequeña");
                System.out.println("3. Alquilar 3 lavadoras");
                System.out.println("4. Salir");

                try {

                    System.out.println("Escribe una de las opciones");
                    opcion = sn.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Has seleccionado lavadora grande la cual cuesta 4000 por hora prestada");
                            break;
                        case 2:
                            System.out.println("Has seleccionado lavadora pequeña la cual cuesta 3000 por hora prestada");
                            break;
                        case 3:
                            System.out.println("Has seleccionado 3 lavadoras por ende tendras un descuento del 3%");
                            break;
                        case 4:
                            salir = true;
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 4");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debes ingresar un número");
                    sn.next();
                }
            }

        }



