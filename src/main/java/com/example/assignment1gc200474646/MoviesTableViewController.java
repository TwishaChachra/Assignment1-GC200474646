package com.example.assignment1gc200474646;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MoviesTableViewController implements Initializable {

    @FXML
    private TableColumn<Movies, Integer> ageColumn;

    @FXML
    private TableColumn<Movies, String> directorsColumn;

    @FXML
    private TableColumn<Movies, String> genresColumn;

    @FXML
    private TableColumn<Movies, Integer> idColumn;

    @FXML
    private TableView<Movies> moviesTableView;

    @FXML
    private TableColumn<Movies, String> titleColumn;

    @FXML
    private TableColumn<Movies, Integer> yearColumn;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("Age"));
        directorsColumn.setCellValueFactory(new PropertyValueFactory<>("Directors"));
        genresColumn.setCellValueFactory(new PropertyValueFactory<>("Genres"));
        idColumn.setCellValueFactory(new PropertyValueFactory<>("Id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("Title"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<>("Year"));
        moviesTableView.getItems().addAll(DBUtility.getMoviesFromDB());
    }

    @FXML
    private void viewCharts(ActionEvent event) throws IOException{
        SceneChanger.changeScenes(event,"charts-view.fxml");
    }

}

