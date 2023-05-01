package projeto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TelaInicial extends JFrame implements ActionListener {

    private JButton botaoInicial, botaoSair, botaoSobre;

    public void inicializar() {

        setVisible(true);
        setSize(1600, 900);
        setTitle("Uma Jornada pelo Espaço");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Musica musica = new Musica();
        musica.playSound("som/musicaJornada.wav");

        botaoInicial = new JButton("");
        botaoInicial.setSize(564, 278);
        botaoInicial.setLocation(800, 100);

        botaoSobre = new JButton("");
        botaoSobre.setSize(380, 166);
        botaoSobre.setLocation(800, 430);

        botaoSair = new JButton("");
        botaoSair.setSize(300, 160);
        botaoSair.setLocation(800, 650);

        JLabel imagemIniciar = new JLabel(new ImageIcon("img/INICIAR.png"));
        imagemIniciar.setSize(564, 278);
        imagemIniciar.setLocation(800, 100);
        add(imagemIniciar);

        JLabel imagemSobre = new JLabel(new ImageIcon("img/SOBRE.png"));
        imagemSobre.setSize(380, 166);
        imagemSobre.setLocation(800, 430);
        add(imagemSobre);

        JLabel imagemSair = new JLabel(new ImageIcon("img/SAIR.png"));
        imagemSair.setSize(300, 160);
        imagemSair.setLocation(800, 650);
        add(imagemSair);

        add(botaoInicial);
        add(botaoSair);
        add(botaoSobre);

        JLabel imagem = new JLabel(new ImageIcon("img/a.gif"));
        imagem.setSize(400, 400);
        imagem.setLocation(200, 200);
        add(imagem);

        JLabel imagemPreta = new JLabel(new ImageIcon("img/fundoPreto.gif"));
        imagemPreta.setSize(1600, 900);
        imagemPreta.setLocation(0, 0);
        add(imagemPreta);

        botaoSair.addActionListener(this);
        botaoInicial.addActionListener(this);
        botaoSobre.addActionListener(this);
        repaint();
    }
     //   (new Thread() {
    //        public void run() {
       //         AudioClip som;
    //    try {
   //         som = Applet.newAudioClip(new File("src/projeto/som.wav").toURL());
    //         som.loop();
    //    } catch (MalformedURLException ex) {
   //         Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
   //     }
  //          }
   //     }).start();
  //  }
   
    public TelaInicial() {
        inicializar();
    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == botaoSair) {
            System.exit(0);
        } else if (e.getSource() == botaoInicial) {
            new Nivel1();
        } else if (e.getSource() == botaoSobre) {
            new TelaSobre();
        }
    }

}
