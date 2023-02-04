package Ejercicio7;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        double area;
        Scanner escanner = new Scanner(System.in);

        System.out.println("ingrese ancho del rectangulo");
        double a = escanner.nextDouble();

        System.out.println("ingrese alto del rectangulo");
        double b = escanner.nextDouble();

        area=a*b;
        System.out.println("El area del rectangulo es" + " " + area);
    }
}
