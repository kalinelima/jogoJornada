package projeto;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MovimentoInimigo2 extends Thread {
    private boolean gameover=false;
    private Nivel2 nivel2;

    public MovimentoInimigo2(Nivel2 nivel2) {
        this.nivel2 = nivel2;
    }

    public void run() {
        Random rand = new Random();
        while (!gameover) {
            
            try {
                sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimento1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            nivel2.setPontos2(nivel2.getPontos2()+1);
            nivel2.getLabelPontos2().setText("Tempo: "+ nivel2.getPontos2());
            
            for (int j = 0; j < nivel2.getLasers2().size(); j++) {
                JLabel laser = nivel2.getLasers2().get(j);
                laser.setLocation(laser.getX(), laser.getY() - 50);
            }

            int numeroInimigo = (nivel2.getPontos2() % 10) + 1;
            while (numeroInimigo > nivel2.getInimigos2().size()) {
                Inimigo2 inimigo2 = new Inimigo2(0);
                nivel2.getPainel2().add(inimigo2);
                nivel2.getPainel2().setComponentZOrder(inimigo2, 0);
                nivel2.getInimigos2().add(inimigo2);
            }
            for (int i = 0; i < nivel2.getInimigos2().size(); i++) {
                Inimigo2 ini = nivel2.getInimigos2().get(i);
                ini.setLocation(ini.getX(), ini.getY() + 10);
                
                if (ini.getY() > 900) {
                    ini.setLocation(rand.nextInt(1600), -357);
                    nivel2.setPontos2(nivel2.getPontos2() );
                    
                }
                if (nivel2.getInimigos2().get(i).getBounds().intersects(nivel2.getPersonagem2().getBounds()) ) {
                    nivel2.getPersonagem2().setVisible(false);
                    ini.setLocation(2000, 2000);
                        
                    int opcao = JOptionPane.showConfirmDialog(null, "Você perdeu! , Jogar Novamente? ");
                    if (opcao==0)
                    {
                        new Nivel2();
                         gameover=true;
                        nivel2.dispose();
                       
                    }
                    if(opcao==1){
                        gameover=true;
                        nivel2.dispose();
                    }
                    
                    if(opcao==2){
                        gameover=true;
                    }
                    
                }
                for (int j = 0; j < nivel2.getLasers2().size(); j++) {  
                    
                if (ini.getBounds().intersects(nivel2.getLasers2().get(j).getBounds()) ) {
                      
              
                    ini.setLocation(3000,3000);
                
                }

                nivel2.getPainel2().repaint();

            }
            

           }
                   if(nivel2.getPontos2()== 2000){
                                       
                    int opcao = JOptionPane.showConfirmDialog(null, "Você Ganhou! Quer continuar Jogando? ");
                    if (opcao==0)
                    {   
                       nivel2.dispose();
                       gameover=true;
                       
                       Nivel3 nivel3 = new Nivel3();
                    }
                    if(opcao==1){
                        gameover=true;
                        nivel2.dispose();
                    }
                    
                    if(opcao==2){
                        gameover=true;
                        nivel2.dispose();
                    }
                    
                }
                   if (nivel2.getPontos2()== 300){
                    nivel2.getInformacoes2().setVisible(false);
                } 
    }
}
}