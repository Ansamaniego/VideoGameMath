package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class VentanaInicioSesionController {

    @FXML
    private CheckBox checkVerPass;

    @FXML
    private TextField txtMaskPass;

    @FXML
    private PasswordField txtPass;

    @FXML
    private TextField txtUsuario;

    @FXML
    void btnInicioSesion(ActionEvent event) throws IOException {
        App.setRoot("VentanaDificultad");
    }

    @FXML
    void btnRegistrarse(ActionEvent event) throws IOException {
        App.setRoot("VentanaRegistrarse");
    }

}
