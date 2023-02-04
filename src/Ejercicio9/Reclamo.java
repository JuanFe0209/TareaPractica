package Ejercicio9;

public class Reclamo {

    public static int numeroReclamo;
    public static String nombrePersona;
    public static String asunto;
    public static String descProblema;
    public static String estadoReclamo;

    public static String RecepcionReclamo(){
        if(estadoReclamo.equals("Activo")){
            return "Su reclamo ha sido recibido con exito";
        }else{
            return "Su reclamo no ha sido recibido, por favor ingrese un nuevo reclamo";
        }
    }

    public static String EstadoReclamo(){
        if(estadoReclamo.equals("Activo")){
            return "Su reclamo esta siendo revisado, en poco tiempo daremos respuesta";
        }else{
            return "Su reclamo aún no ha sido revisado, por favor tenga paciencia";
        }
    }
}
