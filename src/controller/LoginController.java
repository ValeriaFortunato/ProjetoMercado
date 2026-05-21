package controller;

import javax.swing.JOptionPane;

import model.Sessao;
import model.Usuario;
import model.UsuarioDAO;
import view.*;

public class LoginController {

    private TelaLogin view;
    private Janelas frame;

    public LoginController(TelaLogin view, Janelas frame) {
        this.view = view;
        this.frame = frame;

        initEventos();
    }

    private void initEventos() {

        view.getBtEntrar().addActionListener(e -> {

            String nome = view.getTfNome().getText();
            String cpf = view.getTfCpf().getText();

            Usuario usuario = UsuarioDAO.buscar(nome, cpf);

            if (usuario == null) {
                JOptionPane.showMessageDialog(view, "Usuário não encontrado!");
                return;
            }

            Sessao.setUsuario(usuario);

            JOptionPane.showMessageDialog(view, "Bem-vindo " + nome);

            if (usuario.isAdmin()) {

                TelaCadastroProdutos tela = new TelaCadastroProdutos();
                new CadastroProdutosController(tela, frame);
                Navegador.trocarTela(tela);

            } else {

                TelaProdutos tela = new TelaProdutos();
                new ProdutosController(tela, frame);
                Navegador.trocarTela(tela);
            }
        });

        view.getBtCadastrar().addActionListener(e -> {

            TelaCadastroUsuario tela = new TelaCadastroUsuario();
            new CadastroUsuarioController(tela, frame);
            Navegador.trocarTela(tela);
        });
    }
}