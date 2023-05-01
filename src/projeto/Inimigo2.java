package projeto;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Inimigo2 extends JLabel {

    public static final int EXPLO = 0, EXPLO2 = 1;
    

    public  Inimigo2(int opcao) {
        
        Random rand = new Random();
        if (opcao == EXPLO) {
            setIcon(new ImageIcon("img/explo.gif"));
            setBounds(rand.nextInt(1600), -357, getIcon().getIconWidth(),
                    getIcon().getIconHeight());
            
        }
    
    }

    
}
