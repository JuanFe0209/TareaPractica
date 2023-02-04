package Ejercicio1;

public class UsuarioBase {

    public String usuarioBase;
    public String uIngresado;
    public String clave;
    public String clIngresada;
    public String estado;

    public String Estado(String clIngresada) {

        return this.clIngresada = clIngresada;
    }


    public String Acceso() {

        if (clIngresada.equals("clave")) {
            return "Bienvenido, puede ingresar";
        } else {
            return "No puede ingresar, intentelo de nuevo";
        }
    }
}

