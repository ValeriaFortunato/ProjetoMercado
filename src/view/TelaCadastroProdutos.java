package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;

public class TelaCadastroProdutos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField tfProduto;
	private JTextField tfPreco;
	private JTextField tfQuantidade;
	private JButton btAdicionar;
	private JButton btRemover;
	private JButton btEditar;
	private JScrollPane scrollPane;
	private JButton btVoltar;

	public TelaCadastroProdutos() {
		Color corFundo = new Color(30, 41, 59);       
		Color corInputBg = new Color(255, 255, 255);
		Color corPrincipal = new Color(37, 99, 235);  
		Color corSecundaria = new Color(71, 85, 105); 
		Color corPerigo = new Color(239, 68, 68);     
		
		setBackground(corFundo);
		setLayout(new MigLayout("fill, insets 25 30 25 30, hidemode 3", "[grow][right][320px:380px, grow][grow]", "[grow][120px:300px, grow][][][][][][grow]"));
		
		JLabel lblNewLabel = new JLabel("Gerenciamento de Produtos");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
		add(lblNewLabel, "cell 1 0 2 1, alignx center, gapbottom 10");
		
		table = new JTable();
		table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table.setRowHeight(28);
		table.setBackground(Color.WHITE);
		table.setGridColor(new Color(226, 232, 240));
		table.setSelectionBackground(new Color(37, 99, 235));
		table.setSelectionForeground(Color.WHITE);
		table.setShowVerticalLines(false);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"ID", "Produto", "Valor", "Quantidade"
			}
		));
		
		JTableHeader header = table.getTableHeader();
		header.setFont(new Font("Segoe UI", Font.BOLD, 14));
		header.setBackground(new Color(241, 245, 249));
		header.setForeground(new Color(15, 23, 42));
		header.setBorder(new LineBorder(new Color(226, 232, 240), 1));
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBorder(new LineBorder(new Color(71, 85, 105), 1));
		add(scrollPane, "cell 1 1 2 1, grow, gapbottom 12");
		
		JLabel lblNewLabel_1 = new JLabel("Produto");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		add(lblNewLabel_1, "cell 1 3, gapright 8");
		
		tfProduto = new JTextField();
		tfProduto.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		tfProduto.setBackground(corInputBg);
		tfProduto.setBorder(new LineBorder(new Color(203, 213, 225), 1));
		tfProduto.setBorder(javax.swing.BorderFactory.createCompoundBorder(tfProduto.getBorder(), new EmptyBorder(0, 8, 0, 8)));
		add(tfProduto, "cell 2 3, growx, height 34!, gapbottom 6");
		
		JLabel lblNewLabel_2 = new JLabel("Preço (un/kg)");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		add(lblNewLabel_2, "cell 1 4, gapright 8");
		
		tfPreco = new JTextField();
		tfPreco.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		tfPreco.setBackground(corInputBg);
		tfPreco.setBorder(new LineBorder(new Color(203, 213, 225), 1));
		tfPreco.setBorder(javax.swing.BorderFactory.createCompoundBorder(tfPreco.getBorder(), new EmptyBorder(0, 8, 0, 8)));
		add(tfPreco, "cell 2 4, growx, height 34!, gapbottom 6");
		
		JLabel lblNewLabel_3 = new JLabel("Quantidade");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		add(lblNewLabel_3, "cell 1 5, gapright 8");
		
		tfQuantidade = new JTextField();
		tfQuantidade.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		tfQuantidade.setBackground(corInputBg);
		tfQuantidade.setBorder(new LineBorder(new Color(203, 213, 225), 1));
		tfQuantidade.setBorder(javax.swing.BorderFactory.createCompoundBorder(tfQuantidade.getBorder(), new EmptyBorder(0, 8, 0, 8)));
		add(tfQuantidade, "cell 2 5, growx, height 34!, gapbottom 12");
		
		btAdicionar = new JButton("Adicionar");
		btAdicionar.setBackground(corPrincipal);
		btAdicionar.setForeground(Color.WHITE);
		btAdicionar.setFocusPainted(false);
		btAdicionar.setBorder(new EmptyBorder(5, 15, 5, 15));
		btAdicionar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		add(btAdicionar, "cell 2 6, split 3, growx, height 36!, gapright 6");
		
		btEditar = new JButton("Editar");
		btEditar.setBackground(corSecundaria);
		btEditar.setForeground(Color.WHITE);
		btEditar.setFocusPainted(false);
		btEditar.setBorder(new EmptyBorder(5, 15, 5, 15));
		btEditar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		add(btEditar, "growx, height 36!, gapright 6");
		
		btRemover = new JButton("Remover");
		btRemover.setBackground(corFundo);
		btRemover.setForeground(corPerigo);
		btRemover.setFocusPainted(false);
		btRemover.setBorder(new LineBorder(corPerigo, 1));
		btRemover.setFont(new Font("Segoe UI", Font.BOLD, 14));
		add(btRemover, "growx, height 36!");
		
		btVoltar = new JButton("Voltar");
		btVoltar.setBackground(corSecundaria);
		btVoltar.setForeground(new Color(203, 213, 225));
		btVoltar.setFocusPainted(false);
		btVoltar.setBorder(new EmptyBorder(5, 15, 5, 15));
		btVoltar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		add(btVoltar, "cell 1 7 2 1, alignx center, gaptop 15, width 120!, height 36!");
	}

	public JTextField getTfProduto() { return tfProduto; }
	public JTextField getTfPreco() { return tfPreco; }
	public JTextField getTfQuantidade() { return tfQuantidade; }
	public JButton getbtAdicionar() { return btAdicionar; }
	public JButton getbtRemover() { return btRemover; }
	public JButton getbtEditar() { return btEditar; }
	public JTable gettable() { return table; }
	public JScrollPane getscrollPane() { return scrollPane; }
	public JButton getbtVoltar() { return btVoltar; }
}