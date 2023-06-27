package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerVentanaPreguntasSumNormal implements Initializable {
    
    ControllerVentanaDificultadSuma controlador;
   
    @FXML
    private Button btnIdA;
    @FXML
    private Button btnIdB;
    @FXML
    private Button btnIdC;
    @FXML
    private Button btnIdD;
    @FXML
    private Label labRespUser;
    @FXML
    private Label labelRespCorrect;   
    @FXML
    private Button btnIdSiguiente;
    @FXML
    private Label questionlabel;
    @FXML
    private Label labelPuntos;
    
    
    
    @FXML      
    void btnA(ActionEvent event) {
        String text = btnIdA.getText();
        labRespUser.setText(text);
        labelRespCorrect.setText(correctAnswer);
        updatePointsLabel();       
        DeshabilitarBotones();
    }

    @FXML
    void btnB(ActionEvent event) {
        String text = btnIdB.getText();
        labRespUser.setText(text);
        labelRespCorrect.setText(correctAnswer);
        updatePointsLabel();
        DeshabilitarBotones();
    }

    @FXML
    void btnC(ActionEvent event) {
        String text = btnIdC.getText();
        labRespUser.setText(text);     
        labelRespCorrect.setText(correctAnswer);
        updatePointsLabel();
        DeshabilitarBotones();
    }

    @FXML
    void btnD(ActionEvent event) {
        String text = btnIdD.getText();
        labRespUser.setText(text);   
        labelRespCorrect.setText(correctAnswer);
        updatePointsLabel();
        DeshabilitarBotones();
    }
    
    private int contador = 0;

    @FXML
    void btnSiguiente(ActionEvent event) throws IOException{
        
        if (contador < 9) {
            contador ++;
            labelRespCorrect.setText("");
            labRespUser.setText("");
            generateQuestion(); 
            HabilitarBotones();
        }
        else{
            App.setRoot("VentanaOperaciones");
        }
    }
        

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        puntos = 0;
        generateQuestion();
        updatePointsLabel();
    }
    
    // Variables para la pregunta y opciones de respuesta
    private String currentQuestion;
    private String correctAnswer;
    private List<String> answerOptions;
    
    private void generateQuestion() {
        // Genera una pregunta y opciones de respuesta aleatorias
        int num1 = (int) (Math.random() * 100) + 1;
        int num2 = (int) (Math.random() * 100) + 1;
        int answer = num1 + num2;

        currentQuestion = num1 + " + " + num2 + " = ?";
        correctAnswer = Integer.toString(answer);

        // Genera tres respuestas incorrectas
        answerOptions = new ArrayList<>();
        answerOptions.add(Integer.toString(answer - (int) (Math.random() * 10) + 1));
        answerOptions.add(Integer.toString(answer + (int) (Math.random() * 7) + 1));
        answerOptions.add(Integer.toString(answer - (int) (Math.random() * 5) + 1));

        // Agrega la respuesta correcta a las opciones
        answerOptions.add(correctAnswer);

        // Mezcla las opciones de respuesta
        Random random = new Random();
       
        for (int i = answerOptions.size() - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String temp = answerOptions.get(index);
            answerOptions.set(index, answerOptions.get(i));
            answerOptions.set(i, temp);
        }
        
        // Asigna las opciones de respuesta a los botones
        btnIdA.setText(answerOptions.get(0));
        btnIdB.setText(answerOptions.get(1));
        btnIdC.setText(answerOptions.get(2));
        btnIdD.setText(answerOptions.get(3));
        

        // Muestra la pregunta en la etiqueta
        questionlabel.setText(currentQuestion);
    }
    
    //Inicializamos la puntuacion en 0
    int puntos = 0;
    
    
    private void updatePointsLabel() {
                      
        if(compararRespuesta()){               //Se actualiza el label del puntaje
            actualizarLabelPuntos(); 
            puntos+=100;                       //Suma 100 puntos por respuesta correcta
        }
    }
    
    private Boolean compararRespuesta(){
        
        if(labelRespCorrect.getText() == labRespUser.getText()){
            return true;
        } else{
            return false;
        }       
    }
    
    private void actualizarLabelPuntos(){
        labelPuntos.setText(String.valueOf(puntos));
    }
    
    private void DeshabilitarBotones(){
        btnIdA.setDisable(true);
        btnIdB.setDisable(true);
        btnIdC.setDisable(true);
        btnIdD.setDisable(true);   
    }
    
    private void HabilitarBotones(){
        btnIdA.setDisable(false);
        btnIdB.setDisable(false);
        btnIdC.setDisable(false);
        btnIdD.setDisable(false); 
    }
}
    
