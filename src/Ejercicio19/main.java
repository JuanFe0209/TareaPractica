package Ejercicio19;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Fotocopias fotocopias = new Fotocopias();
        Scanner escanner = new Scanner(System.in);

        System.out.println("Por favor ingrese el número de fotocopias que desea");
        fotocopias.CantidadCopias(escanner.nextInt());

        System.out.println("El precio por copia es de:" + " " + fotocopias.PreciosCopias());
        System.out.println("El precio total de las fotocopias es de:" + " " + fotocopias.Total());


    }
}
