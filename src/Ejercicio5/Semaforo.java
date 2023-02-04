package Ejercicio5;

public class Semaforo {
    public String color;
    public boolean estado;
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean booleanisEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public String
    MostrarmensajeSemaforo(){
        if(color.equals("verde")){
            return"Siga";
        }else if(color.equals("rojo")){
            return"Pare";
        }else{
            return "Semaforo en espera";
        }
    }
    }


