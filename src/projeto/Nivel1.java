package projeto;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nivel1 extends JFrame implements KeyListener {

    public Nivel1() {
        inicializar();
    }
    private ArrayList<Inimigo1> inimigos;
    private ArrayList<JLabel> lasers;
    
    private JLabel fundo1_2 = new JLabel();
    private JLabel fundo1_3 = new JLabel();
    private JLabel personagem1 = new JLabel();
    private JLabel labelPontos = new JLabel();
    private JLabel laser = new JLabel();
    private JLabel informacoes =  new JLabel();
    
    private JPanel painel= new JPanel();
    
    private int pontos1 = 0;

    private void inicializar() {

        setSize(1600, 900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Nível 1");

        painel.setSize(1600,900);
        inimigos = new ArrayList<Inimigo1>();

        lasers = new ArrayList<JLabel> ();
        
        painel.setLayout(null);
        
        add(painel);
        
        informacoes.setIcon(new ImageIcon("img/info1.png"));
        informacoes.setBounds(100,0,
        informacoes.getIcon().getIconWidth(),
        informacoes.getIcon().getIconHeight());
        
        getPersonagem1().setIcon(new ImageIcon("img/Imagem4.png"));
        getPersonagem1().setBounds(700, 600,
        getPersonagem1().getIcon().getIconWidth(),
        getPersonagem1().getIcon().getIconHeight());

        Inimigo1 inimigo = new Inimigo1(0);

        inimigos.add(inimigo);

        setLabelPontos(new JLabel("Tempo: " + getPontos1()));
        getLabelPontos().setSize(150, 50);
        getLabelPontos().setLocation(10, 10);
        labelPontos.setForeground(Color.white);


        fundo1_2.setIcon(new ImageIcon("img/Fundo1.png"));
        fundo1_2.setBounds(0, 0,
        fundo1_2.getIcon().getIconWidth(),
        fundo1_2.getIcon().getIconHeight());


        fundo1_3.setIcon(new ImageIcon("img/Fundo1.png"));
        fundo1_3.setBounds(fundo1_3.getIcon().getIconWidth(),
       -fundo1_3.getIcon().getIconHeight(),
        fundo1_3.getIcon().getIconWidth(),
        fundo1_3.getIcon().getIconHeight());

        painel.add(informacoes);
        painel.add(fundo1_2);
        painel.add(fundo1_3);
        painel.add(personagem1);
        painel.add(labelPontos);
        painel.add(getLaser());
        painel.setBackground(new Color( Color.blue.getRGB()));
        new Movimento1(this).start();
        new MovimentoInimigo1(this).start();
        addKeyListener(this);
        
    }

    public void keyTyped(KeyEvent e) {

        if (e.getKeyChar() == 'w' && getPersonagem1().getY() > 50) {
            getPersonagem1().setLocation(getPersonagem1().getX(), getPersonagem1().getY() - 50);
        } 
        if (e.getKeyChar() == 's' && getPersonagem1().getY() +getPersonagem1().getHeight()< 850) {
            getPersonagem1().setLocation(getPersonagem1().getX(), getPersonagem1().getY() +50);
        }
        if (e.getKeyChar() == 'd' && getPersonagem1().getWidth() + getPersonagem1().getX() < 1570) {
            getPersonagem1().setLocation(getPersonagem1().getX() + 50, getPersonagem1().getY());
        } else if (e.getKeyChar() == 'a' && getPersonagem1().getX() > 0) {
            getPersonagem1().setLocation(getPersonagem1().getX() - 50, getPersonagem1().getY());
         
        } else if (e.getKeyChar() == 't') {
            JLabel tiro = new JLabel();
            tiro.setIcon(new ImageIcon("img/lazer.png"));
            tiro.setBounds(getPersonagem1().getX() + 68, getPersonagem1().getY() -150,
                    tiro.getIcon().getIconWidth(),
                    tiro.getIcon().getIconHeight());
            add(tiro);
            setComponentZOrder(tiro, 0);
            lasers.add(tiro);
        }
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {

    }

    public JLabel getPersonagem1() {
        return personagem1;
    }

    public void setPersonagem1(JLabel personagem1) {
        this.personagem1 = personagem1;
    }

    public JLabel getLabelPontos() {
        return labelPontos;
    }

    public void setLabelPontos(JLabel labelPontos) {
        this.labelPontos = labelPontos;
    }

    public int getPontos1() {
        return pontos1;
    }

    public void setPontos1(int pontos1) {
        this.pontos1 = pontos1;
    }

    public JLabel getFundo1_2() {
        return fundo1_2;
    }

    public void setFundo1_2(JLabel fundo1_2) {
        this.fundo1_2 = fundo1_2;
    }

    public JPanel getPainel() {
        return painel;
    }

    public void setPainel(JPanel painel) {
        this.painel = painel;
    }

    public JLabel getFundo1_3() {
        return fundo1_3;
    }

    public void setFundo1_3(JLabel fundo1_3) {
        this.fundo1_3 = fundo1_3;
    }

    public ArrayList<Inimigo1> getInimigos() {
        return inimigos;
    }

    public void setInimigos(ArrayList<Inimigo1> inimigos) {
        this.inimigos = inimigos;
    }

    public ArrayList<JLabel> getLasers() {
        return lasers;
    }

    public void setLasers(ArrayList<JLabel> lasers) {
        this.lasers = lasers;
    }
    
     public JLabel getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(JLabel informacoes) {
        this.informacoes = informacoes;
    }

    public JLabel getLaser() {
        return laser;
    }

    public void setLaser(JLabel laser) {
        this.laser = laser;
    }

}
