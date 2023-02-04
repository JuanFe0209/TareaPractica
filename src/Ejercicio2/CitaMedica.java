package Ejercicio2;

public class CitaMedica {
    public static int codigoCita;
    public static String fechaCita;
    public static int horaCita;
    public static String consultorioCita;
    public static String nombreMedico;
    public static String nombrePaciente;
    public static String centroMedico;

    public static String Cita(){
        return "Estimad@" +" " + nombrePaciente + " " + "se ha creado una nueva cita con el codigo: " + " " + codigoCita;
    }
    public static String DatosCita(){
        return "Nombre: " + " " + nombrePaciente + " " + "Centro medico: " + " " + centroMedico + " " + "Fecha: " + " " + fechaCita + " " + "Hora:" + " " + horaCita + " " + "Consultorio:" + " " + consultorioCita + " " + "Medico:" + " " + nombreMedico;
    }
   public static String CambiarCitaFecha(){
        return fechaCita = "04/02/22";
   }
   public int CambiarCitaHora(){
        return horaCita = 4;
   }

    public class CrearCita {
    }
}
