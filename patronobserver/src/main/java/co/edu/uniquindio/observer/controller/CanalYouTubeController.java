package co.edu.uniquindio.observer.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.observer.App;
import co.edu.uniquindio.observer.model.Suscriptor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CanalYouTubeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField TextNombre;

    @FXML
    private Button ButtonNotificar;

    @FXML
    private TextField TextDesuscribirse;

    @FXML
    private Button ButtonAtras;

    @FXML
    private TextField TextSuscribirse;

    @FXML
    private Button ButtonCrearCanal;

    @FXML
    void suscribirse(Suscriptor suscriptor) {
        suscribirse(suscriptor);
    }

    @FXML
    void desuscribirse(Suscriptor suscriptor) {
        desuscribirse(suscriptor);
    }
    
    @FXML
    private void cambiarEscenaPrincipal() throws IOException{
        App.setRoot("viewPrincipal");
    }

    @FXML
    void setNombre(String nombre) {
        setNombre(nombre);
    }

    @FXML
    void crearCanal(ActionEvent event) {
        
    }

    @FXML
    void initialize() {

    }
}
