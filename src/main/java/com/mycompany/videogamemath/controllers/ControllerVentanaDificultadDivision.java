package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

//Controlador para la vista de la dificultad cuando se selecciona la dificultad que desea tener en la division
public class ControllerVentanaDificultadDivision {
    
    //Boton Correspondiente a Dificil cuando seleccionamos division
    @FXML
    void btnDificilDiv(ActionEvent event) {

    }
    //Boton Correspondiente a Facil cuando seleccionamos division
    @FXML
    void btnFacilDiv(ActionEvent event) {

    }
    //Boton Correspondiente a Normal cuando seleccionamos division
    @FXML
    void btnNormalDiv(ActionEvent event) {

    }
    //Boton para voler a la pantalla anterior
    @FXML
    void btnVolverDiv(ActionEvent event) throws IOException {
        App.setRoot("VentanaOperaciones");
    }

}