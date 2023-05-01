package projeto;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Inimigo3 extends JLabel {

    public static final int ET1 = 0, ET2 =1;
    

    public  Inimigo3(int opcao) {
        
        Random rand = new Random();
        if (opcao == ET1) {
            setIcon(new ImageIcon("img/et1.gif"));
            setBounds(rand.nextInt(1600), -357, getIcon().getIconWidth(),
                    getIcon().getIconHeight());
            
        }
        
        if (opcao == ET2) {
            setIcon(new ImageIcon("img/et2.gif"));
           setBounds(rand.nextInt(1600), -357, getIcon().getIconWidth(),
                    getIcon().getIconHeight());
        }
        
        
    } }
        
    

    
 