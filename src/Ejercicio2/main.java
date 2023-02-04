package Ejercicio2;

public class main {
    public static void main(String[] args) {

    CitaMedica citamedica = new CitaMedica();

    CitaMedica.nombrePaciente = "Juan Felipe";
    CitaMedica.codigoCita = 2209;
    CitaMedica.nombreMedico = "Hugo Lopez";
    CitaMedica.consultorioCita = "106";
    CitaMedica.fechaCita = "31/01/2023";
    CitaMedica.horaCita = 5;
    CitaMedica.centroMedico = "Cosmitet";

        System.out.println(CitaMedica.Cita());
        System.out.println("La informacíon acerca de su cita es la siguiente" + " " + CitaMedica.DatosCita());


        System.out.println("La fecha de su cita ha sido cambiada:" + " " + CitaMedica.CambiarCitaFecha());
        System.out.println("La hora de su nueva cita es:" + " " + citamedica.CambiarCitaHora());



    }
}

