package jahazielmorenolab8;

import javax.swing.JOptionPane;

public class Salamandras extends Hadas{

    private int Alas;
    
    public Salamandras() {
        super();
    }

    public Salamandras(int Alas, String nombre, float estatura, float poder, float salud, int Edad) {
        super(nombre, estatura, poder, salud, Edad);
        this.Alas = Alas;
    }


    public int getAlas() {
        return Alas;
    }

    public void setAlas(int alas) {
        if (alas<= 6){
        this.Alas = alas;
        }else{
            JOptionPane.showMessageDialog(null, "6 o menos");
        }
    }

    

    
    
    
    
    
    
    
    
    
    
    
}
