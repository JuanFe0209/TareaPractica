package Ejercicio23;

public class Sandwich {

    public String tamaño;
    public String carne;
    public String queso;
    public String jalapeño;
    public double precioSandwich;

    public void Tamaño(String next) {
        this.tamaño = next;
    }

    public void Carnecliente(String next) {
        this.carne = next;
    }

    public void Queso(String next) {
        this.queso = next;
    }

    public void Jalapeño(String next) {
        this.jalapeño = next;

    }

    public void Sandwich() {
        if (tamaño.equals("grande")) {
            precioSandwich += 12000;
        } else {
            precioSandwich += 6000;
        }
        if (carne.equals("tocineta")) {
            precioSandwich += 3000;
        } else if (carne.equals("pavo")) {
            precioSandwich += 3000;
        }
        if (queso.equals("si")) {
            precioSandwich += 2500;
        }
    }

    public double total() {
        return precioSandwich;
    }
}


