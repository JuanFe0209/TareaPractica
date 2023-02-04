package Ejercicio3;

public class PrestamoLibro {

    public static int codigoPrestamo;
    public static String fechaPrestamo;
    public static String nombreLibro;
    public static int codUsuario;
    public static int diasPrestamo;
    public static String estadoPrestamo;

    public static String ConsultarEstadoLibro(){
        if(estadoPrestamo.equals("Habilitado")){
            return "El libro está habilitado para el prestamo";
        }else{
            return "El libro no está habilitado para el prestamo, vuelva luego";
        }
    }
    public static String DatosPrestamo(){
        if(estadoPrestamo.equals("Habilitado")){
            return "La información acerca del prestamo del libro es la siguiente:" + " " + "Codigo del usuario" + " " + codUsuario + " " + "Codigo:" + " " + codigoPrestamo + " " + "Nombre del libro:" + " " + nombreLibro + " " + "Fecha:" + " " + fechaPrestamo + " " + "Días de prestamo:" + " " + diasPrestamo;
        }else{
            return "No hay información, debido a que no se pudo realizar el prestamo";
        }
    }
}
