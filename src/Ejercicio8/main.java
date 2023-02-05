package Ejercicio8;

public class main {
    public static void main(String[] args) {
        Envio envio = new Envio();

        Envio.numeroGuia = 2211;
        Envio.cedulaCliente = 119322114;
        Envio.fecha = "01/02/2023";
        Envio.tipoEmbalaje = "Madera";
        Envio.peso = 200;
        Envio.ciudadOrigen = "Armenia";
        Envio.ciudadDestino = "Medellin";
        Envio.estadoEnvio = "Activo";
        Envio.costo = 300.000;

        System.out.println("El costo por kilo es:" + " " + Envio.CalcularCostoxKilo());
        System.out.println(Envio.VerificarEntrega());



    }
}
