package projeto;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Movimento1 extends Thread {

    private Nivel1 nivel;

    public Movimento1(Nivel1 nivel) {
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
           
         

            nivel.getFundo1_2().setLocation(nivel.getFundo1_2().getX() + 5, nivel.getFundo1_2().getY() + 5);
            nivel.getFundo1_3().setLocation(nivel.getFundo1_3().getX() - 5, nivel.getFundo1_3().getY() + 5);
            
            if (nivel.getFundo1_2().getY() > nivel.getHeight()) {
                nivel.getFundo1_2().setLocation(-200, -nivel.getFundo1_2().getIcon().getIconHeight());
            }
            if (nivel.getFundo1_3().getY() > nivel.getHeight()) {
                nivel.getFundo1_3().setLocation(600, -nivel.getFundo1_3().getIcon().getIconHeight());
            }


            }
        }
    }
