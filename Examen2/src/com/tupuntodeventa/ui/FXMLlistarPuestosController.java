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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Valeria
 */
public class FXMLlistarPuestosController implements Initializable {

    @FXML
    private TableView<?> tablaPuestos;
    @FXML
    private TableColumn<?, ?> nombreCL;
    @FXML
    private TableColumn<?, ?> baseCL;
    @FXML
    private TableColumn<?, ?> netoCL;
    @FXML
    private TableColumn<?, ?> bonoCL;
    @FXML
    private TableColumn<?, ?> fechaCL;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
