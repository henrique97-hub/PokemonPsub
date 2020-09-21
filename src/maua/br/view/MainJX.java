package maua.br.view;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * MaixJX - Classe que contém a função principal da interface gráfica e responsável por
 * inicializa-la.
 *
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * @author Lucas Menezes - RA: 16.00683-6
 *
 * @since 21/09/2020
 * @version 1.0
 */
public class MainJX extends Application {
    public void main(String[] args) {
        // Metodo que inicializa a aplicação
        launch();
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carrega um arquivo para poder usar dentro da aplicação
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        // Titulo da aplicação
        primaryStage.setTitle("Pokemons JavaFX");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();


    }
}
