package Ejercicio9;

public class Main {
    public static void main(String[] args) {

        Reclamo reclamo = new Reclamo();

        Reclamo.numeroReclamo = 221;
        Reclamo.nombrePersona = "Juan Felipe";
        Reclamo.asunto = "Celular defectuoso";
        Reclamo.descProblema = "Hace varios días mi celular ha estado apagandose solo";
        Reclamo.estadoReclamo = "Activo";

        System.out.println(Reclamo.RecepcionReclamo());
        System.out.println(Reclamo.EstadoReclamo());
    }
}
