package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class VentanaInicioSesionController {
 /* 
    Controlador de la ventana de inicio de sesion
 */
    @FXML
    private CheckBox checkVerPass;

    @FXML
    private TextField txtMaskPass;

    @FXML
    private PasswordField txtPass;

    @FXML
    private TextField txtUsuario;

    @FXML
    void btnInicioSesion(ActionEvent event) throws IOException {
        /*
        Boton que permite iniciar sesion, si ya tenemos una cuenta
        */
        App.setRoot("VentanaOperaciones");
    }

    @FXML
    void btnRegistrarse(ActionEvent event) throws IOException {
        /*
        Boton que nos llevara a la vista donde nos permitira crear nuestra 
        cuenta por primera vez
        */
        App.setRoot("VentanaRegistrarse");
    }
    
    
    @FXML
    void BtnVolverInicioSesion(ActionEvent event) throws IOException {
        /*
        Boton para volver a la pantalla Inicial del juego.
        */
        App.setRoot("VentanaInicial");
    }

}
