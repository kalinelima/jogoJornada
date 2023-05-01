package projeto;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Movimento3 extends Thread {

    private Nivel3 nivel;

    public Movimento3(Nivel3 nivel) {
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
            
            nivel.getFundo3().setLocation(nivel.getFundo3().getX() + 5, nivel.getFundo3().getY() + 5);
            nivel.getFundo3_3().setLocation(nivel.getFundo3_3().getX() - 5, nivel.getFundo3_3().getY() + 5);
            
            if (nivel.getFundo3().getY() > nivel.getHeight()) {
                nivel.getFundo3().setLocation(-200, -nivel.getFundo3().getIcon().getIconHeight());
            }
            
            if (nivel.getFundo3_3().getY() > nivel.getHeight()) {
                nivel.getFundo3_3().setLocation(600, -nivel.getFundo3_3().getIcon().getIconHeight());
            }
            
           
 


            }
        }
    }

