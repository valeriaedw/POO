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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Valeria
 */
public class FXMLregistrarPuestoController implements Initializable {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtSalarioBase;
    @FXML
    private TextField txtSalarioneto;
    @FXML
    private TextField txtBono;
    @FXML
    private DatePicker dpContrato;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}