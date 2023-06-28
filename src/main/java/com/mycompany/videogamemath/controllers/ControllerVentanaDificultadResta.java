package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerVentanaDificultadResta {

    //Controlador de la dificultad cuando seleccionan Resta
    
    @FXML
    void btnDificilResta(ActionEvent event) {
        //Boton para la seleccion de la dificultad Dificil
    }

    @FXML
    void btnFacilResta(ActionEvent event) throws IOException {
        //Boton para seleccionar la dificultad dificil
        App.setRoot("VentanaPreguntasRestaFacil");
    }

    @FXML
    void btnNormalResta(ActionEvent event) throws IOException {
        //Boton para la seleccion de la dificultad Normal
        App.setRoot("VentanaPreguntasRestaNormal");
    }

    @FXML
    void btnVolverResta(ActionEvent event) throws IOException {
        //Boton para volver a la seleccion de la operacion a practicar
        App.setRoot("VentanaOperaciones");
    }

}