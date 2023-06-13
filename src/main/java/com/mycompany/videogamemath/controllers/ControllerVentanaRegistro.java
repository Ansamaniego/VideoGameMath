package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControllerVentanaRegistro {
    /*
    Vista para la creacion de Cuenta
    */

    @FXML
    private PasswordField txtConfirmPassReg;

    @FXML
    private TextField txtCorreoRegister;

    @FXML
    private TextField txtMaskPassConfirmReg;

    @FXML
    private TextField txtMaskPassRegist;

    @FXML
    private TextField txtNombreRegister;

    @FXML
    private PasswordField txtPassRegister;

    @FXML
    private TextField txtUsuarioRegister;

    @FXML
    void btnCrearCuenta(ActionEvent event) throws IOException {
        /*
        Ingresamos los datos y estos seran guardados en nuestra base de datos
        */
        System.out.println("Cuenta Creada");
        App.setRoot("VentanaDificultad");
    }

    @FXML
    void btnVolverRegister(ActionEvent event) throws IOException {
        /*
        Volver a la pantalla de Inicio de Sesion
        */
        App.setRoot("VentanaInicioSesion");
    }

}