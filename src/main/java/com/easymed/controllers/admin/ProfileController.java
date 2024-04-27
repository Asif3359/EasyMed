package com.easymed.controllers.admin;

import com.easymed.utils.Helpers;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfileController implements Initializable {

    @FXML
    private BorderPane rootPane;

    @FXML
    private GridPane profileContainer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(() -> {
            VBox sidebar = (VBox) rootPane.getLeft();
            Helpers.toggleMenuClass(sidebar, "profile");
            Stage stage = (Stage) rootPane.getScene().getWindow();
            stage.setTitle("Profile");
        });
    }
}
