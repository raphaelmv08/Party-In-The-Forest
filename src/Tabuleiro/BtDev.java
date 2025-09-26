package Tabuleiro;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BtDev extends JFrame{
	    public BtDev() {
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


	    }
	}

