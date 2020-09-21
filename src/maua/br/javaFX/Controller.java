package maua.br.javaFX;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import maua.br.model.Pokemon;

import java.awt.*;

public class Controller {
    @FXML
    private TextField txtUrl, txtId, txtNome, txtRaridade, txtSerie, txtColecao;
    @FXML
    private ImageView imgFoto;
    @FXML
    public void pokemon(){
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
    // pega a URL q o usuario manda e poe dentro de preview
    public void previewPhoto(){
        try {
            String url = txtUrl.getText();
            Image image = new Image(url);
            imgFoto.setImage(image);
        }
        catch (IllegalArgumentException exception){

            txtUrl.requestFocus();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("URl Incorreta");
            alert.setHeaderText("Verificar Url!");
            // mostra o alerta e so fecha se for fechado
            alert.showAndWait();
            // Deixa o restante do codigo ser executado
            // alert.show();
            System.out.println("Atenção");
        }
    }
    @FXML
    public void editar(){
//        txtUrl.clear();
//        txtId.clear();
//        txtNome.clear();
//        txtRaridade.clear();
//        txtColecao.clear();
   }

    }



