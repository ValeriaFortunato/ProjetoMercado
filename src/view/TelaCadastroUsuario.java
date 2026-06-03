package view;

import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroUsuario extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField tfNome;
    private JTextField tfCpf;
    private JButton btnCadastrar;
    private JRadioButton rbSim;
    private JRadioButton rbNao;
    private JButton btnVoltar;

    public TelaCadastroUsuario() {
        Color corFundo = new Color(30, 41, 59);       
        Color corInputBg = new Color(255, 255, 255);
        Color corBotaoPrincipal = new Color(37, 99, 235); 
        Color corBotaoSecundario = new Color(71, 85, 105); 
        Color corTextoMuted = new Color(148, 163, 184);
        
        setBackground(corFundo);
        
        setLayout(new MigLayout("fill, insets 50 40 50 40, gapy 12", "[grow][right][280px:280px, grow][grow]", "[grow][][][][][][grow]"));

        JLabel label_1 = new JLabel("Criar Nova Conta");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("Segoe UI", Font.BOLD, 26));
        add(label_1, "cell 1 1 2 1, alignx center, gapbottom 25");
        
        JLabel label = new JLabel("Nome");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        add(label, "cell 1 2, gapright 10");
        
        tfNome = new JTextField();
        tfNome.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tfNome.setBackground(corInputBg);
        tfNome.setBorder(new LineBorder(new Color(203, 213, 225), 1));
        tfNome.setBorder(javax.swing.BorderFactory.createCompoundBorder(tfNome.getBorder(), new EmptyBorder(0, 8, 0, 8)));
        add(tfNome, "cell 2 2, growx, height 36!, gapbottom 6");
        
        JLabel label_3 = new JLabel("CPF");
        label_3.setForeground(Color.WHITE);
        label_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        add(label_3, "cell 1 3, gapright 10");
        
        tfCpf = new JTextField();
        tfCpf.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tfCpf.setBackground(corInputBg);
        tfCpf.setBorder(new LineBorder(new Color(203, 213, 225), 1));
        tfCpf.setBorder(javax.swing.BorderFactory.createCompoundBorder(tfCpf.getBorder(), new EmptyBorder(0, 8, 0, 8)));
        add(tfCpf, "cell 2 3, growx, height 36!, gapbottom 6");

        rbSim = new JRadioButton("Sim");
        rbSim.setBackground(corFundo);
        rbSim.setForeground(Color.WHITE);
        rbSim.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        rbSim.setFocusPainted(false);
        
        rbNao = new JRadioButton("Não");
        rbNao.setBackground(corFundo);
        rbNao.setForeground(Color.WHITE);
        rbNao.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        rbNao.setFocusPainted(false);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbSim);
        grupo.add(rbNao);
        
        JLabel label_2 = new JLabel("Administrador");
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        add(label_2, "cell 1 4, gapright 10");

        add(rbSim, "cell 2 4, split 2");
        add(rbNao, "gapleft 20");
        
        btnVoltar = new JButton("Voltar");
        btnVoltar.setBackground(corBotaoSecundario);
        btnVoltar.setForeground(Color.WHITE);
        btnVoltar.setFocusPainted(false);
        btnVoltar.setBorder(new EmptyBorder(5, 15, 5, 15));
        btnVoltar.setFont(new Font("Segoe UI", Font.BOLD, 14));
        add(btnVoltar, "cell 2 5, split 2, growx, height 38!, gaptop 20, gapright 8");

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBackground(corBotaoPrincipal);
        btnCadastrar.setForeground(Color.WHITE);
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.setBorder(new EmptyBorder(5, 15, 5, 15));
        btnCadastrar.setFont(new Font("Segoe UI", Font.BOLD, 14));
        add(btnCadastrar, "growx, height 38!, gaptop 20");
    }

    public boolean isCpfValido() {
        String cpf = tfCpf.getText().trim();
        if (!cpf.matches("\\d{11}")) {
            JOptionPane.showMessageDialog(this, "O CPF deve conter exatamente 11 números e nenhuma letra!", "Falha no Cadastro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public JTextField getTfNome() { return tfNome; }
    public JTextField getTfCpf() { return tfCpf; }
    public JButton getbtnCadastrar() { return btnCadastrar; }
    public JRadioButton getRbSim() { return rbSim; }
    public JRadioButton getRbNao() { return rbNao; }
    public JButton getbtnVoltar() { return btnVoltar; }
}