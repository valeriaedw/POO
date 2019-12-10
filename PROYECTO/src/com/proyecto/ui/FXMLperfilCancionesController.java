/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ui;

import com.proyecto.bl.Canciones.Cancion;
import com.proyecto.tl.Canciones.CancionController;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;

public class FXMLperfilCancionesController implements Initializable {

    @FXML
    private TextField txtNombre;
    private DatePicker dpLanzamiento;
    private TextField txtCalificacion;
    private TextField txtPrecio;
    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnModificar;
    private Label lblCancion;
    List<String> files;

    //Atributos de la table
    @FXML
    private TableView<Cancion> tablaCanciones;
    @FXML
    private TableColumn <Cancion,String> nombreCL;
    @FXML
    private TableColumn <Cancion,String> generoCL;
    @FXML
    private TableColumn <Cancion,String>artistaCL;
    @FXML
    private TableColumn <Cancion,String>fechaCL;
    @FXML
    private TableColumn <Cancion,String>precioCL;
    @FXML
    private TableColumn <Cancion,String> calificacionCL;
    @FXML
    private TableColumn <Cancion,String> reproducirCL;

    ObservableList<Cancion> canciones;

    

    CancionController gestor = new CancionController();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //Tipos de archivo de foto que va a recibir
        files = new ArrayList<>();
        files.add("*.mp3");
        files.add("*.MP3");
        files.add("*.mp4");
        files.add("*.MP4");
        files.add("*.WAV");
        files.add("*.wav");
        
        //Lista tabla
        canciones = FXCollections.observableArrayList();
        
        //canciones = gestor.listarCanciones();
      
        nombreCL.setCellValueFactory(new PropertyValueFactory<Cancion,String>("nombre"));
        generoCL.setCellValueFactory(new PropertyValueFactory<Cancion,String>("genero"));
        artistaCL.setCellValueFactory(new PropertyValueFactory<Cancion,String>("artista"));
        fechaCL.setCellValueFactory(new PropertyValueFactory<Cancion,String>("fecha"));
        precioCL.setCellValueFactory(new PropertyValueFactory<Cancion,String>("precio"));
        calificacionCL.setCellValueFactory(new PropertyValueFactory<Cancion,String>("calificacion"));
        reproducirCL.setCellValueFactory(new PropertyValueFactory<Cancion,String>("cancion"));
        
        tablaCanciones.setItems(canciones);
        
    }

    public void subirCancion(ActionEvent event) throws FileNotFoundException {
        //Crear objeto FileChooser
        FileChooser fc = new FileChooser();

        //Agrgare filtro para busqueda
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Music", files));
        fc.setTitle("Buscar Cancion");

        //Obtener la ruta seleccionada
        File f = fc.showOpenDialog(null);

        if (f != null) {

            lblCancion.setText(f.getAbsolutePath());
        }
    }

    @FXML
    public void agregarCancion() throws Exception {

        gestor.registroCancion(lblCancion.getText(), txtNombre.getText(), "genero", "artista", "compo", dpLanzamiento.getValue(), "", "estado", Double.parseDouble(txtPrecio.getText()), Integer.parseInt(txtCalificacion.getText()));

    }

}
