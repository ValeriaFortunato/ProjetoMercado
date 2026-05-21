package view;

import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class TelaCadastroUsuario extends JPanel {

    private JTextField tfNome;
    private JTextField tfCpf;
    private JButton btnCadastrar;
    private JRadioButton rbSim;
    private JRadioButton rbNao;
    private JButton btnVoltar;

    public TelaCadastroUsuario() {
        Color corFundo = new Color(255, 106, 106);
        setBackground(corFundo);
        
        setLayout(new MigLayout("fill, insets 30, gapy 10", "[grow][right][250px:250px, grow][grow]", "[grow][][][][][][grow]"));

        JLabel label_1 = new JLabel("Cadastre - se já");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("Tahoma", Font.BOLD, 26));
        add(label_1, "cell 1 1 2 1, alignx center, gapbottom 20");
        
        JLabel label = new JLabel("Nome:");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(label, "cell 1 2");
        
        tfNome = new JTextField();
        tfNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(tfNome, "cell 2 2, growx, height 28!");
        
        JLabel label_3 = new JLabel("CPF:");
        label_3.setForeground(Color.WHITE);
        label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(label_3, "cell 1 3");
        
        tfCpf = new JTextField();
        tfCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(tfCpf, "cell 2 3, growx, height 28!");

        rbSim = new JRadioButton("Sim");
        rbSim.setBackground(corFundo);
        rbSim.setForeground(Color.WHITE);
        rbSim.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        rbNao = new JRadioButton("Não");
        rbNao.setBackground(corFundo);
        rbNao.setForeground(Color.WHITE);
        rbNao.setFont(new Font("Tahoma", Font.BOLD, 12));

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbSim);
        grupo.add(rbNao);
        
        JLabel label_2 = new JLabel("Admin?");
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(label_2, "cell 1 4");

        add(rbSim, "cell 2 4, split 2");
        add(rbNao, "gapleft 30");
        
        btnVoltar = new JButton("Voltar");
        btnVoltar.setBackground(Color.WHITE);
        btnVoltar.setForeground(corFundo);
        btnVoltar.setFocusPainted(false);
        btnVoltar.setBorder(new EmptyBorder(5, 15, 5, 15));
        btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(btnVoltar, "cell 2 5, split 2, growx, height 35!, gaptop 15");

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBackground(Color.WHITE);
        btnCadastrar.setForeground(corFundo);
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.setBorder(new EmptyBorder(5, 15, 5, 15));
        btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(btnCadastrar, "growx, height 35!, gaptop 15, gapleft 10");
    }

    public JTextField getTfNome() { return tfNome; }
    public JTextField getTfCpf() { return tfCpf; }
    public JButton getbtnCadastrar() { return btnCadastrar; }
    public JRadioButton getRbSim() { return rbSim; }
    public JRadioButton getRbNao() { return rbNao; }
    public JButton getbtnVoltar() { return btnVoltar; }
}