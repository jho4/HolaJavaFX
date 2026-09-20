package com.jhoan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Label mensaje = new Label("¡Hola, JavaFX!");

        Scene escena = new Scene(mensaje, 500, 300);

        stage.setTitle("Mi primer proyecto JavaFX");
        stage.setScene(escena);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}