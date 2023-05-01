package projeto;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaSobre extends JFrame implements MouseListener,ActionListener{
private JLabel ajuda,textoAjuda, textoAjuda2, imgKaline, imgEvelin;
private JButton voltar;

    public TelaSobre() {
        Inicializar();
    }
    
    public void Inicializar() {
        
        setVisible(true);
        setSize(1600, 900);
        setTitle("Sobre");
        setLayout(null);
        setTitle("Tela sobre");
        
        ajuda = new JLabel("QUER AJUDA PARA JOGAR? Passe AQUI! ");
        ajuda.setBounds(1300,0,300,200);
        ajuda.addMouseListener(this);
        ajuda.setForeground(Color.white);
        add (ajuda);
        
        textoAjuda = new JLabel(new ImageIcon("img/intrucoes.png"));
        textoAjuda.setBounds(1200, 200,textoAjuda.getIcon().getIconWidth(),
        textoAjuda.getIcon().getIconHeight());
        textoAjuda.setVisible(false);
        add (textoAjuda);
        
        imgEvelin = new JLabel(new ImageIcon("img/imgEv.jpg"));
        imgEvelin.setBounds(1100, 500,imgEvelin.getIcon().getIconWidth(),
        imgEvelin.getIcon().getIconHeight());
        add (imgEvelin);
        
        imgKaline = new JLabel(new ImageIcon("img/kalineFoto.jpg"));
        imgKaline.setBounds(90, 500,imgKaline.getIcon().getIconWidth(),
        imgKaline.getIcon().getIconHeight());
        add (imgKaline);
        
        textoAjuda2 = new JLabel(new ImageIcon("img/teclaT.jpg"));
        textoAjuda2.setBounds(1000, 300,textoAjuda2.getIcon().getIconWidth(),
        textoAjuda2.getIcon().getIconHeight());
        textoAjuda2.setVisible(false);
        add (textoAjuda2);
        
        voltar = new JButton("Voltar");
        voltar.setBounds(10, 10, 100, 20);
        add(voltar);
        
        JLabel texto = new JLabel(new ImageIcon("img/sobreImg.jpg"));
        texto.setSize(1600, 900);
        texto.setLocation(0, 0);
        add(texto); 
        
        voltar.addActionListener(this);
        
    }
    
    	public void actionPerformed(ActionEvent e){
		dispose();
                   
        }
    public void mouseClicked(MouseEvent e) {
        
    }

    public void mousePressed(MouseEvent e) {
        
    }

    
    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
        textoAjuda.setVisible(true);
        textoAjuda2.setVisible(true);
    }

    public void mouseExited(MouseEvent e) {
        textoAjuda.setVisible(false);
        textoAjuda2.setVisible(false);
    }
}
