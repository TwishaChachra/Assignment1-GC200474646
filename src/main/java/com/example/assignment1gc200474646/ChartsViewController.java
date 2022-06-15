package com.example.assignment1gc200474646;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ChartsViewController implements Initializable {

    @FXML
    private BarChart<String, Integer> barChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    barChart.getData().addAll(DBUtility.getRuntimeStats());
    }
    @FXML
    private void viewTable(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event,"movies-table-view.fxml");
    }
}
