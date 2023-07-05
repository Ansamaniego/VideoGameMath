
package com.mycompany.videogamemath.controllers;

import com.mycompany.videogamemath.App;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class ControllerVentanaPreguntasMultiplicacion implements Initializable {
    
    ControllerVentanaDificultadMultiplicacion controler = new ControllerVentanaDificultadMultiplicacion();
    
    String dificultad = controler.getDificultadSeleccionada();
    
    @FXML
    private Button btnIdA;
    @FXML
    private Button btnIdB;
    @FXML
    private Button btnIdC;
    @FXML
    private Button btnIdD;
    @FXML
    private Button btnIdSiguiente;
    @FXML
    private Label labRespUser;
    @FXML
    private Label labelPuntos;
    @FXML
    private Label labelRespCorrect;
    @FXML
    private Label questionlabel;

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
    
    //Creamos un contador de las veces que oprimimos el boton siguiente
    private int contador = 1;

    @FXML
    void btnSiguiente(ActionEvent event) throws IOException {
        switch(dificultad){
            case "Facil":
                if (contador < 5) {
                contador ++;
                labelRespCorrect.setText("");
                labRespUser.setText("");
                generateQuestion();
                HabilitarBotones();
                 }else{
                    App.setRoot("VentanaCierre");
                 }
                break;
                
            case "Normal":
                if (contador < 10) {
                contador ++;
                labelRespCorrect.setText("");
                labRespUser.setText("");
                generateQuestion();
                HabilitarBotones();
                 }else{
                    App.setRoot("VentanaCierre");
                 }
                break;
            case "Dificil":
                if (contador < 15) {
                contador ++;
                labelRespCorrect.setText("");
                labRespUser.setText("");
                generateQuestion();
                HabilitarBotones();
                 }else{
                    App.setRoot("VentanaCierre");
                 }
                break;
        }          
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        puntos = 0;
        generateQuestion();
        updatePointsLabel();
    }  
    
    // Variables para la pregunta y opciones de respuesta
    private String currentQuestion;
    private String correctAnswer;
    private List<String> answerOptions;
    
    public void generateQuestion(){
        
        if(dificultad.equals("Facil")){
            
            // Genera una pregunta y opciones de respuesta aleatorias
            int num1 = (int) (Math.random() * 15) + 1;
            int num2 = (int) (Math.random() * 15) + 1;        
            int answer = num1 * num2;

            currentQuestion = num1 + " X " + num2 + " = ?";
            correctAnswer = Integer.toString(answer);

            // Genera tres respuestas incorrectas
            answerOptions = new ArrayList<>();
            answerOptions.add(Integer.toString(answer - (int) (Math.random() * 10) + 1));
            answerOptions.add(Integer.toString(answer + (int) (Math.random() * 10) + 1));
            answerOptions.add(Integer.toString(answer - (int) (Math.random() * 10) + 1));

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
        else if(dificultad.equals("Normal")){
            // Genera una pregunta y opciones de respuesta aleatorias
            int num1 = (int) (Math.random() * 20) + 1;
            int num2 = (int) (Math.random() * 20) + 1;        
            int answer = num1 * num2;

            currentQuestion = num1 + " X " + num2 + " = ?";
            correctAnswer = Integer.toString(answer);

            // Genera tres respuestas incorrectas
            answerOptions = new ArrayList<>();
            answerOptions.add(Integer.toString(answer - (int) (Math.random() * 10) + 1));
            answerOptions.add(Integer.toString(answer + (int) (Math.random() * 10) + 1));
            answerOptions.add(Integer.toString(answer - (int) (Math.random() * 10) + 1));

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
        }else{
            // Genera una pregunta y opciones de respuesta aleatorias
            int num1 = (int) (Math.random() * 10) + 1;
            int num2 = (int) (Math.random() * 10) + 1;        
            int answer = num1 * num2;

            currentQuestion = num1 + " X " + num2 + " = ?";
            correctAnswer = Integer.toString(answer);

            // Genera tres respuestas incorrectas
            answerOptions = new ArrayList<>();
            answerOptions.add(Integer.toString(answer - (int) (Math.random() * 10) + 1));
            answerOptions.add(Integer.toString(answer + (int) (Math.random() * 10) + 1));
            answerOptions.add(Integer.toString(answer - (int) (Math.random() * 10) + 1));

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
    }
    
    //Inicializamos la puntuacion en 0
    int puntos = 0;
    
    
    private void updatePointsLabel() {
                      
        if(compararRespuesta()){               //Se actualiza el label del puntaje
            actualizarLabelPuntos(); 
            puntos+=100;                       //Suma 100 puntos por respuesta correcta
        }
    }
    
    //Comparamos los dos campos de label donde se pondra la respuesta que elegimos y la respuesta correcta
    private Boolean compararRespuesta(){
        
        if(labelRespCorrect.getText() == labRespUser.getText()){
            return true;
        } else{
            return false;
        }       
    }
    
    //Vamos actualizando el Label donde se muestra los puntos obtenidos
    private void actualizarLabelPuntos(){
        labelPuntos.setText(String.valueOf(puntos));
    }
    
    //Metodo para deshabilitar los botones
    private void DeshabilitarBotones(){
        btnIdA.setDisable(true);
        btnIdB.setDisable(true);
        btnIdC.setDisable(true);
        btnIdD.setDisable(true);   
    }
    
    //Metodo para hbailitar los botones
    private void HabilitarBotones(){
        btnIdA.setDisable(false);
        btnIdB.setDisable(false);
        btnIdC.setDisable(false);
        btnIdD.setDisable(false); 
    }

}
