package com.example.demo1project4;

/*
 * Author: Tayo Omolola
 * Project: Project4 - Time Interval Comparison
 * Description: Immutable Time class that supports comparison and formatted string parsing.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Project4<T extends Project4> extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Project4.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 475, 300);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}