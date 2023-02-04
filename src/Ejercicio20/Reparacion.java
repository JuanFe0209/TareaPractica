package Ejercicio20;

import java.util.Scanner;

public class Reparacion {

    public static void main(String[] args) {
        Scanner escanner = new Scanner(System.in);

        System.out.println("Por favor digíte el problema que tiene su computadora:");
        System.out.println("1. Emite un pitido al iniciarse y si el disco duro gira ");
        System.out.println("2. Emite un pitido y la unidad gira");
        System.out.println("3. Emite un pitido y la unidad no gira");
        System.out.println("4. No emite un pitido y el disco duro no gira");
        System.out.println("5. No emite un pitido y el disco duro gira");
        int x = escanner.nextInt();

        switch (x){
            case 1:
                System.out.println("La computadora está averiada");
                break;

            case 2:
                System.out.println("Póngase en contacto con el técnico apoyo");
                break;

            case 3:
                System.out.println("Verificar contactos de la unidad");
                break;

            case 4:
                System.out.println("Traiga la computadora para repararla en la central.");
                break;

            case 5:
                System.out.println("Compruebe las conexiones de altavoces");
                break;

            default: System.out.println("Por favor ingrese una de las opciones mostradas.");



        }
    }
}
