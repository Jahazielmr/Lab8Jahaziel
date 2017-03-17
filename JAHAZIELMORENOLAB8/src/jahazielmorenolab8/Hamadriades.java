package jahazielmorenolab8;

public class Hamadriades extends Hadas{

    private float saludArbol ;

    public Hamadriades() {
        super();
    }

    public Hamadriades(float saludArbol, String nombre, float estatura, float poder, float salud, int Edad) {
        super(nombre, estatura, poder, salud, Edad);
        this.saludArbol = saludArbol;
    }

   
    
    
    public float getSaludArbol() {
        return saludArbol;
    }

    public void setSaludArbol(float saludArbol) {
        this.saludArbol = saludArbol;
    }

    @Override
    public String toString() {
        return "Hamadriades{" + "saludArbol=" + saludArbol + '}';
    }
    
    
    
    @Override
    public float Atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
