/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ui;

import com.proyecto.bl.Artistas.Artista;
import com.proyecto.tl.Artistas.ArtistaController;
import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Valeria
 */
public class FXMLperfilArtistasController implements Initializable {

    @FXML
    private TextField txtNombre;
    @FXML
    private DatePicker dpNacimiento;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtNombreArtista;
    @FXML
    private DatePicker dpDefuncion;
    @FXML
    private TextField txtEdad;
    @FXML
    private ComboBox cbPais;
    @FXML
    private ComboBox cbGenero;
    @FXML
    private TableView<Artista> tablaArtistas;
    @FXML
    private TableColumn<Artista, String> nombreCL;
    @FXML
    private TableColumn<Artista, String> apellidoCL;
    @FXML
    private TableColumn<Artista, String> artistaCL;
    @FXML
    private TableColumn<Artista, String> fechaNCL;
    @FXML
    private TableColumn<Artista, String> fechaDCL;
    @FXML
    private TableColumn<Artista, String> edadCL;
    @FXML
    private TableColumn<Artista, String> paisCL;
    @FXML
    private TableColumn<Artista, String> generoCL;
    @FXML
    private TableColumn<Artista, String> descripcionCL;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnAgregar;
    @FXML
    private TextArea taDescripcion;

    ObservableList<String> listaGenero = FXCollections.observableArrayList();
    ObservableList<String> listaPais = FXCollections.observableArrayList();
    ObservableList<Artista> artistas;

    ArtistaController gestor = new ArtistaController();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        try {
            //Llenar Generos
            listaGenero = FXCollections.observableArrayList(gestor.llenarGeneros());
        } catch (Exception ex) {
            Logger.getLogger(FXMLperfilArtistasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        cbGenero.setItems(listaGenero);

        //Llenar Paises
        listaPais.add("Estados Unidos");
        listaPais.add("Mexico");
        listaPais.add("Inglaterra");
        listaPais.add("Argentina");
        listaPais.add("Rusia");
        listaPais.add("Francia");
        cbPais.setItems(listaPais);
        
        //Listar Artistas
            
        try {
                
           artistas = FXCollections.observableArrayList(gestor.listarArtistas()); 
                
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        nombreCL.setCellValueFactory(new PropertyValueFactory<Artista,String>("nombre"));
        apellidoCL.setCellValueFactory(new PropertyValueFactory<Artista,String>("apellido"));
        artistaCL.setCellValueFactory(new PropertyValueFactory<Artista,String>("nombreArtistico"));
        fechaNCL.setCellValueFactory(new PropertyValueFactory<Artista,String>("fechaNacimiento"));
        fechaDCL.setCellValueFactory(new PropertyValueFactory<Artista,String>("fechaDefuncion"));
        edadCL.setCellValueFactory(new PropertyValueFactory<Artista,String>("edad"));
        paisCL.setCellValueFactory(new PropertyValueFactory<Artista,String>("paisNacimiento"));
        generoCL.setCellValueFactory(new PropertyValueFactory<Artista,String>("genero"));
        descripcionCL.setCellValueFactory(new PropertyValueFactory<Artista,String>("descripcion"));
        
        tablaArtistas.setItems(artistas);

    }

    public void calcularEdad(ActionEvent event) {
        //Fecha que ponen y fecha de hoy
        LocalDate date = dpNacimiento.getValue();
        LocalDate now = LocalDate.now();
        //Se calculan los años
        int edad = Period.between(date, now).getYears();
        //Se imprimen los años en el campo de edad
        txtEdad.setText(Integer.toString(edad));

    }

    @FXML
    private void agregarCancion(ActionEvent event) {
        try {
            gestor.registroArtista(txtNombre.getText(), txtApellido.getText(), txtNombreArtista.getText(), dpNacimiento.getValue(), dpDefuncion.getValue(), Integer.parseInt(txtEdad.getText()), cbPais.getValue().toString(), cbGenero.getValue().toString(), taDescripcion.getText());
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

}
