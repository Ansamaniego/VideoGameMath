/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author andre
 */
public class ControllerVentanaCierreController implements Initializable {
    
    
    @FXML
    private Label labelPuntaje;

    @FXML
    private Label labelREspCorrectas;

    @FXML
    private Label labelTextCierre;

    @FXML
    void btnContinuar(ActionEvent event) throws IOException {
        App.setRoot("VentanaOperaciones");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mensaje();

    }
    
    public void mensaje(){
        labelPuntaje.setText("00000");
        labelREspCorrectas.setText("Coming soon");
        labelTextCierre.setText("Coming soon");
        
        
    }
    
    
    
}
