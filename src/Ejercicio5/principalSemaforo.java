package Ejercicio5;

public class principalSemaforo {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        semaforo.setColor("rojo");

        System.out.println(semaforo.MostrarmensajeSemaforo() + " " + "porque el semaforo esta en"+ " " + semaforo.getColor());
    }
}
