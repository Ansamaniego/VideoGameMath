package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerVentanaDificultadResta {

    @FXML
    void btnDificilResta(ActionEvent event) {

    }

    @FXML
    void btnFacilResta(ActionEvent event) {

    }

    @FXML
    void btnNormalResta(ActionEvent event) {

    }

    @FXML
    void btnVolverResta(ActionEvent event) throws IOException {
        App.setRoot("VentanaOperaciones");
    }

}