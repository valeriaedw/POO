/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ui;

import com.proyecto.bl.Generos.Genero;
import com.proyecto.tl.Generos.GeneroController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class FXMLperfilGenerosController implements Initializable {

    @FXML
    private TableView<Genero> tablaGeneros;
    @FXML
    private TableColumn nombreCL;
    @FXML
    private TableColumn descripcionCL;
    @FXML
    private Button btnAgregar;
    @FXML
    private TextField txtNombre;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnModificar;
    @FXML
    private TextArea txtADescripcion;
    
    GeneroController gestor = new GeneroController();

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void agregarGenero (ActionEvent event)  throws Exception {
        
        gestor.registrarGenero(txtNombre.getText(),txtADescripcion.getText());
        
    }
    
}
