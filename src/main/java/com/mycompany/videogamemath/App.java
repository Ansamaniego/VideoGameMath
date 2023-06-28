package com.mycompany.videogamemath;
    
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de nuestro Juego, aqui es donde tenemos los metodos para cargar las vistas creadas
 * en SceneBuilder
 */
public class App extends Application {

    private static Scene scene;
    
    /*
    * Nuestra Clase Start es donde cargamos la primera vista y nuestra Scena
    */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("VentanaInicial"), 400,600);
        stage.setScene(scene);
        stage.show();
    }
    /*
    * Metodo que nos permite cambiar la vista cuando se realice una 
    * accion en otra de las vistas
    */
    public static void setRoot(String fxml) throws IOException  {
            scene.setRoot(loadFXML(fxml));
    }
    
    /*
    * Metodo que nos permite cargar las vistas creadas en SceneBuilder
    */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
    //Lanzador de la App
    public static void main(String[] args) {
        launch();
    }

}