package Ejercicio22;

import java.util.Scanner;

import static Ejercicio22.PaqueteDatos.determinarOperador;

public class main {
    public static void main(String[] args) {

        PaqueteDatos paquetedatos = new PaqueteDatos();
        Scanner escanner = new Scanner(System.in);

        System.out.println("Por favor ingrese el operador al que pertenece");
        String determinarOperador = escanner.next();

        System.out.println("¿Cuantos minutos internacionales utilizo?");
        int cantidadMinutos = escanner.nextInt();

        PaqueteDatos.cargarValores();
        PaqueteDatos.calcularValorPaquete();
    }
}
