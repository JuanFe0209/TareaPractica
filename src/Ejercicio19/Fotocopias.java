package Ejercicio19;

public class Fotocopias {
    public int cantidadCopias;
    public double precioCopia;
    public double total;

    public void CantidadCopias(int next) {
        this.cantidadCopias = next;


    }

    public double PreciosCopias() {
        if (cantidadCopias <= 499) {
           return precioCopia = 120;
        } else if ((cantidadCopias >= 500) && (cantidadCopias <= 749)) {
           return precioCopia = 100;
        } else if ((cantidadCopias >= 750) && (cantidadCopias <= 999)) {
           return precioCopia = 80;
        } else {
          return  precioCopia = 50;
        }
    }
    public double Total () {
      return total = precioCopia * cantidadCopias;
    }
}
