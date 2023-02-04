package Ejercicio21;

import java.util.Scanner;

public class Automoviles {
    public static void main(String[] args) {
        Scanner escanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el número del modelo de su automovil");
        int modelo = escanner.nextInt();

        if(modelo == 119 || modelo == 179 || modelo == 189 || modelo == 195 || modelo == 221 || modelo == 780){
            System.out.println("Su vehiculo está entre los modelos defectuosos, por favor llevar a revisión");
        }else{
            System.out.println("Su modelo de automovil no tiene defectos");
        }
    }
}
