package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import java.net.URL;
import BaseDeDatos.DBGame;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class VentanaInicioSesionController implements Initializable{
    
    BaseDeDatos.DBGame baseDatos;
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
    private Label labelIngresoErrado;

    @FXML
    void btnInicioSesion(ActionEvent event) throws IOException {
        /*
        Boton que permite iniciar sesion, si ya tenemos una cuenta
        */
        ValidarDatos();
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
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        maskPassword(txtPass, txtMaskPass, checkVerPass);
        
        condicion();
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
    

    
    public void condicion(){
        
        /*
            Metodo que nos permite no ingresar espacios en blanco 
            en el password and user
        */
        txtUsuario.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                if(event.getCharacter().equals(" "))
                    event.consume();
            }
        });
        
        txtPass.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                if(event.getCharacter().equals(" "))
                    event.consume();
            }
        });
        
        txtMaskPass.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                if(event.getCharacter().equals(" "))
                    event.consume();
            }
        });
    }
    
    //Creamos Base de datos para ingreso APP  
    private String[] usuario = {"Andresam14", "Valen1234", "Samyper", "Yash"};
    private String[] nombre = {"Andres", "Valentina", "Samuel", "Yasmin"};
    private String[] correo = {"ansamaniego@poligran.edu.co", "valentina@gmail.com", "Samuel@gmail.com", "Yasmin@gmail.com" };
    private String[] password = {"Andres1234", "Valentina1234", "Samuel1234", "Yasmin1234"};
    private String[] passwordConfirm = {"Andres1234", "Valentina1234", "Samuel1234", "Yasmin1234"};
    
    
    
    public void ValidarDatos() throws IOException{
                
        String user = txtUsuario.getText();
        String pass = txtPass.getText();
        
        /*
        for(int i=0; i<baseDatos.getListaUsuarios().size(); i++){
            if(user.equals(baseDatos.obtenerUsuarios(i))){
                App.setRoot("VentanaOperaciones");
            }
            labelIngresoErrado.setText("Usuario No encontrado");
                
        }*/
        
        
        for(int i=0; i<usuario.length; i++){
            if((user.equals(usuario[i])) && pass.equals(password[i])){
                App.setRoot("VentanaOperaciones");
            }
            labelIngresoErrado.setText("Usuario erroneo");
                
        }
    }
}
