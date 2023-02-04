package Ejercicio4;

import Ejercicio5.Semaforo;

public class PrinSemaforo {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        semaforo.setColor("rojo");

        System.out.println(semaforo.MostrarmensajeSemaforo() + " " + "porque el semaforo esta en" + " " + semaforo.getColor());
    }
}
