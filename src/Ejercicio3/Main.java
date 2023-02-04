package Ejercicio3;

public class Main {
    public static void main(String[] args) {

        PrestamoLibro prestamolibro = new PrestamoLibro();

        PrestamoLibro.codUsuario = 1234;
        PrestamoLibro.codigoPrestamo = 2209;
        PrestamoLibro.nombreLibro = "Cien años de soledad";
        PrestamoLibro.estadoPrestamo = "Habilitado";
        PrestamoLibro.fechaPrestamo = "02/02/2023";
        PrestamoLibro.diasPrestamo = 7;

        System.out.println(PrestamoLibro.ConsultarEstadoLibro());
        System.out.println(PrestamoLibro.DatosPrestamo());

    }
}
