package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class TelaLogin extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField tfNome;
    private JTextField tfCpf;
    private JButton btEntrar;
    private JButton btCadastrar;
    private JLabel lblNewLabel;

    public TelaLogin() {
        Color corFundo = new Color(255, 106, 106);
        setBackground(corFundo);
        setToolTipText("Tela Login");

        setLayout(new MigLayout("fill, insets 40", "[grow][right][250px:250px, grow][grow]", "[grow][][][][][][grow]"));
        
        lblNewLabel = new JLabel("Bem-vindo! Acesse sua conta");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
        add(lblNewLabel, "cell 1 1 2 1, alignx center, gapbottom 20");

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setForeground(Color.WHITE);
        lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        add(lblNome, "cell 1 2");

        tfNome = new JTextField();
        tfNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(tfNome, "cell 2 2, growx, height 28!");

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setForeground(Color.WHITE);
        lblCpf.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        add(lblCpf, "cell 1 3");

        tfCpf = new JTextField();
        tfCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        AbstractDocument doc = (AbstractDocument) tfCpf.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String stringAtual = fb.getDocument().getText(0, fb.getDocument().getLength());
                String proximaString = stringAtual.substring(0, offset) + text + stringAtual.substring(offset + length);

                if (text.matches("\\d*") && proximaString.length() <= 11) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        add(tfCpf, "cell 2 3, growx, height 28!");

        btEntrar = new JButton("Entrar");
        btEntrar.setBackground(Color.WHITE);
        btEntrar.setForeground(corFundo);
        btEntrar.setFocusPainted(false); 
        btEntrar.setBorder(new EmptyBorder(5, 15, 5, 15));
        btEntrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
        add(btEntrar, "cell 2 4, split 2, growx, height 35!, gaptop 10");

        btCadastrar = new JButton("Cadastrar");
        btCadastrar.setBackground(Color.WHITE);
        btCadastrar.setForeground(corFundo);
        btCadastrar.setFocusPainted(false);
        btCadastrar.setBorder(new EmptyBorder(5, 15, 5, 15));
        btCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
        add(btCadastrar, "cell 2 4, growx, height 35!, gaptop 10");
        
        JLabel lblSub = new JLabel("Por favor, acesse sua conta ou crie uma nova.");
        lblSub.setForeground(new Color(245, 245, 245));
        lblSub.setFont(new Font("Times New Roman", Font.ITALIC, 12));
        add(lblSub, "cell 1 5 2 1, alignx center, gaptop 20");
    }

    public JTextField getTfNome() { return tfNome; }
    public JTextField getTfCpf() { return tfCpf; }
    public JButton getBtEntrar() { return btEntrar; }
    public JButton getBtCadastrar() { return btCadastrar; }
}