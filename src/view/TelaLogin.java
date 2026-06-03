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
import javax.swing.border.LineBorder;

public class TelaLogin extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField tfNome;
    private JTextField tfCpf;
    private JButton btEntrar;
    private JButton btCadastrar;
    private JLabel lblNewLabel;

    public TelaLogin() {
        Color corFundo = new Color(30, 41, 59);       
        Color corInputBg = new Color(255, 255, 255);
        Color corBotaoPrincipal = new Color(37, 99, 235); 
        Color corBotaoSecundario = new Color(71, 85, 105); 
        Color corTextoMuted = new Color(148, 163, 184);   
        
        setBackground(corFundo);
        setToolTipText("Tela Login");

        setLayout(new MigLayout("fill, insets 50 40 50 40", "[grow][right][280px:280px, grow][grow]", "[grow][][][][][][grow]"));
        
        lblNewLabel = new JLabel("Bem-vindo de volta");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 26)); 
        add(lblNewLabel, "cell 1 1 2 1, alignx center, gapbottom 8");

        JLabel lblSub = new JLabel("");
        lblSub.setForeground(corTextoMuted);
        lblSub.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        add(lblSub, "cell 1 1 2 1, alignx center, gapbottom 30"); 

        JLabel lblNome = new JLabel("Nome");
        lblNome.setForeground(Color.WHITE);
        lblNome.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        add(lblNome, "cell 1 2, gapright 10");

        tfNome = new JTextField();
        tfNome.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tfNome.setBackground(corInputBg);
        tfNome.setBorder(new LineBorder(new Color(203, 213, 225), 1)); 
        tfNome.setBorder(javax.swing.BorderFactory.createCompoundBorder(tfNome.getBorder(), new EmptyBorder(0, 8, 0, 8)));
        add(tfNome, "cell 2 2, growx, height 36!, gapbottom 12");

        JLabel lblCpf = new JLabel("CPF");
        lblCpf.setForeground(Color.WHITE);
        lblCpf.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        add(lblCpf, "cell 1 3, gapright 10");

        tfCpf = new JTextField();
        tfCpf.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tfCpf.setBackground(corInputBg);
        tfCpf.setBorder(new LineBorder(new Color(203, 213, 225), 1));
        tfCpf.setBorder(javax.swing.BorderFactory.createCompoundBorder(tfCpf.getBorder(), new EmptyBorder(0, 8, 0, 8)));
        
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

        add(tfCpf, "cell 2 3, growx, height 36!, gapbottom 20");

        btEntrar = new JButton("Entrar");
        btEntrar.setBackground(corBotaoPrincipal);
        btEntrar.setForeground(Color.WHITE);
        btEntrar.setFocusPainted(false); 
        btEntrar.setBorder(new EmptyBorder(5, 15, 5, 15));
        btEntrar.setFont(new Font("Segoe UI", Font.BOLD, 14));
        add(btEntrar, "cell 2 4, split 2, growx, height 38!, gapright 8");

        btCadastrar = new JButton("Criar Conta");
        btCadastrar.setBackground(corBotaoSecundario);
        btCadastrar.setForeground(Color.WHITE);
        btCadastrar.setFocusPainted(false);
        btCadastrar.setBorder(new EmptyBorder(5, 15, 5, 15));
        btCadastrar.setFont(new Font("Segoe UI", Font.BOLD, 14));
        add(btCadastrar, "cell 2 4, growx, height 38!");
    }

    public JTextField getTfNome() { return tfNome; }
    public JTextField getTfCpf() { return tfCpf; }
    public JButton getBtEntrar() { return btEntrar; }
    public JButton getBtCadastrar() { return btCadastrar; }
}