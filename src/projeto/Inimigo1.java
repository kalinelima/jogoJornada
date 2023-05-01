package projeto;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Inimigo1 extends JLabel {

    public static final int METEORO = 0;

    public  Inimigo1(int opcao) {
        Random rand = new Random();
        if (opcao == METEORO) {
            setIcon(new ImageIcon("img/Imagem2.png"));
            setBounds(rand.nextInt(1600), -357, getIcon().getIconWidth(),
                    getIcon().getIconHeight());
        }

        
    }
}
