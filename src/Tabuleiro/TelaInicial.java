package Tabuleiro;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class TelaInicial extends JFrame {

    public TelaInicial() {
        setTitle("Batalha na Selva");
        setSize(1300, 880);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setExtendedState(MAXIMIZED_BOTH);

        // Painel principal com fundo
        JPanel painel = new JPanel(null) {
            private Image fundo = new ImageIcon(
                getClass().getResource("/img/3.png")
            ).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(fundo, 0, 0, getWidth(), getHeight(), this);
            }
        };
        add(painel);

        // Ícone Play (mais para baixo agora)
        JButton btPlay = new JButton();
        try {
            URL iconUrl = getClass().getResource("/img/btPlay.png"); 
            if (iconUrl != null) {
                BufferedImage raw = ImageIO.read(iconUrl);
                Image scaled = raw.getScaledInstance(270, 200, Image.SCALE_SMOOTH);
                btPlay.setIcon(new ImageIcon(scaled));
            } else {
                System.err.println("Recurso /img/2.png não encontrado!");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        btPlay.setBorderPainted(false);
        btPlay.setContentAreaFilled(false);
        btPlay.setFocusPainted(false);
        btPlay.setOpaque(false);
        btPlay.setBounds(560, 390, 380, 320);
        painel.add(btPlay);
        
        // ação do botão Play
        btPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TelaRegras(); // vai para a tela de regras
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaInicial();
    }
}
