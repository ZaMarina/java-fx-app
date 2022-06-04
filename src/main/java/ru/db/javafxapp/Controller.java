package ru.db.javafxapp;
//контроллер. Для управления элементами в нашем окне
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML//привязка к полю
    private TextArea historyArea;
    @FXML
    private TextField userMessage;

    private int step = 0;

    public void clickCheckButton(ActionEvent actionEvent) {

        String message = userMessage.getText();//метод вернет тот текст который был введен
        if (message.isBlank()) {//такой же как isEmpty, Отправить пробелы мы не можем
            return;
        }
            String text = String.format("%d. %s", ++step, message);
       // String text = String.format("%s", message);
            historyArea.appendText(text + "\n");
            userMessage.clear();//очищаем поле userAnswer
            userMessage.requestFocus();//и далее устанавливаем на него фокус

        }

    }
