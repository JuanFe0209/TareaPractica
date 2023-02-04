package Ejercicio18;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduzca primer ángulo: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo ángulo: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca tercer ángulo: ");
        n3 = sc.nextInt();
        if(n1+n2+n3 == 180){
            System.out.println("El triangulo ingresado es valido");
        } else {
            System.out.println("El triangulo ingresado no es valido");
        }
    }
}
