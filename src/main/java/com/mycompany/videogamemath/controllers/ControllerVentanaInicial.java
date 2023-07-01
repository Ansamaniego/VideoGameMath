
package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

//La primera vista que veremos al abrir nuestra App
public class ControllerVentanaInicial {
    
    
    @FXML
    void btnJugar(ActionEvent event) throws IOException {
        /*
        Seleccionamos este Boton de Jugar, vamos a la pantalla de Inicio 
        de sesion donde se solicitara crear cuenta o iniciar sesion
        */
        App.setRoot("VentanaInicioSesion");
    }

    @FXML
    void btnJugarInvitado(ActionEvent event) throws IOException {
        /*
        Seleccionamos este Boton de Jugar, vamos a la pantalla de Seleccion de 
        operacion, aqui no tendremos que iniciar sesion, por lo que nuestro 
        progreso no se guardara.
        */
        App.setRoot("VentanaOperaciones");
    }
}
