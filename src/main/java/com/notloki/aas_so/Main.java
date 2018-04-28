package com.notloki.aas_so;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/rootLogin.fxml"));
        primaryStage.setTitle(Ref.COMPANY + " " + Ref.PROGRAM);
        primaryStage.getIcons().add(new Image("/AASLogo.jpg"));
        primaryStage.setScene(new Scene(root, 900, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
