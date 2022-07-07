package com.example.movingcircle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class MovingCircleGui implements Initializable {

    @FXML
    private Circle circle;
    @FXML
    private Pane canvas;

    private MeinAnimationTimer timer;

    public void handleMoveAction(ActionEvent actionEvent) {
        //circle.setTranslateX(circle.getTranslateX() + 1);
        timer.start();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println(circle);
        timer = new MeinAnimationTimer(circle);
    }
}
