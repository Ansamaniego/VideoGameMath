package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerVentanaOperaciones {

    @FXML
    void btnDivision(ActionEvent event) throws IOException {
        App.setRoot("VentanaDificultadDivision");
    }

    @FXML
    void btnMulti(ActionEvent event) throws IOException {
        App.setRoot("VentanaDificultadMultiplicacion");
    }

    @FXML
    void btnResta(ActionEvent event) throws IOException {
        App.setRoot("VentanaDificultadResta");
    }

    @FXML
    void btnSuma(ActionEvent event) throws IOException {
        App.setRoot("VentanaDificultadSuma");
    }

    @FXML
    void btnVolverOperaciones(ActionEvent event) throws IOException {
        App.setRoot("VentanaInicial");
    }

}
