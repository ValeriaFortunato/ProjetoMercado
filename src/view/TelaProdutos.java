package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;
import java.awt.*;
import javax.swing.border.*;

public class TelaProdutos extends JPanel {

    private JTable table;
    private JTextField tfQuantidade;
    private JButton btAdicionar, btCarrinho, btVoltar;

    public TelaProdutos() {
        Color corFundo = new Color(255, 106, 106);
        setBackground(corFundo);
        
        setLayout(new MigLayout("fill, insets 30", "[grow, fill][200px!]", "[][grow]"));

        JLabel lblTitulo = new JLabel("Hora de comprar!!!");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 40));
        add(lblTitulo, "cell 0 0 2 1, alignx center, gapbottom 20");

        table = new JTable(new DefaultTableModel(
            new Object[][] {{null, null, null, null}},
            new String[] {"ID", "Produtos", "Valor", "Quantidade"}
        ));
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, "cell 0 1, grow");

        JPanel pnlLateral = new JPanel(new MigLayout("fillx, insets 0 20 0 0", "[grow]", "[][][][][grow]"));
        pnlLateral.setOpaque(false);

        JLabel lblQtd = new JLabel("Quantidade:");
        lblQtd.setForeground(Color.WHITE);
        lblQtd.setFont(new Font("Tahoma", Font.BOLD, 12));
        pnlLateral.add(lblQtd, "wrap");

        tfQuantidade = new JTextField();
        pnlLateral.add(tfQuantidade, "growx, height 30!, wrap 15");

        btAdicionar = criarBotao("Adicionar ao carrinho", corFundo);
        pnlLateral.add(btAdicionar, "growx, height 40!, wrap 10");

        btCarrinho = criarBotao("Ver carrinho", corFundo);
        pnlLateral.add(btCarrinho, "growx, height 40!, wrap 10");

        btVoltar = criarBotao("Voltar", corFundo);
        pnlLateral.add(btVoltar, "growx, height 40!");

        add(pnlLateral, "cell 1 1, aligny top");
    }

    private JButton criarBotao(String texto, Color corTexto) {
        JButton btn = new JButton(texto);
        btn.setBackground(Color.WHITE);
        btn.setForeground(corTexto);
        btn.setFont(new Font("Tahoma", Font.BOLD, 12));
        btn.setFocusPainted(false);
        btn.setBorder(new EmptyBorder(5,5,5,5));
        return btn;
    }

    public JTable gettable() { return table; }
    public JButton getbtAdicionar() { return btAdicionar; }
    public JButton getbtCarrinho() { return btCarrinho; }
    public JButton getbtVoltar() { return btVoltar; }
    public JTextField gettfQuantidade() { return tfQuantidade; }
}