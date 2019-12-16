/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Valeria
 */
public class FXMLregistrarUsuarioController implements Initializable {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido2;
    @FXML
    private TextField txtApellido1;
    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtNombreUsuario;
    @FXML
    private TextField txtCorreo;
    @FXML
    private PasswordField pswContrasenia;
    @FXML
    private DatePicker dpNacimiento;
    @FXML
    private TextField txtTelefono;
    @FXML
    private ComboBox cbGenero;
    @FXML
    private ComboBox cbTipo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
