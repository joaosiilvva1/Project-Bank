package br.com.fecaf.view;

import br.com.fecaf.controller.ClienteController;
import br.com.fecaf.model.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelaCadastroCliente extends JFrame {

    private JTextArea txtNome = new JTextArea();
    private JTextArea txtCpf = new JTextArea();
    private JTextArea txtIdade = new JTextArea();
    private JTextArea txtEmail = new JTextArea();

    private JLabel lblNome = new JLabel("Nome: ");
    private JLabel lblCpf = new JLabel("CPF: ");
    private JLabel lblIdade = new JLabel("Idade: ");
    private JLabel lblEmail = new JLabel("Email: ");

    private JButton buttonCadastro = new JButton("Cadastrar");
    private JButton buttonLimpar = new JButton("Limpar");
    private JButton buttonSair = new JButton("Sair");

    private JPanel painelTitulo = new JPanel();

    // Isso é um construtor
    public TelaCadastroCliente () {
        // Configurações da Tela
        setTitle("Cadastro Cliente");
        setSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        // Labels e Campos
        lblNome.setBounds(50, 50, 100, 25);
        txtNome.setBounds(150, 50, 250, 25);

        lblCpf.setBounds(50, 100, 100, 25);
        txtCpf.setBounds(150, 100, 250, 25);

        lblIdade.setBounds(50, 150, 100, 25);
        txtIdade.setBounds(150, 150, 250, 25);

        lblEmail.setBounds(50, 200, 100, 25);
        txtEmail.setBounds(150, 200, 250, 25);

        add(lblNome);
        add(txtNome);
        add(lblCpf);
        add(txtCpf);
        add(lblIdade);
        add(txtIdade);
        add(lblEmail);
        add(txtEmail);

        // Botoes
        buttonCadastro.setBounds(50, 300, 100, 30);
        buttonLimpar.setBounds(200, 300, 100, 30);
        buttonSair.setBounds(350, 300, 100, 30);

        add(buttonCadastro);
        add(buttonLimpar);
        add(buttonSair);

        // Ação do botão Cadastro
        buttonCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cadastrarClientes();
            }
        });

        // Ação do botão Limpar
        buttonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                limparCampos();
            }
        });

        // Ação do botão Sair
        buttonSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose(); // Fecha a janela
            }
        });

        setVisible(true);
    }

    // Método para cadastrar o cliente
    private void cadastrarClientes() {
        String nome = txtNome.getText().trim();
        String cpf = txtCpf.getText().trim();
        String idadeStr = txtIdade.getText().trim();
        String email = txtEmail.getText().trim();

        // Validação dos campos
        if (nome.isEmpty() || cpf.isEmpty() || idadeStr.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return;
        }

        // Validar CPF
        if (!validarCpf(cpf)) {
            JOptionPane.showMessageDialog(this, "CPF inválido!");
            return;
        }

        // Validar idade
        int idade;
        try {
            idade = Integer.parseInt(idadeStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Idade deve ser um número!");
            return;
        }

        // Validar Email
        if (!validarEmail(email)) {
            JOptionPane.showMessageDialog(this, "Email inválido!");
            return;
        }

        // Criando cliente e passando os dados
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setIdade(idade);
        cliente.setEmail(email);

        // Adicionar cliente no controlador
        ClienteController clienteController = new ClienteController();
        clienteController.addClientList(cliente);

        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
    }

    // Método para validar CPF (usando uma regex simples)
    private boolean validarCpf(String cpf) {
        // Regex simples para validar CPF
        String regex = "^(\\d{3})\\.(\\d{3})\\.(\\d{3})-(\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cpf);
        return matcher.matches();
    }

    // Método para validar Email (usando uma regex)
    private boolean validarEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Método para limpar os campos
    private void limparCampos() {
        txtNome.setText("");
        txtCpf.setText("");
        txtIdade.setText("");
        txtEmail.setText("");
    }
}
