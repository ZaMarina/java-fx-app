package ru.db.javafxapp;
//контроллер. Для управления элементами в нашем окне
import javafx.beans.property.ObjectProperty;
import javafx.beans.value.ObservableSetValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.ObservableList;

import static javafx.collections.FXCollections.*;


public class Controller {
    @FXML//привязка к полю
    private TextArea historyArea;
    @FXML
    private TextField userMessage;

    private int step = 0;

    public void clickCheckButton(ActionEvent actionEvent) {

        String message = userMessage.getText();
        if (message.isBlank()) {
            return;
        }
            String text = String.format("%d. %s", ++step, message);

            historyArea.appendText(text + "\n");
            userMessage.clear();
            userMessage.requestFocus();

        }

    public void putCmile(ActionEvent actionEvent) {
        String smile = "☺";
        historyArea.appendText(smile + "\n");
    }

    public void addPhone(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.NONE,
                "Добавить телефон из списка:",
                new ButtonType("OK", ButtonBar.ButtonData.YES)

        );
        alert.setTitle("Телефонная книга");

        ButtonType answer = alert.showAndWait().get();

    }

    public void FileClicked(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.NONE,
                "Вы можете добавить что-либо",
                new ButtonType("Да", ButtonBar.ButtonData.YES),
                new ButtonType("Нет", ButtonBar.ButtonData.NO)
        );
        alert.setTitle("Добавить файл");
        ButtonType answer = alert.showAndWait().get();//


    }
}
