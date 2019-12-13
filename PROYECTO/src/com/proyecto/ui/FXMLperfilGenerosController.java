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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class FXMLperfilGenerosController implements Initializable {

    @FXML
    private TableView<Genero> tablaGeneros;
    @FXML
    private TableColumn <Genero,String> nombreCL;
    @FXML
    private TableColumn <Genero,String> descripcionCL;
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
    
    ObservableList<Genero> generos;
    GeneroController gestor = new GeneroController();

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        generos = FXCollections.observableArrayList();
        
        try {
            generos = FXCollections.observableArrayList(gestor.listarGeneros());
        } catch (Exception e) {
            
            Logger.getLogger(FXMLperfilGenerosController.class.getName()).log(Level.SEVERE, null, e);
        }
        
        nombreCL.setCellValueFactory(new PropertyValueFactory <Genero,String>("nombre"));
        descripcionCL.setCellValueFactory(new PropertyValueFactory <Genero,String>("descripcion"));
        
        tablaGeneros.setItems(generos);
    }    

    @FXML
    private void agregarGenero (ActionEvent event)  throws Exception {
        
        gestor.registrarGenero(txtNombre.getText(),txtADescripcion.getText());
        
    }
    
}
