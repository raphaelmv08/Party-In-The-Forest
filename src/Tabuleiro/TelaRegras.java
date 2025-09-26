package Tabuleiro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaRegras extends JFrame {

    public TelaRegras() {
        setTitle("Batalha na Selva - Regras");
        setSize(1300, 880);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setExtendedState(MAXIMIZED_BOTH);
               
        
        // Carregar imagem de fundo
        BufferedImage fundoImg = null;
        try {
            URL fundoUrl = getClass().getResource("/img/fundoMenu.png"); 
            if (fundoUrl != null) {
                fundoImg = ImageIO.read(fundoUrl);
            } else {
                System.err.println("Recurso /img/fundo_regras.png não encontrado!");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        BufferedImage finalFundo = fundoImg;
        JPanel painel = new JPanel(null) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (finalFundo != null) {
                    g.drawImage(finalFundo, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        add(painel);
        
        //logo
        JLabel logo = new JLabel ();
        try {
            URL iconUrl = getClass().getResource("/img/fundoLogo.png"); 
            if (iconUrl != null) {
                BufferedImage raw = ImageIO.read(iconUrl);
                Image scaled = raw.getScaledInstance(700, 500, Image.SCALE_SMOOTH);
                logo.setIcon(new ImageIcon(scaled));
            } else {
                System.err.println("Recurso /img/2.png não encontrado!");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        logo.setBounds(330, -100, 700, 500);
        painel.add(logo);

        
        
     // Ícone Play (Final)
        JButton btPlay = new JButton();
        try {
            URL iconUrl = getClass().getResource("/img/btPlay.png"); 
            if (iconUrl != null) {
                BufferedImage raw = ImageIO.read(iconUrl);
                Image scaled = raw.getScaledInstance(320, 220, Image.SCALE_SMOOTH);
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
        btPlay.setBounds(450, 190, 300, 200);
        painel.add(btPlay);
        
        btPlay.addActionListener(e -> {
            dispose();
            JOptionPane.showMessageDialog(null, "Aqui vai começar o jogo!");
        });

        setVisible(true);
        

     // Ícone Devs (Final)
        JButton btOpc = new JButton();
        try {
            URL iconUrl = getClass().getResource("/img/btOpc.png"); 
            if (iconUrl != null) {
                BufferedImage raw = ImageIO.read(iconUrl);
                Image scaled = raw.getScaledInstance(320, 220, Image.SCALE_SMOOTH);
                btOpc.setIcon(new ImageIcon(scaled));
            } else {
                System.err.println("Recurso /img/2.png não encontrado!");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        btOpc.setBorderPainted(false);
        btOpc.setContentAreaFilled(false);
        btOpc.setFocusPainted(false);
        btOpc.setOpaque(false);
        btOpc.setBounds(450, 340, 300, 200);
        painel.add(btOpc);
        
        btOpc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new BtDev(); // vai para a tela de regras
            }
        });
        setVisible(true);
        
        
     // Ícone Devs (Final)
        JButton btDev = new JButton();
        try {
            URL iconUrl = getClass().getResource("/img/btDev.png"); 
            if (iconUrl != null) {
                BufferedImage raw = ImageIO.read(iconUrl);
                Image scaled = raw.getScaledInstance(320, 220, Image.SCALE_SMOOTH);
                btDev.setIcon(new ImageIcon(scaled));
            } else {
                System.err.println("Recurso /img/2.png não encontrado!");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        btDev.setBorderPainted(false);
        btDev.setContentAreaFilled(false);
        btDev.setFocusPainted(false);
        btDev.setOpaque(false);
        btDev.setBounds(450, 480, 300, 200);
        painel.add(btDev);
        
        btDev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new BtRegras(); // vai para a tela de regras
            }
        });
        setVisible(true);
        
    }
}


