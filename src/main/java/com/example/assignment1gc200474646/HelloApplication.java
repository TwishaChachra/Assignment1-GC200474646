package com.example.assignment1gc200474646;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ArrayList<Movies> movies = DBUtility.getMoviesFromDB();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("movies-table-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        DBUtility.getMoviesFromDB();
        launch();
    }
}