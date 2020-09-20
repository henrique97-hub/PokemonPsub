package maua.br.javaFX;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainJX extends Application {
    public static void main(String[] args) {
        // Metodo que inicializa a aplicação
        launch();
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carrega um arquivo para poder usar dentro da aplicação
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        // Titulo da aplicação
        primaryStage.setTitle("Hello World JavaFX");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();


    }
}
