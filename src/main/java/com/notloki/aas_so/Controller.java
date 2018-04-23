package com.notloki.aas_so;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    public Label logo;



    @FXML
    private void initialize() {

        Image image = new Image(getClass().getResourceAsStream("/AASLogo.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(160);
        imageView.setFitHeight(130);
        logo.setGraphic(imageView);
    }




}
