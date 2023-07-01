package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import BaseDeDatos.DBGame;
import java.util.ArrayList;
import java.util.List;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

public class ControllerVentanaRegistro implements Initializable {
    
    BaseDeDatos.DBGame baseDatos;
    
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
    private CheckBox checkPassword;
    
    @FXML
    private Label labelEncontrado;

    @FXML
    void btnCrearCuenta(ActionEvent event) throws IOException {
        /*
        Ingresamos los datos y estos seran guardados en nuestra base de datos
        */
        confirmarPassword();
        App.setRoot("VentanaInicioSesion");
    }

    @FXML
    void btnVolverRegister(ActionEvent event) throws IOException {
        /*
        Volver a la pantalla de Inicio de Sesion
        */
        App.setRoot("VentanaInicioSesion");
    }
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        //Contraseña 
        maskPassword(txtPassRegister, txtMaskPassRegist, checkPassword);
        
        //confirmarcontraseña
        maskPassword(txtConfirmPassReg, txtMaskPassConfirmReg   , checkPassword);
        
        //Bloquear espacios en blanco
        bloquearCharCasillas();
       
    }
    
    public void maskPassword(PasswordField pass, TextField text, CheckBox check){
        /*
            Metodo que conecta el passwordfield con el textfield, cuando seleccionemos 
            el checkbox de ver contraseña se pueda observar la contrase;a que hemos colocado
        */
        
        text.setVisible(false);
        text.setManaged(false);
        
        text.managedProperty().bind(check.selectedProperty());
        text.visibleProperty().bind(check.selectedProperty());       
        
        text.textProperty().bindBidirectional(pass.textProperty());
        
    }
    
    public void bloquearCharCasillas(){
        
        /*
             Metodo que nos permite no ingresar espacios en blanco 
            en el password and user
        */
        txtConfirmPassReg.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                if(event.getCharacter().equals(" "))
                    event.consume();
            }
        });
        
        txtCorreoRegister.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                if(event.getCharacter().equals(" "))
                    event.consume();
            }
        });
        
        txtMaskPassConfirmReg.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                if(event.getCharacter().equals(" "))
                    event.consume();
            }
        });
        
         txtMaskPassRegist.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                if(event.getCharacter().equals(" "))
                    event.consume();
            }
        });

        /*txtNombreRegister.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                if(event.getCharacter().equals(" "))
                    event.consume();
            }
        });*/
        
        txtPassRegister.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                if(event.getCharacter().equals(" "))
                    event.consume();
            }
        });
        
        txtUsuarioRegister.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                if(event.getCharacter().equals(" "))
                    event.consume();
            }
        });       
    }
    
    //Creamos una base de datos interna donde cada posicion tendra la informacion suministrada
    /*
    private String[] usuario = {"Andresam14", "Valen1234", "Samyper", "Yash"};
    private String[] nombre = {"Andres", "Valentina", "Samuel", "Yasmin"};
    private String[] correo = {"ansamaniego@poligran.edu.co", "valentina@gmail.com", "Samuel@gmail.com", "Yasmin@gmail.com" };
    private String[] password = {"Andres1234", "Valentina1234", "Samuel1234", "Yasmin1234"};
    private String[] passwordConfirm = {"Andres1234", "Valentina1234", "Samuel1234", "Yasmin1234"};
    */
    
    public void ObtenerDatos() throws IOException {
                   
    }
    
    public void agregarDatosDB(){
            
        baseDatos.agregarUsuario(txtUsuarioRegister.getText());
        baseDatos.agregarNombre(txtNombreRegister.getText());
        baseDatos.agregarCorreo(txtCorreoRegister.getText());
        baseDatos.agregarPassword(txtPassRegister.getText());
        baseDatos.agregarPasswordConfirmed(txtConfirmPassReg.getText());        
        
    }
    
    public void cargarPantalla() throws IOException{
        App.setRoot("VentanaInicioSesion");
    }
    
    public void confirmarPassword(){
        
        String pass = txtPassRegister.getText();
        String confirmPass = txtConfirmPassReg.getText();
        
        if(!pass.equals(confirmPass)){
            labelEncontrado.setText("Password no coinciden");
        }
        labelEncontrado.setText("Cuenta Creada");
    }
}