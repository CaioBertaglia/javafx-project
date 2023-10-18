package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CadastroClienteController {
    
    @FXML
    private TextField txfNome;

    @FXML
    private TextField txfEmail;

    @FXML
    private TextField txfTelefone;

    @FXML
    private CheckBox ckbPromocao;

    @FXML
    public void onActionCadastrarCliente() {

        String nome = txfNome.getText();
        String email = txfEmail.getText();
        String telefone = txfTelefone.getText();
        Boolean promocaoSelecionada = ckbPromocao.isSelected();
        
        System.out.println(nome + ", " + email + ", " + telefone + ", " + promocaoSelecionada + "\n");
    }
}
