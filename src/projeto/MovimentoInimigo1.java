package projeto;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MovimentoInimigo1 extends Thread {
    private boolean gameover=false;
    private Nivel1 nivel;

    public MovimentoInimigo1(Nivel1 nivel) {
        this.nivel = nivel;
    }

    public void run() {
        Random rand = new Random();
        while (!gameover) {
            
            try {
                sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimento1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            nivel.setPontos1(nivel.getPontos1()+1);
            nivel.getLabelPontos().setText("Tempo: "+ nivel.getPontos1());
            
            for (int j = 0; j < nivel.getLasers().size(); j++) {
                JLabel laser = nivel.getLasers().get(j);
                laser.setLocation(laser.getX(), laser.getY() - 50);
            }

            int numeroInimigo = (nivel.getPontos1() % 10) + 1;
            while (numeroInimigo > nivel.getInimigos().size()) {
                Inimigo1 inimigo = new Inimigo1(0);
                nivel.getPainel().add(inimigo);
                nivel.getPainel().setComponentZOrder(inimigo, 0);
                nivel.getInimigos().add(inimigo);
            }
            for (int i = 0; i < nivel.getInimigos().size(); i++) {
                Inimigo1 ini = nivel.getInimigos().get(i);
                ini.setLocation(ini.getX(), ini.getY() + 10);
                
                if (ini.getY() > 900 && ini.getY()<1300 ) {
                    ini.setLocation(rand.nextInt(1600), -357);
                    nivel.setPontos1(nivel.getPontos1() );
                    
                }
            if (nivel.getInimigos().get(i).getBounds().intersects(nivel.getPersonagem1().getBounds()) ) {
                    nivel.getPersonagem1().setVisible(false);
                   ini.setLocation(2000, 2000);
                        
                    int opcao = JOptionPane.showConfirmDialog(null, "Você perdeu! , Jogar Novamente? ");
                    if (opcao==0)
                    {
                        new Nivel1();
                        gameover=true;
                        nivel.dispose();
                       
                    }
                    if(opcao==1){
                        gameover=true;
                        nivel.dispose();
                    }
                    
                    if(opcao==2){
                        gameover=true;
                    }
                    
                }
                
                if (nivel.getPontos1()== 400){
                    nivel.getInformacoes().setVisible(false);
                }    
                
                
                    

                for (int j = 0; j < nivel.getLasers().size(); j++) {    
                if (ini.getBounds().intersects(nivel.getLasers().get(j).getBounds())) {
                    
                    ini.setLocation(0,1200);
                    }
                }

                nivel.getPainel().repaint();

            
            

           }
                   if(nivel.getPontos1()== 1000){
                                       
                    int opcao = JOptionPane.showConfirmDialog(null, "Você Ganhou! Quer continuar Jogando? ");
                    if (opcao==0)
                    {
                        gameover=true;
                        nivel.dispose();
                        Nivel2 nivel2 = new Nivel2();
                    }
                    if(opcao==1){
                        gameover=true;
                        nivel.dispose();
                    }
                    
                    if(opcao==2){
                        gameover=true;
                        nivel.dispose();
                    }
                    
                }
    }
                
        
    
}
}
