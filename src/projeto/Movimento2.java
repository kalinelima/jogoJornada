package projeto;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Movimento2 extends Thread {

    private Nivel2 nivel;

    public Movimento2(Nivel2 nivel) {
        this.nivel = nivel;
    }

    public void run() {
        Random rand = new Random();
        while (true) {
            try {
                sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimento1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            nivel.getFundo2().setLocation(nivel.getFundo2().getX() + 5, nivel.getFundo2().getY() + 5);
            nivel.getFundo2_2().setLocation(nivel.getFundo2_2().getX() - 5, nivel.getFundo2_2().getY() + 5);
            
            if (nivel.getFundo2().getY() > nivel.getHeight()) {
                nivel.getFundo2().setLocation(-200, -nivel.getFundo2().getIcon().getIconHeight());
            }
            
            if (nivel.getFundo2_2().getY() > nivel.getHeight()) {
                nivel.getFundo2_2().setLocation(600, -nivel.getFundo2_2().getIcon().getIconHeight());
            }
            
 


            }
        }
}

