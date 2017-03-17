package jahazielmorenolab8;

public class ThreadBatallas extends Thread{
    
    
    Hadas player1, player2;

    public ThreadBatallas() {
        super();
    }

    
    
    public ThreadBatallas(Hadas player1, Hadas player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Hadas getPlayer1() {
        return player1;
    }

    public void setPlayer1(Hadas player1) {
        this.player1 = player1;
    }

    public Hadas getPlayer2() {
        return player2;
    }

    public void setPlayer2(Hadas player2) {
        this.player2 = player2;
    }

    @Override
    public String toString() {
        return "ThreadBatallas{" + "player1=" + player1 + ", player2=" + player2 + '}';
    }
    
       @Override
    public void run(){
        
        
        while (player1.getSalud()>0&&player2.getSalud()>0) {
            player2.setSalud(player1.Ataque(player2.getDefensa(), player2.getSalud(), player2.geta()));
            player1.setSalud(player2.Ataque(player1.getDefensa(), player1.getSalud(),  player1.getAtaque()));
            
            jugador2.setDefensa(jugador1.Ataque(jugador2.getDefensa(), jugador2.getSalud(), jugador2.getAtaque()));
            jugador1.setDefensa(jugador2.Ataque(jugador1.getDefensa(), jugador1.getSalud(), jugador1.getAtaque()));
            
            
            
            System.out.println(this);
            bitacora+= jugador2.getSalud()+"\n"+ jugador1.getSalud()+"\n";
        }
        if (player1.getSalud()>0) {
            System.out.println("El ganador es el jugador 1 ");
        }else{
            System.out.println("El ganador es el jugador 2 ");

        }
        
    }
    
    
    
    
    
    
    
}
