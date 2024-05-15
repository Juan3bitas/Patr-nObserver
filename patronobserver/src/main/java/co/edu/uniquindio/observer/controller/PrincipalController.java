package co.edu.uniquindio.observer.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.observer.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrincipalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButtonCanal;

    @FXML
    private Button ButtonSuscriptor;

    @FXML
    private void cambiarEscenaSuscriptor() throws IOException{
        App.setRoot("viewSuscriptor");
    }

    @FXML
    private void cambiarEscenaCanal() throws IOException{
        App.setRoot("viewCanalYouTube");
    }

    @FXML
    void initialize() {

    }
}

