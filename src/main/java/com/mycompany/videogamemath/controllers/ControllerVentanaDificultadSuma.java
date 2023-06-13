package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerVentanaDificultadSuma {

    @FXML
    void btnDificilSuma(ActionEvent event) {

    }

    @FXML
    void btnFacilSuma(ActionEvent event) {

    }

    @FXML
    void btnNormalSuma(ActionEvent event) {

    }

    @FXML
    void btnVolverSuma(ActionEvent event) throws IOException {
        App.setRoot("VentanaOperaciones");
    }

}
