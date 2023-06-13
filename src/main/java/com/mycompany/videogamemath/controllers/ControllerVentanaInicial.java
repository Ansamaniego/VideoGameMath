
package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class ControllerVentanaInicial {

    @FXML
    void btnJugar(ActionEvent event) throws IOException {
        App.setRoot("VentanaInicioSesion");
    }

    @FXML
    void btnJugarInvitado(ActionEvent event) throws IOException {
        App.setRoot("VentanaOperaciones");
    }
}
