package projeto;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

 import javax.swing.ImageIcon;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JPanel;

  public class Nivel2 extends JFrame implements KeyListener{
      
    private ArrayList<Inimigo2> inimigos2; 
    private ArrayList<JLabel> lasers2; 
    
    private JLabel fundo2 = new JLabel();
    private JLabel fundo2_2 = new JLabel();
    private JLabel personagem2 = new JLabel();
    private JLabel labelPontos2 = new JLabel();
    private JLabel laser2 = new JLabel();
    private JPanel painel2= new JPanel();
    private JLabel informacoes2 =  new JLabel();
    private int pontos2 = 0;   
      
      public Nivel2() {
        inicializar2();
      }
      
      private void inicializar2(){
          Random rand = new Random();
          
          setSize(1600, 900);
          setVisible(true);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          setLayout(null);
          setTitle("Nível 2");
          
          painel2.setSize(1600,900);
          
          setInimigos2(new ArrayList<Inimigo2>());

          setLasers2(new ArrayList<JLabel> ());
        
        painel2.setLayout(null);
        add(painel2);
        
        personagem2.setIcon(new ImageIcon("img/Imagem4.png"));
        personagem2.setBounds(700, 500,
        getPersonagem2().getIcon().getIconWidth(),
        getPersonagem2().getIcon().getIconHeight());

        Inimigo2 inimigo2 = new Inimigo2(0);

        inimigos2.add(inimigo2);

        setLabelPontos2(new JLabel("Tempo: " + getPontos2()));
        getLabelPontos2().setSize(150, 50);
        getLabelPontos2().setLocation(10, 10);
        labelPontos2.setForeground(Color.white);

        fundo2.setIcon(new ImageIcon("img/fundoVenos.png"));
        fundo2.setBounds(0, 0,
        fundo2.getIcon().getIconWidth(),
        fundo2.getIcon().getIconHeight());
        
        
        getFundo2_2().setIcon(new ImageIcon("img/fundoVenos.png"));
        getFundo2_2().setBounds(1600, 900,
        getFundo2_2().getIcon().getIconWidth(),
        getFundo2_2().getIcon().getIconHeight());
        
        informacoes2.setIcon(new ImageIcon("img/info2.png"));
        informacoes2.setBounds(100,0,
        informacoes2.getIcon().getIconWidth(),
        informacoes2.getIcon().getIconHeight());

        painel2.add(fundo2);
        painel2.add(getFundo2_2());
        painel2.add(personagem2);
        painel2.add(labelPontos2);
        painel2.add(laser2);
        painel2.add(informacoes2);
        painel2.setBackground(new Color( Color.ORANGE.getRGB()));
        new Movimento2(this).start();
        new MovimentoInimigo2(this).start();
        addKeyListener(this);

    }

    public void keyTyped(KeyEvent e) {

        if (e.getKeyChar() == 'w' && getPersonagem2().getY() > 50) {
            getPersonagem2().setLocation(getPersonagem2().getX(), getPersonagem2().getY() - 50);
        } else if (e.getKeyChar() == 's' && getPersonagem2().getY() +getPersonagem2().getHeight()< 850) {
            getPersonagem2().setLocation(getPersonagem2().getX(), getPersonagem2().getY() + 50);
        }
        if (e.getKeyChar() == 'd' && getPersonagem2().getWidth() + getPersonagem2().getX() < 1570) {
            getPersonagem2().setLocation(getPersonagem2().getX() + 50, getPersonagem2().getY());
        } else if (e.getKeyChar() == 'a' && getPersonagem2().getX() > 0) {
            getPersonagem2().setLocation(getPersonagem2().getX() - 50, getPersonagem2().getY());
         
        } else if (e.getKeyChar() == 't') {
            JLabel tiro = new JLabel();
            tiro.setIcon(new ImageIcon("img/bolinha.png"));
            tiro.setBounds(getPersonagem2().getX() + 58, getPersonagem2().getY()+60,
                    tiro.getIcon().getIconWidth(),
                    tiro.getIcon().getIconHeight());
            add(tiro);
            setComponentZOrder(tiro, 0);
            getLasers2().add(tiro);
        }
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {

    }

    public JLabel getFundo2() {
        return fundo2;
    }

    public void setFundo2(JLabel fundo2) {
        this.fundo2 = fundo2;
    }

    public JLabel getPersonagem2() {
        return personagem2;
    }

    public void setPersonagem2(JLabel personagem2) {
        this.personagem2 = personagem2;
    }

    public JLabel getLabelPontos2() {
        return labelPontos2;
    }

    public void setLabelPontos2(JLabel labelPontos2) {
        this.labelPontos2 = labelPontos2;
    }

    public JLabel getLaser2() {
        return laser2;
    }

    public void setLaser2(JLabel laser2) {
        this.laser2 = laser2;
    }

    public JPanel getPainel2() {
        return painel2;
    }

    public void setPainel2(JPanel painel2) {
        this.painel2 = painel2;
    }

    public int getPontos2() {
        return pontos2;
    }

    public void setPontos2(int pontos2) {
        this.pontos2 = pontos2;
    }

    public ArrayList<Inimigo2> getInimigos2() {
        return inimigos2;
    }

    public void setInimigos2(ArrayList<Inimigo2> inimigos2) {
        this.inimigos2 = inimigos2;
    }

    public ArrayList<JLabel> getLasers2() {
        return lasers2;
    }

    public void setLasers2(ArrayList<JLabel> lasers2) {
        this.lasers2 = lasers2;
    }

    public JLabel getFundo2_2() {
        return fundo2_2;
    }

    public void setFundo2_2(JLabel fundo2_2) {
        this.fundo2_2 = fundo2_2;
    }

    public JLabel getInformacoes2() {
        return informacoes2;
    }

    public void setInformacoes2(JLabel informacoes2) {
        this.informacoes2 = informacoes2;
    }
    
    
    
          
      }
        