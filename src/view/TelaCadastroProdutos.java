package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
		Color corFundo = new Color(255, 106, 106);
		setBackground(corFundo);
		setLayout(new MigLayout("fill, insets 30", "[grow][right][350px:350px, grow][grow]", "[grow][][grow][][][][][grow]"));
		
		JLabel lblNewLabel = new JLabel("Cadastre os produtos");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
		add(lblNewLabel, "cell 1 0 2 1, alignx center, gapbottom 10");
		
		table = new JTable();
		table.setRowHeight(25);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"ID", "Produto", "Valor", "Quantidade"
			}
		));
		scrollPane = new JScrollPane(table);
		scrollPane.setBorder(new LineBorder(Color.WHITE, 1));
		add(scrollPane, "cell 1 1 2 1, grow, gapbottom 15");
		
		JLabel lblNewLabel_1 = new JLabel("Produto:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		add(lblNewLabel_1, "cell 1 3");
		
		tfProduto = new JTextField();
		tfProduto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfProduto, "cell 2 3, growx, height 25!");
		
		JLabel lblNewLabel_2 = new JLabel("Preço kg/uni:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		add(lblNewLabel_2, "cell 1 4");
		
		tfPreco = new JTextField();
		tfPreco.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfPreco, "cell 2 4, growx, height 25!");
		
		JLabel lblNewLabel_3 = new JLabel("Quantidade:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		add(lblNewLabel_3, "cell 1 5");
		
		tfQuantidade = new JTextField();
		tfQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(tfQuantidade, "cell 2 5, growx, height 25!");
		
		btAdicionar = new JButton("Adicionar");
		btAdicionar.setBackground(Color.WHITE);
		btAdicionar.setForeground(corFundo);
		btAdicionar.setFocusPainted(false);
		btAdicionar.setBorder(new EmptyBorder(5, 15, 5, 15));
		btAdicionar.setFont(new Font("Times New Roman", Font.BOLD, 13));
		add(btAdicionar, "cell 2 6, split 3, growx, height 35!, gaptop 10");
		
		btEditar = new JButton("Editar");
		btEditar.setBackground(Color.WHITE);
		btEditar.setForeground(corFundo);
		btEditar.setFocusPainted(false);
		btEditar.setBorder(new EmptyBorder(5, 15, 5, 15));
		btEditar.setFont(new Font("Times New Roman", Font.BOLD, 13));
		add(btEditar, "growx, height 35!, gaptop 10");
		
		btRemover = new JButton("Remover");
		btRemover.setBackground(Color.WHITE);
		btRemover.setForeground(corFundo);
		btRemover.setFocusPainted(false);
		btRemover.setBorder(new EmptyBorder(5, 15, 5, 15));
		btRemover.setFont(new Font("Times New Roman", Font.BOLD, 13));
		add(btRemover, "growx, height 35!, gaptop 10");
		
		btVoltar = new JButton("Voltar");
		btVoltar.setBackground(Color.WHITE);
		btVoltar.setForeground(corFundo);
		btVoltar.setFocusPainted(false);
		btVoltar.setBorder(new EmptyBorder(5, 15, 5, 15));
		btVoltar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		add(btVoltar, "cell 1 7 2 1, alignx center, gaptop 20, width 100!");
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