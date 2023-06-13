package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerVentanaDificultadDivision {

    @FXML
    void btnDificilDiv(ActionEvent event) {

    }

    @FXML
    void btnFacilDiv(ActionEvent event) {

    }

    @FXML
    void btnNormalDiv(ActionEvent event) {

    }

    @FXML
    void btnVolverDiv(ActionEvent event) throws IOException {
        App.setRoot("VentanaOperaciones");
    }

}