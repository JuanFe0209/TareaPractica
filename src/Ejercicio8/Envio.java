package Ejercicio8;

import org.w3c.dom.ls.LSOutput;

public class Envio {

    public static int numeroGuia;
    public static String fecha;
    public static String tipoEmbalaje;
    public static int cedulaCliente;
    public static double peso;
    public static String ciudadOrigen;
    public static String ciudadDestino;
    public static double costo;
    public static String estadoEnvio;

    public static double CalcularCostoxKilo(){
        return peso * 20.000;

    }
    public static String VerificarEntrega() {
        if (estadoEnvio.equals("Activo")) {
            return "El envio está en camino, pronto se hara la entrega";
        } else {
           return "No se ha realizado ningún envio, por favor comuniquese con nuestra linea de atención al cliente";
        }

    }

}
