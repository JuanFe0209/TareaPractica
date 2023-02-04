package Ejercicio1;

public class MainBase {
    public static void main(String[] args) {

        UsuarioBase usuario = new UsuarioBase();

        usuario.Estado("usuario");

        System.out.println(usuario.Acceso());

    }
}
