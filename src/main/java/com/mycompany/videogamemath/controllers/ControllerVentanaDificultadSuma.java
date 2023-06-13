package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerVentanaDificultadSuma {
    
    //controlador de la vista de dificultades cuando seleccionamos la suma

    @FXML
    void btnDificilSuma(ActionEvent event) {
        //Boton para la seleccion de la dificultad Dificil
    }

    @FXML
    void btnFacilSuma(ActionEvent event) {
        //Boton para la seleccion de la dificultad Facil
    }

    @FXML
    void btnNormalSuma(ActionEvent event) {
        //Boton para la seleccion de la dificultad Normal
    }

    @FXML
    void btnVolverSuma(ActionEvent event) throws IOException {
        //Boton para volver a la pantalla de seleccion de operaciones
        App.setRoot("VentanaOperaciones");
    }

}
