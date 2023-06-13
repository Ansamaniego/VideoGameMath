package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerVentanaDificultadMultiplicacion {
    
    //Controlador de la vista seleccion de dificultad de la multiplicacion
    @FXML
    void btnDificilMulti(ActionEvent event) {
        //Boton para la seleccion de la dificultad Dificil
    }

    @FXML
    void btnFacilMulti(ActionEvent event) {
        //Boton para la seleccion de la dificultad Facil
    }

    @FXML
    void btnNormalMulti(ActionEvent event) {
        //Boton para la seleccion de la dificultad Normal
    }

    @FXML
    void btnVolverMulti(ActionEvent event) throws IOException {
        //Boton para volver a la seleccion de la operacion a practicar
        App.setRoot("VentanaOperaciones");
    }

}