package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerVentanaDificultadSuma {
    
    ControllerVentanaPreguntas controlador;
    private Button botonSelect;
    //Declaramos el ID de los botones de dificultad para obtener su resultado
    @FXML
    private Button btnSumFacil;

    @FXML
    private Button btnSumHard;

    @FXML
    private Button btnSumNormal;

    @FXML
    void btnDificilSuma(ActionEvent event) throws IOException {
        App.setRoot("VentanaPreguntas");
    }

    @FXML
    void btnFacilSuma(ActionEvent event) throws IOException {
        App.setRoot("VentanaPreguntas");
    }

    @FXML
    void btnNormalSuma(ActionEvent event) throws IOException {
        App.setRoot("VentanaPreguntasSumNormal");
    }

    @FXML
    void btnVolverSuma(ActionEvent event) throws IOException {
        //Volver a la ventana de eleccion de las operaciones
        App.setRoot("VentanaOperaciones");
    }
    
    Random random = new Random();
    
    public int GenerarNumRandomFacil1(){
        int num = random.nextInt(50);
        return num;
    }
    
    public int GenerarNumRandomNormal1(){
        int num = random.nextInt(1000);
        return num;
    }
    
    public float GenerarNumRandomDificil1(){
        float num = random.nextFloat();
        return num;
    }
    
    public int AnswerCorrectFacil(int num1, int num2){
        num1 = GenerarNumRandomFacil1();
        num2 = GenerarNumRandomFacil1();
        int suma = num1 + num2;
        return suma;
    }

}

