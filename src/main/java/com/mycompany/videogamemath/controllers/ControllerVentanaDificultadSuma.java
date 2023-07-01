package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerVentanaDificultadSuma {
    
    //Declaramos el OnAction de la vista de Dificultad para la SUma
    @FXML
    void btnDificilSuma(ActionEvent event) throws IOException {
        //Boton para la eleccion de la dificultad Dificil
        App.setRoot("VentanaPreguntasSumDificil");
    }

    @FXML
    void btnFacilSuma(ActionEvent event) throws IOException {
        //Boton para la eleccion de la dificultad Facil
        App.setRoot("VentanaPreguntas");
    }

    @FXML
    void btnNormalSuma(ActionEvent event) throws IOException {
        //Boton para la eleccion de la dificultad Normal
        App.setRoot("VentanaPreguntasSumNormal");
    }

    @FXML
    void btnVolverSuma(ActionEvent event) throws IOException {
        //Volver a la ventana de eleccion de las operaciones
        App.setRoot("VentanaOperaciones");
    }
}

