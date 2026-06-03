package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class TelaCarrinhoCompra extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btRemover;
	private JButton btNota;
	private JButton btPagar;
	private JButton btVoltar;
	private JLabel total;

	public TelaCarrinhoCompra() {
		Color corFundo = new Color(30, 41, 59);       
		Color corPrincipal = new Color(37, 99, 235);  
		Color corSecundaria = new Color(71, 85, 105); 
		Color corPerigo = new Color(239, 68, 68);     
		Color corTextoMuted = new Color(148, 163, 184);
		
		setBackground(corFundo);
		
		setLayout(new MigLayout("fill, insets 12 20 12 20", "[grow][300px:550px,grow][15px:25px][220px:320px,grow][grow]", "[grow][][][80px:220px,grow][][][][][][][grow]"));
		
		JLabel lblNewLabel = new JLabel("Seu Carrinho");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 28)); 
		add(lblNewLabel, "cell 1 1 3 1, alignx center, gapbottom 10");
		
		table = new JTable();
		table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table.setRowHeight(32);
		table.setBackground(Color.WHITE);
		table.setGridColor(new Color(226, 232, 240));
		table.setSelectionBackground(new Color(37, 99, 235));
		table.setSelectionForeground(Color.WHITE);
		table.setShowVerticalLines(false);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Produto", "Preço", "Quantidade"
			}
		));
		
		JTableHeader header = table.getTableHeader();
		header.setFont(new Font("Segoe UI", Font.BOLD, 14));
		header.setBackground(new Color(241, 245, 249));
		header.setForeground(new Color(15, 23, 42));
		header.setBorder(new LineBorder(new Color(226, 232, 240), 1));
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBorder(new LineBorder(new Color(71, 85, 105), 1));
		add(scrollPane, "cell 1 3 1 7, grow");
		
		JLabel lblNewLabel_1 = new JLabel("Total do pedido:");
		lblNewLabel_1.setForeground(corTextoMuted);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		add(lblNewLabel_1, "cell 3 3, alignx left, gapbottom 3");
		
		total = new JLabel("R$ 0,00");
		total.setForeground(Color.WHITE);
		total.setFont(new Font("Segoe UI", Font.BOLD, 26));
		add(total, "cell 3 4, alignx left, gapbottom 10");
		
		btPagar = new JButton("Finalizar Pagamento");
		btPagar.setBackground(corPrincipal);
		btPagar.setForeground(Color.WHITE);
		btPagar.setFocusPainted(false);
		btPagar.setBorder(new EmptyBorder(5, 15, 5, 15));
		btPagar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		add(btPagar, "cell 3 5, growx, height 36!, gapbottom 6"); 
		
		btNota = new JButton("Emitir Nota Fiscal e Pagar");
		btNota.setBackground(corSecundaria);
		btNota.setForeground(Color.WHITE);
		btNota.setFocusPainted(false);
		btNota.setBorder(new EmptyBorder(5, 15, 5, 15));
		btNota.setFont(new Font("Segoe UI", Font.BOLD, 14));
		add(btNota, "cell 3 6, growx, height 36!, gapbottom 6"); 
		
		btRemover = new JButton("Remover do Carrinho");
		btRemover.setBackground(corFundo);
		btRemover.setForeground(corPerigo);
		btRemover.setFocusPainted(false);
		btRemover.setBorder(new LineBorder(corPerigo, 1));
		btRemover.setFont(new Font("Segoe UI", Font.BOLD, 14));
		add(btRemover, "cell 3 7, growx, height 36!, gapbottom 12"); 
		
		btVoltar = new JButton("Voltar ao Catálogo");
		btVoltar.setBackground(corSecundaria);
		btVoltar.setForeground(new Color(203, 213, 225));
		btVoltar.setFocusPainted(false);
		btVoltar.setBorder(new EmptyBorder(5, 15, 5, 15));
		btVoltar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		add(btVoltar, "cell 3 8, growx, height 36!"); 
	}
	
	public JScrollPane getscrollPane() {return scrollPane; }
	public JTable gettable() { return table; }
	public JButton getbtRemover() { return btRemover; }
	public JButton getbtNota() { return btNota; }
	public JButton getbtPagar() { return btPagar; }
	public JButton getbtVoltar() { return btVoltar; }
	public JLabel gettotal() { return total; }
}