package jahazielmorenolab8;

import javax.swing.JProgressBar;

public class ThreadBatallas extends Thread{
    
    JProgressBar p1, p2;
    Hadas player1, player2;

    public ThreadBatallas() {
        super();
    }

    public ThreadBatallas(JProgressBar p1, JProgressBar p2, Hadas player1, Hadas player2) {
        this.p1 = p1;
        this.p2 = p2;
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
    
    private boolean runs = true;
    private boolean vive = true;

    public boolean isRuns() {
        return runs;
    }

    public void setRuns(boolean runs) {
        this.runs = runs;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run() {
        while (vive) {
            if (runs) {
                if (player1 instanceof Salamandras && ((player2 instanceof Hamadriades))) {
                    player2.setSalud((int) (player2.getSalud() - (player1.getPoder() + (player1.getPoder() * 0.37))));
                } else if (((player1 instanceof Lamias) || (player1 instanceof Silfides)) && (player2 instanceof Hamadriades)) {
                    if (player1 instanceof Lamias) {
                        player2.setSalud((int) (player2.getSalud() - (player1.getPoder() + (player1.getPoder() * 0.42))));
                    }
                    if (player1 instanceof Silfides) {
                        player2.setSalud((int) (player2.getSalud() - (player1.getPoder() + (player1.getPoder() * 0.37))));
                    }
                } else {
                    player2.setSalud(player2.getSalud() - (player1.getPoder()));
                }
                if (player2 instanceof Salamandras && ((player1 instanceof Hamadriades))) {
                    player1.setSalud((int) (player1.getSalud() - (player1.getPoder() + (player2.getPoder() * 0.37))));
                } else if (((player2 instanceof Lamias) || (player2 instanceof Silfides)) && (player1 instanceof Hamadriades)) {
                    if (player2 instanceof Lamias) {
                        player1.setSalud((int) (player1.getSalud() - (player2.getPoder() + (player2.getPoder() * 0.42))));
                    }
                    if (player2 instanceof Silfides) {
                        player1.setSalud((int) (player1.getSalud() - (player2.getPoder() + (player2.getPoder() * 0.37))));
                    }
                } else {
                    player1.setSalud(player1.getSalud() - (player2.getPoder()));
                }
            }
        }
    }
    
    
    
    
    
}
