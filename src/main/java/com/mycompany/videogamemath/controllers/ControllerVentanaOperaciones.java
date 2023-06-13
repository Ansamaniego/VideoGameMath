package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerVentanaOperaciones {
    /*
    Vista donde tendremos la seleccion de la operacion que desean practicar
    */

    @FXML
    void btnDivision(ActionEvent event) throws IOException {
        /*
        Boton para la Division 
        */
        App.setRoot("VentanaDificultadDivision");
    }

    @FXML
    void btnMulti(ActionEvent event) throws IOException {
        /*
        Boton para Multiplicacion
        */
        App.setRoot("VentanaDificultadMultiplicacion");
    }

    @FXML
    void btnResta(ActionEvent event) throws IOException {
        /*
        Boton para Resta
        */
        App.setRoot("VentanaDificultadResta");
    }

    @FXML
    void btnSuma(ActionEvent event) throws IOException {
        /*
        Boton para Suma
        */
        App.setRoot("VentanaDificultadSuma");
    }

    @FXML
    void btnVolverOperaciones(ActionEvent event) throws IOException {
        /*
        Boton para Volver a la pantalla Inicial
        */
        App.setRoot("VentanaInicial");
    }

}
