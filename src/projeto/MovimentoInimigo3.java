package projeto;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MovimentoInimigo3 extends Thread {
    private boolean gameover=false;
    private Nivel3 nivel3;

    public MovimentoInimigo3(Nivel3 nivel3) {
        this.nivel3 = nivel3;
    }

    public void run() {
        Random rand = new Random();
        while (!gameover) {
            
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimento1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            nivel3.setPontos3(nivel3.getPontos3()+1);
            nivel3.getLabelPontos3().setText("Tempo: "+ nivel3.getPontos3());
            
            for (int j = 0; j < nivel3.getLasers3().size(); j++) {
                JLabel laser = nivel3.getLasers3().get(j);
                laser.setLocation(laser.getX(), laser.getY() - 50);
            }

            int numeroInimigo = (nivel3.getPontos3() % 10) + 1;
            while (numeroInimigo > nivel3.getInimigos3().size()) {
                Inimigo3 inimigo3 = new Inimigo3(rand.nextInt(2));
                nivel3.getPainel3().add(inimigo3);
                nivel3.getPainel3().setComponentZOrder(inimigo3, 0);
                nivel3.getInimigos3().add(inimigo3);
            }
            
            for (int i = 0; i < nivel3.getInimigos3().size(); i++) {
                Inimigo3 ini = nivel3.getInimigos3().get(i);
                ini.setLocation(ini.getX(), ini.getY() + 10);
                
                if (ini.getY() > 900) {
                    ini.setLocation(rand.nextInt(1600), -357);
                    nivel3.setPontos3(nivel3.getPontos3() );
                    
                }
                if (nivel3.getInimigos3().get(i).getBounds().intersects(nivel3.getPersonagem3().getBounds()) ) {
                    nivel3.getPersonagem3().setVisible(false);
                    nivel3.getPainel3().remove(nivel3.getPersonagem3());
                    ini.setLocation(2000, 2000);
                    
                    int opcao = JOptionPane.showConfirmDialog(null, "Você perdeu! , Jogar Novamente? ");
                    if (opcao==0)
                    {
                        new Nivel3();
                        gameover=true;
                        nivel3.dispose();
                       
                    }
                    if(opcao==1){
                        gameover=true;
                        nivel3.dispose();
                    }
                    
                    if(opcao==2){
                        gameover=true;
                    }
                    
                }
                for (int j = 0; j < nivel3.getLasers3().size(); j++) {  
                    
                if (ini.getBounds().intersects(nivel3.getLasers3().get(j).getBounds()) ) {
                      
              
                    ini.setLocation(3000,3000);
                
                }

                nivel3.getPainel3().repaint();

            }

    }
                 
            if(nivel3.getPontos3()== 3000){
                                       
                    int opcao = JOptionPane.showConfirmDialog(null, "Você Ganhou! Quer descobrir quem estava por trás de tudo isso? ");
                    if (opcao==0)
                    {   
                       nivel3.dispose();
                       gameover=true;
                       
                       NivelFinal nivelFinal = new NivelFinal();
                    }
                    if(opcao==1){
                        gameover=true;
                        nivel3.dispose();
                    }
                    
                    if(opcao==2){
                        gameover=true;
                        nivel3.dispose();
                    }
                    
           }
            
            if (nivel3.getPontos3()== 300){
                    nivel3.getInformacoes3().setVisible(false);
                } 
               
} 
}
}
