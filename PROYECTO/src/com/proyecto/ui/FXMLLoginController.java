/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ui;

import com.proyecto.tl.Personas.PersonaController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLLoginController implements Initializable {

    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField pwdContrasenia;
    //Controller
    PersonaController gestor = new PersonaController();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void login(ActionEvent event) {
        String name = txtUsuario.getText();
        String contrasenia = pwdContrasenia.getText();
        boolean usuarioExistente = gestor.loginUsuario(name, contrasenia);

        if (name.isEmpty() || contrasenia.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Validación de datos");
            alert.setHeaderText(null);
            alert.setContentText("Oops...Algunos espacios quedaron vacíos!");
            alert.showAndWait();

        } else if (!usuarioExistente) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Credenciales Erroneas");
            alert.setHeaderText(null);
            alert.setContentText("El nombre de usuario y la contraseña no coinciden, intente de nuevo");
            alert.showAndWait();
            txtUsuario.setText("");
            pwdContrasenia.setText("");

        } else {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ya inició sesión");
            alert.showAndWait();

        }
    }

    public void botonCancelar(ActionEvent event) throws IOException {

        Parent blah = FXMLLoader.load(getClass().getResource("FXMLinicio.fxml"));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();

    }

}
