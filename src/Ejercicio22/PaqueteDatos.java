package Ejercicio22;

public class PaqueteDatos {

    public static String operador;
    public static int cargoFijo;
    public static int valorPaquete;
    public static int cantidadMinutos;
    public static int valorMinutos;

    public static String determinarOperador() {
        return operador;
    }

    public static void cargarValores() {
        switch (operador) {
            case "Tigo":
                cargoFijo = 45000;
                valorPaquete = 12000;
                valorMinutos = 200;
                break;
            case "Claro":
                cargoFijo = 30000;
                valorPaquete = 8000;
                valorMinutos = 250;
                break;
            case "Movistar":
                cargoFijo = 40000;
                valorPaquete = 8000;
                valorMinutos = 250;
                break;
            default:
                System.out.println("Por favor ingrese uno de los operadores mostrados");

        }
    }
        public static int calcularValorPaquete() {
            return valorMinutos * cantidadMinutos;


    }
}