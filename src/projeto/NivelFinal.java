package projeto;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NivelFinal extends JFrame implements KeyListener {

    private JLabel fundoFinal = new JLabel();
    private JLabel fundoFinal_2 = new JLabel();
    private JLabel fundoFinal_3 = new JLabel();
    private JLabel balao = new JLabel();
    private JLabel nossoGif = new JLabel();
    private JLabel texto = new JLabel();
    private JLabel personagemFinal = new JLabel();
    private JPanel painel = new JPanel();

    public NivelFinal() {
        inicializar();
    }

    private void inicializar() {

        setSize(1600, 900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Final");

        getPainel().setSize(1600, 900);
        getPainel().setLayout(null);
        add(getPainel());

        getNossoGif().setIcon(new ImageIcon("img/nossoGif.gif"));
        getNossoGif().setBounds(30, 400,
        getNossoGif().getIcon().getIconWidth(),
        getNossoGif().getIcon().getIconHeight());

        getBalao().setIcon(new ImageIcon("img/balao.png"));
        getBalao().setBounds(850, 400,
        getBalao().getIcon().getIconWidth(),
        getBalao().getIcon().getIconHeight());

        getPersonagemFinal().setIcon(new ImageIcon("img/etDança.gif"));
        getPersonagemFinal().setBounds(900, 610,
        getPersonagemFinal().getIcon().getIconWidth(),
        getPersonagemFinal().getIcon().getIconHeight());

        fundoFinal.setIcon(new ImageIcon("img/pic.gif"));
        fundoFinal.setBounds(700, 50, 800, 750);

        fundoFinal_2.setIcon(new ImageIcon("img/PARABENS.png"));
        fundoFinal_2.setBounds(20, 100,
        fundoFinal_2.getIcon().getIconWidth(),
        fundoFinal_2.getIcon().getIconHeight());

        getFundoFinal_3().setIcon(new ImageIcon("img/fundoPreto.gif"));
        getFundoFinal_3().setBounds(0, 0,
        getFundoFinal_3().getIcon().getIconWidth(),
        getFundoFinal_3().getIcon().getIconHeight());

        getPainel().add(getNossoGif());
        getPainel().add(getBalao());
        getPainel().add(personagemFinal);
        getPainel().add(fundoFinal);
        getPainel().add(fundoFinal_2);
        getPainel().add(getFundoFinal_3());
        getPainel().setBackground(new Color(Color.BLACK.getRGB()));

        addKeyListener(this);

    }

    public void keyTyped(KeyEvent e) {

        if (e.getKeyChar() == 'w' && getPersonagemFinal().getY() > 50) {
            getPersonagemFinal().setLocation(getPersonagemFinal().getX(), getPersonagemFinal().getY() - 50);
        } else if (e.getKeyChar() == 's' && getPersonagemFinal().getY() < 500) {
            getPersonagemFinal().setLocation(getPersonagemFinal().getX(), getPersonagemFinal().getY() + 100);
        }
        if (e.getKeyChar() == 'd' && getPersonagemFinal().getWidth() + getPersonagemFinal().getX() < 1600) {
            getPersonagemFinal().setLocation(getPersonagemFinal().getX() + 50, getPersonagemFinal().getY());
        } else if (e.getKeyChar() == 'a' && getPersonagemFinal().getY() > 100) {
            getPersonagemFinal().setLocation(getPersonagemFinal().getX() - 50, getPersonagemFinal().getY());

        }
    }

    public JLabel getFundoFinal() {
        return fundoFinal;
    }

    public void setFundoFinal(JLabel fundoFinal) {
        this.fundoFinal = fundoFinal;
    }

    public JLabel getPersonagemFinal() {
        return personagemFinal;
    }

    public void setPersonagemFinal(JLabel personagemFinal) {
        this.personagemFinal = personagemFinal;
    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

    public JLabel getTexto() {
        return texto;
    }

    public void setTexto(JLabel texto) {
        this.texto = texto;
    }

    public JLabel getFundoFinal_3() {
        return fundoFinal_3;
    }

    public void setFundoFinal_3(JLabel fundoFinal_3) {
        this.fundoFinal_3 = fundoFinal_3;
    }

    public JLabel getBalao() {
        return balao;
    }

    public void setBalao(JLabel balao) {
        this.balao = balao;
    }

    public JLabel getNossoGif() {
        return nossoGif;
    }

    public void setNossoGif(JLabel nossoGif) {
        this.nossoGif = nossoGif;
    }

    public JPanel getPainel() {
        return painel;
    }

    public void setPainel(JPanel painel) {
        this.painel = painel;
    }
}
