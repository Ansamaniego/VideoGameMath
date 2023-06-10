module com.mycompany.videogamemath {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.videogamemath to javafx.fxml;
    exports com.mycompany.videogamemath;
    exports com.mycompany.videogamemath.controllers to javafx.fxml;
    opens com.mycompany.videogamemath.controllers to javafx.fxml;
}
