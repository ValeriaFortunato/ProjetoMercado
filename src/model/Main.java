package model;

import javax.swing.SwingUtilities;

import controller.LoginController;
import controller.Navegador;
import view.Janelas;
import view.TelaLogin;

public class Main {

	    public static void main(String[] args) {

	        SwingUtilities.invokeLater(() -> {

	            Janelas frame = new Janelas();

	            
	            Navegador.setFrame(frame);

	            TelaLogin telaLogin = new TelaLogin();
	            new LoginController(telaLogin, frame);

	            Navegador.trocarTela(telaLogin);

	            frame.setVisible(true);
	        });
	    }
	}
