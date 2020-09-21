package maua.br.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import maua.br.model.Pokemon;

import java.awt.*;

/**
 * Controller - Classe que define os comandos dos elementos da interface gráfica
 * cadastrar() - Método que permite que novos pokémons sejam cadastrados no sistema;
 * editar() - Método que permite que os atributos ta tabela sejam editados
 * deletar() - Método que possibilita deletar, caso haja necessidade
 *
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * @author Lucas Menezes - RA: 16.00683-6
 *
 * @since 21/09/2020
 * @version 1.0
 */
public class Controller {
    @FXML
    private TextField txtUrl, txtId, txtNome, txtRaridade, txtSerie, txtColecao;
    @FXML
    public void cadastrar(){
        Pokemon pokemon = new Pokemon(
                txtUrl.getText(),
                txtId.getText(),
                txtNome.getText(),
                txtRaridade.getText(),
                txtSerie.getText(),
                txtColecao.getText()
        );

        System.out.println("Pokemon cadastrado:"+pokemon);
    }
    @FXML
    public void editar(){

        txtUrl.clear();
        txtId.clear();
        txtNome.clear();
        txtRaridade.clear();
        txtSerie.clear();
        txtColecao.clear();
        System.out.println("Digite os valores a serem corrigidos");
    }




    public void setTxtUrl(TextField txtUrl) {
        this.txtUrl = txtUrl;
    }



    public void setTxtId(TextField txtId) {
        this.txtId = txtId;
    }


    public void setTxtNome(TextField txtNome) {
        this.txtNome = txtNome;
    }



    public void setTxtRaridade(TextField txtRaridade) {
        this.txtRaridade = txtRaridade;
    }


    public void setTxtSerie(TextField txtSerie) {
        this.txtSerie = txtSerie;
    }


    public void setTxtColecao(TextField txtColecao) {
        this.txtColecao = txtColecao;
    }

    @FXML
    public void deletar(){
        this.setTxtUrl(null);
        this.setTxtId(null);
        this.setTxtNome(null);
        this.setTxtRaridade(null);
        this.setTxtSerie(null);
        this.setTxtColecao(null);
        System.out.println("Os dados desse pokemon foram apagados com sucesso!");
        System.out.println("Clique em 'Cadastrar' para continuar cadastrando ");

        }

}
