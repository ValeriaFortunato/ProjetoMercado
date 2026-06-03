package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.miginfocom.swing.MigLayout;
import java.awt.*;
import javax.swing.border.*;

public class TelaProdutos extends JPanel {

    private JTable table;
    private JTextField tfQuantidade;
    private JButton btAdicionar, btCarrinho, btVoltar;

    public TelaProdutos() {
        Color corFundo = new Color(30, 41, 59);       
        Color corInputBg = new Color(255, 255, 255);
        Color corTextoMuted = new Color(148, 163, 184);   
        
        setBackground(corFundo);
        
        setLayout(new MigLayout("fill, insets 40", "[grow, fill][260px!]", "[][grow]"));

        JLabel lblTitulo = new JLabel("Catálogo de Produtos");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 32));
        add(lblTitulo, "cell 0 0 2 1, alignx center, gapbottom 30");

        table = new JTable(new DefaultTableModel(
            new Object[][] {{null, null, null, null}},
            new String[] {"ID", "Produtos", "Valor", "Quantidade"}
        ));
        
        table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        table.setRowHeight(30);
        table.setBackground(Color.WHITE);
        table.setGridColor(new Color(226, 232, 240));
        table.setSelectionBackground(new Color(37, 99, 235));
        table.setSelectionForeground(Color.WHITE);
        table.setShowVerticalLines(false);
        
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 14));
        header.setBackground(new Color(241, 245, 249));
        header.setForeground(new Color(15, 23, 42));
        header.setBorder(new LineBorder(new Color(226, 232, 240), 1));

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(new LineBorder(new Color(71, 85, 105), 1));
        add(scrollPane, "cell 0 1, grow");

        JPanel pnlLateral = new JPanel(new MigLayout("fillx, insets 0 25 0 0", "[grow]", "[][][][][grow]"));
        pnlLateral.setOpaque(false);

        JLabel lblQtd = new JLabel("Quantidade");
        lblQtd.setForeground(Color.WHITE);
        lblQtd.setFont(new Font("Segoe UI", Font.BOLD, 14));
        pnlLateral.add(lblQtd, "wrap 5");

        tfQuantidade = new JTextField();
        tfQuantidade.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tfQuantidade.setBackground(corInputBg);
        tfQuantidade.setBorder(new LineBorder(new Color(203, 213, 225), 1));
        tfQuantidade.setBorder(javax.swing.BorderFactory.createCompoundBorder(tfQuantidade.getBorder(), new EmptyBorder(0, 10, 0, 10)));
        pnlLateral.add(tfQuantidade, "growx, height 38!, wrap 20");

        btAdicionar = criarBotao("Adicionar ao Carrinho", new Color(37, 99, 235), Color.WHITE);
        pnlLateral.add(btAdicionar, "growx, height 42!, wrap 12");

        btCarrinho = criarBotao("Ver Carrinho", new Color(71, 85, 105), Color.WHITE);
        pnlLateral.add(btCarrinho, "growx, height 42!, wrap 12");

        btVoltar = criarBotao("Voltar", new Color(51, 65, 85), new Color(203, 213, 225));
        pnlLateral.add(btVoltar, "growx, height 42!");

        add(pnlLateral, "cell 1 1, aligny top");
    }

    private JButton criarBotao(String texto, Color corFundoBtn, Color corTextoBtn) {
        JButton btn = new JButton(texto);
        btn.setBackground(corFundoBtn);
        btn.setForeground(corTextoBtn);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btn.setFocusPainted(false);
        btn.setBorder(new EmptyBorder(5, 5, 5, 5));
        return btn;
    }

    public JTable gettable() { return table; }
    public JButton getbtAdicionar() { return btAdicionar; }
    public JButton getbtCarrinho() { return btCarrinho; }
    public JButton getbtVoltar() { return btVoltar; }
    public JTextField gettfQuantidade() { return tfQuantidade; }
}