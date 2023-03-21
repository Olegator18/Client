package com.example.client.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.client.Entity.BookEntity;
import com.example.client.Entity.PublisherEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditPublisherController {

        private Stage editBookStage;
        private PublisherEntity publisher;
        private int bookID;
        private boolean okClicked = false;

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TextField PublisherCity;

        @FXML
        private TextField PublisherName;

        @FXML
        private TextField PublisherYear;

        @FXML
        private void SaveBook() throws IOException {
                if (isInputValid()) {
                        publisher.setName(PublisherName.getText());
                        publisher.setCity(PublisherCity.getText());
                        publisher.setYear(PublisherYear.getText());


                        okClicked = true;
                        editBookStage.close();
                        //booksData.set(bookID, book);
                }
        }
        @FXML
        private void CloseBook() {
                editBookStage.close();
        }

        @FXML
        void initialize() {
            assert PublisherCity != null : "fx:id=\"PublisherCity\" was not injected: check your FXML file 'EditPublisher.fxml'.";
            assert PublisherName != null : "fx:id=\"PublisherName\" was not injected: check your FXML file 'EditPublisher.fxml'.";
            assert PublisherYear != null : "fx:id=\"PublisherYear\" was not injected: check your FXML file 'EditPublisher.fxml'.";

        }
        private boolean isInputValid() {
                String errorMessage = "";

                if (PublisherName.getText() == null || PublisherName.getText().length() == 0)
                        errorMessage += "Не обнаружено название книги \n";
       /* if (SetAuthor.getText() == null || SetAuthor.getText().length() == 0)
            errorMessage += "Не обнаружен автор книги! \n";
        if (SetPublisher.getText() == null || SetPublisher.getText().length() == 0)
            errorMessage += "Нe обнаружено издание книги!\n";*/
                if (PublisherCity.getText() == null || PublisherCity.getText().length() == 0)
                        errorMessage += "Нe обнаружен год книги!\n";
                if (PublisherYear.getText() == null || PublisherYear.getText().length() == 0)
                        errorMessage += "Нe обнаружен жанр книги!\n";

                else {
                        if (errorMessage.length() == 0) return true;
                        else {
                                // Показываем сообщение об ошибке.
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.initOwner(editBookStage);
                                alert.setTitle("Ошибка заполнения");
                                alert.setHeaderText("Пожалуйста, укажите корректные значения текстовых полей");
                                alert.setContentText(errorMessage);

                                alert.showAndWait();

                                return false;
                        }
                }
                return true;
        }
}



