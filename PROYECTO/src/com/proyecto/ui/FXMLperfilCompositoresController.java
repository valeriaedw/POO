/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ui;

import com.proyecto.bl.Compositores.Compositor;
import com.proyecto.tl.Compositores.CompositorController;
import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class FXMLperfilCompositoresController implements Initializable {

    @FXML
    private TableView <Compositor> tablaCompositores;
    @FXML
    private TableColumn <Compositor, String>nombreCL;
    @FXML
    private TableColumn <Compositor, String>apellidoCL;
    @FXML
    private TableColumn <Compositor, String>paisCL;
    @FXML
    private TableColumn <Compositor, String>edadCL;
    @FXML
    private Button btnAgregar;
    @FXML
    private TextField txtNombre;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnModificar;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtEdad;
    @FXML
    private DatePicker dpNacimiento;
    @FXML
    private ComboBox cbPais;
    ObservableList<String> listaCombo = FXCollections.observableArrayList();
    
    ObservableList<Compositor> compositores;
    CompositorController gestor = new CompositorController();

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //Lista paises en comboBox
        listaCombo.add("Costa Rica");
        listaCombo.add("Panamá");
        listaCombo.add("Ecuador");
        listaCombo.add("Guatemala");
        listaCombo.add("México");
        cbPais.setItems(listaCombo);
        
        //LISTAR
        compositores = FXCollections.observableArrayList();
        
        try {
            compositores = FXCollections.observableArrayList(gestor.listarCompositores());
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        nombreCL.setCellValueFactory(new PropertyValueFactory<Compositor, String>("nombre"));
        apellidoCL.setCellValueFactory(new PropertyValueFactory<Compositor, String>("apellido"));
        paisCL.setCellValueFactory(new PropertyValueFactory<Compositor, String>("paisNacimiento"));
        edadCL.setCellValueFactory(new PropertyValueFactory<Compositor, String>("edad"));
        
        tablaCompositores.setItems(compositores);
    }
    
    @FXML
    private void calcularEdad (ActionEvent event) {
        
        //Fecha que ponen y fecha de hoy
        LocalDate date = dpNacimiento.getValue();
        LocalDate now = LocalDate.now();
        //Se calculan los años
        int edad = Period.between(date, now).getYears();
        //Se imprimen los años en el campo de edad
        txtEdad.setText(Integer.toString(edad));
    }

    @FXML
    private void agregarCompositor(ActionEvent event) {
        
        gestor.registrarCompositor(txtNombre.getText(), txtApellido.getText(), cbPais.getValue().toString(), dpNacimiento.getValue(),Integer.parseInt(txtEdad.getText()));    
    }

    
    
}
