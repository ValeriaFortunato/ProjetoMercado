package controller;

import javax.swing.JPanel;

import view.Janelas;

public class Navegador {

    private static Janelas frame;

    public static void setFrame(Janelas framePrincipal) {
        frame = framePrincipal;
    }

    public static void trocarTela(JPanel novaTela) {
        frame.setContentPane(novaTela);
        frame.revalidate();
        frame.repaint();
    }
}