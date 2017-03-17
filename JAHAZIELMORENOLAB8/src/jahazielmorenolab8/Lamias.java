package jahazielmorenolab8;

import javax.swing.JOptionPane;

public class Lamias extends Hadas{
    
    
    private int aleta;
    private int Branquias;

    public Lamias() {
        super();
    }

    public Lamias(int aleta, int Branquias, String nombre, float estatura, float poder, float salud, int Edad) {
        super(nombre, estatura, poder, salud, Edad);
        this.aleta = aleta;
        this.Branquias = Branquias;
    }


    
    public int getAleta() {
        return aleta;
    }

    public void setAleta(int aleta) {
        if (aleta <= 5){
            this.aleta = aleta;
        } else{
            JOptionPane.showMessageDialog(null, "Menos de 5");
        }
    }

    public int getBranquias() {
        return Branquias;
    }

    public void setBranquias(int Branquias) {
        if (Branquias >=0 && Branquias<=8){
        this.Branquias = Branquias;
        } else{
            JOptionPane.showMessageDialog(null, "no mas de 8");
        }
    }

    @Override
    public String toString() {
        return "Lamias{" + "aleta=" + aleta + ", Branquias=" + Branquias + '}';
    }

    
    @Override
    public float Atacar() {
    
        return 234;
    
    }
    
    
    
}
