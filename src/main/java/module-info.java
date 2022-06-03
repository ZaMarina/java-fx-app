module ru.db.javafxapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.db.javafxapp to javafx.fxml;
    exports ru.db.javafxapp;
}