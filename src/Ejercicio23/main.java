package Ejercicio23;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        Scanner escanner = new Scanner(System.in);

        System.out.println("¿Desea su sandwich grande o pequeño?");
        sandwich.Tamaño(escanner.next());

        System.out.println("¿Desea tocineta o pavo?");
        sandwich.Carnecliente(escanner.next());

        System.out.println("¿Desea añadir queso a su sandwich?");
        sandwich.Queso(escanner.next());

        System.out.println("¿Desea añadir jalapeños a su sandwich? ");
        sandwich.Jalapeño(escanner.next());

        sandwich.Sandwich();
        System.out.println("El precio de su sandwich es de" + " " + sandwich.total());


    }
}
