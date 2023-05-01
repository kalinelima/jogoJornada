package projeto;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nivel3 extends JFrame implements KeyListener{
      
    private ArrayList<Inimigo3> inimigos3; 
    private ArrayList<JLabel> lasers3; 
    
    private JLabel fundo3 = new JLabel();
    private JLabel fundo3_3 = new JLabel();
    private JLabel personagem3 = new JLabel();
    private JLabel labelPontos3 = new JLabel();
    private JLabel laser3 = new JLabel();
    private JPanel painel3= new JPanel();
    private JLabel informacoes3 =  new JLabel();
    private int pontos3 = 0;   
      
      public Nivel3() {
        inicializar3();
      }
      
      private void inicializar3(){
          Random rand = new Random();
          
          setSize(1600, 900);
          setVisible(true);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          setLayout(null);
          setTitle("Nível 3");
          
          painel3.setSize(1600,900);
          
          setInimigos3(new ArrayList<Inimigo3>());

          setLasers3(new ArrayList<JLabel> ());
        
        painel3.setLayout(null);
        add(painel3);
        
        personagem3.setIcon(new ImageIcon("img/Imagem4.png"));
        personagem3.setBounds(700, 500,
        getPersonagem3().getIcon().getIconWidth(),
        getPersonagem3().getIcon().getIconHeight());

        Inimigo3 inimigo3 = new Inimigo3(rand.nextInt(2));

        inimigos3.add(inimigo3);

        setLabelPontos3(new JLabel("Tempo: " + getPontos3()));
        getLabelPontos3().setSize(150, 50);
        getLabelPontos3().setLocation(10, 10);
        labelPontos3.setForeground(Color.white);

        fundo3.setIcon(new ImageIcon("img/estrela.png"));
        fundo3.setBounds(0, 0,
        fundo3.getIcon().getIconWidth(),
        fundo3.getIcon().getIconHeight());
        
        fundo3_3.setIcon(new ImageIcon("img/estrela.png"));
        fundo3_3.setBounds(1600,900,
        fundo3_3.getIcon().getIconWidth(),
        fundo3_3.getIcon().getIconHeight());
        
        informacoes3.setIcon(new ImageIcon("img/info3.png"));
        informacoes3.setBounds(100,0,
        informacoes3.getIcon().getIconWidth(),
        informacoes3.getIcon().getIconHeight());


        painel3.add(personagem3);
        painel3.add(fundo3);
        painel3.add(fundo3_3);
        painel3.add(labelPontos3);
        painel3.add(informacoes3);
        painel3.add(laser3);
        painel3.setBackground(new Color( Color.GRAY.getRGB()));
        new Movimento3(this).start();
        new MovimentoInimigo3(this).start();
        addKeyListener(this);

    }

    public JLabel getFundo3_3() {
        return fundo3_3;
    }

    public void setFundo3_3(JLabel fundo3_3) {
        this.fundo3_3 = fundo3_3;
    }

    public void keyTyped(KeyEvent e) {

        if (e.getKeyChar() == 'w' && getPersonagem3().getY() > 50) {
            getPersonagem3().setLocation(getPersonagem3().getX(), getPersonagem3().getY() - 50);
        }
        if (e.getKeyChar() == 's' && getPersonagem3().getY() +getPersonagem3().getHeight()< 850) {
            getPersonagem3().setLocation(getPersonagem3().getX(), getPersonagem3().getY() + 50);
        }
        if (e.getKeyChar() == 'd' &&  getPersonagem3().getWidth() + getPersonagem3().getX() < 1570) {
            getPersonagem3().setLocation(getPersonagem3().getX() + 50, getPersonagem3().getY());
        }
        if (e.getKeyChar() == 'a' && getPersonagem3().getX() > 0) {
            getPersonagem3().setLocation(getPersonagem3().getX() - 50, getPersonagem3().getY());
         
        } else if (e.getKeyChar() == 't') {
            JLabel tiro = new JLabel();
            tiro.setIcon(new ImageIcon("img/arma3.png"));
            tiro.setBounds(getPersonagem3().getX() + 60, getPersonagem3().getY()+40,
                    tiro.getIcon().getIconWidth(),
                    tiro.getIcon().getIconHeight());
            add(tiro);
            setComponentZOrder(tiro, 0);
            getLasers3().add(tiro);
        }
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {

    }

    public JLabel getFundo3() {
        return fundo3;
    }

    public void setFundo3(JLabel fundo3) {
        this.fundo3 = fundo3;
    }

    public JLabel getPersonagem3() {
        return personagem3;
    }

    public void setPersonagem3(JLabel personagem3) {
        this.personagem3 = personagem3;
    }

    public JLabel getLabelPontos3() {
        return labelPontos3;
    }

    public void setLabelPontos3(JLabel labelPontos3) {
        this.labelPontos3 = labelPontos3;
    }

    public JLabel getLaser3() {
        return laser3;
    }

    public void setLaser3(JLabel laser3) {
        this.laser3 = laser3;
    }

    public JPanel getPainel3() {
        return painel3;
    }

    public void setPainel3(JPanel painel3) {
        this.painel3 = painel3;
    }

    public int getPontos3() {
        return pontos3;
    }

    public void setPontos3(int pontos3) {
        this.pontos3 = pontos3;
    }

    public ArrayList<Inimigo3> getInimigos3() {
        return inimigos3;
    }

    public void setInimigos3(ArrayList<Inimigo3> inimigos3) {
        this.inimigos3 = inimigos3;
    }

    public ArrayList<JLabel> getLasers3() {
        return lasers3;
    }

    public void setLasers3(ArrayList<JLabel> lasers3) {
        this.lasers3 = lasers3;
    }

    public JLabel getInformacoes3() {
        return informacoes3;
    }

    public void setInformacoes3(JLabel informacoes3) {
        this.informacoes3 = informacoes3;
    }
    
    
          
      }