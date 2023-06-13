package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerVentanaDificultadMultiplicacion {

    @FXML
    void btnDificilMulti(ActionEvent event) {

    }

    @FXML
    void btnFacilMulti(ActionEvent event) {

    }

    @FXML
    void btnNormalMulti(ActionEvent event) {

    }

    @FXML
    void btnVolverMulti(ActionEvent event) throws IOException {
        App.setRoot("VentanaOperaciones");
    }

}