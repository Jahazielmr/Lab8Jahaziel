package jahazielmorenolab8;

import java.io.Serializable;
import javax.swing.JOptionPane;

public abstract class Hadas implements Serializable{
    
    private static final long SerialVersionUID = 777L;
    
    protected String nombre;
    protected float estatura;
    protected float poder, salud;
    protected int Edad;

    public Hadas() {
    }

    public Hadas(String nombre, float estatura, float poder, float salud, int Edad) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.poder = poder;
        this.salud = salud;
        this.Edad = Edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
 
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        if (estatura >=0 && estatura<=15){
        this.estatura = estatura;
        } else{
            JOptionPane.showMessageDialog(null, "Menor que 15");
        }
    }

    public float getPoder() {
        return poder;
    }

    public void setPoder(float poder) {
        this.poder = poder;
    }

    public float getSalud() {
        return salud;
    }

    public void setSalud(float salud) {
        this.salud = salud;
    }

    @Override
    public String toString() {
        return "Hadas{" + "nombre=" + nombre + ", estatura=" + estatura + ", poder=" + poder + ", salud=" + salud + '}';
    }
    
    
    public abstract float Atacar();
    
    
}
