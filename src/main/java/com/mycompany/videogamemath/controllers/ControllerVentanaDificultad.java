package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerVentanaDificultad {

    @FXML
    void btnDificil(ActionEvent event) throws IOException {
        App.setRoot("VentanaOperaciones");
    }

    @FXML
    void btnFacil(ActionEvent event) throws IOException {
        App.setRoot("VentanaOperaciones");
    }

    @FXML
    void btnMuyDificil(ActionEvent event) throws IOException {
        App.setRoot("VentanaOperaciones");
    }

    @FXML
    void btnNormal(ActionEvent event) throws IOException {
        App.setRoot("VentanaOperaciones");
    }   

    @FXML
    void btnVolverDificultad(ActionEvent event) throws IOException {
        App.setRoot("VentanaInicioSesion");
    }

}