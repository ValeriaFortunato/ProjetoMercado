package controller;

import javax.swing.JOptionPane;
import model.Usuario;
import model.UsuarioDAO;
import view.*;

public class CadastroUsuarioController {

    private TelaCadastroUsuario view;
    private Janelas frame;

    public CadastroUsuarioController(TelaCadastroUsuario view, Janelas frame) {
        this.view = view;
        this.frame = frame;
        initEventos();
    }

    private void initEventos() {

        view.getbtnCadastrar().addActionListener(e -> {

            String nome = view.getTfNome().getText().trim();
            String cpf = view.getTfCpf().getText().trim();

            if (nome.isEmpty() || cpf.isEmpty()) {
                JOptionPane.showMessageDialog(view, "Preencha todos os campos!");
                return;
            }

            if (!cpf.matches("\\d{11}")) {
                JOptionPane.showMessageDialog(view, "O CPF deve conter exatamente 11 números e nenhuma letra!");
                return;
            }

            if (!view.getRbSim().isSelected() && !view.getRbNao().isSelected()) {
                JOptionPane.showMessageDialog(view, "Selecione se é administrador!");
                return;
            }

            boolean admin = view.getRbSim().isSelected();

            try {
                Usuario user = new Usuario(nome, cpf, admin);
                UsuarioDAO.salvar(user);

                JOptionPane.showMessageDialog(view, "Cadastro realizado com sucesso!");

                TelaLogin telaLogin = new TelaLogin();
                new LoginController(telaLogin, frame);
                Navegador.trocarTela(telaLogin);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(view, "Erro ao cadastrar usuário!");
                ex.printStackTrace();
            }
        });

        view.getbtnVoltar().addActionListener(e -> {
            TelaLogin tela = new TelaLogin();
            new LoginController(tela, frame);
            Navegador.trocarTela(tela);
        });
    }
}