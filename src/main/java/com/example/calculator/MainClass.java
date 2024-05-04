package com.example.calculator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainClass extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainClass.class.getResource("View.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Image icon = new Image("C:\\Users\\HP\\Desktop\\PROJECTS\\Calculator\\src\\icon.png");
        stage.setTitle("Calculator");
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}