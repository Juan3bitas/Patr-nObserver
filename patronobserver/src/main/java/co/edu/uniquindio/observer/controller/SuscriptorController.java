package co.edu.uniquindio.observer.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.observer.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SuscriptorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField TextNombre;

    @FXML
    private Button ButtonAtras;

    @FXML
    private Button ButtonCrearSuscriptor;

    @FXML
    private void cambiarEscenaPrincipal() throws IOException{
        App.setRoot("viewPrincipal");
    }

    @FXML
    void setNombre(ActionEvent event) {
        setNombre(event);
    }

    @FXML
    void crearSuscriptor(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}
