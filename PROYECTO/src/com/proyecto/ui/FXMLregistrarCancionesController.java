/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ui;

import com.proyecto.tl.Canciones.CancionController;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;


/**
 * FXML Controller class
 *
 * @author Valeria
 */
public class FXMLregistrarCancionesController implements Initializable {

    @FXML
    private TextField txtNombre;
    @FXML
    private ComboBox cbGenero;
    @FXML
    private ComboBox cbArtista;
    @FXML
    private ComboBox cbCompositor;
    @FXML
    private DatePicker dpLanzamiento;
    @FXML
    private TextField txtCalificacion;
    @FXML
    private TextField txtPrecio;
    @FXML
    private Button btnSubir;
    @FXML
    private Label lblCancion;
    List<String> files;
    
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
    }

    public void subirCancion(ActionEvent event) throws FileNotFoundException {
        //Crear objeto FileChooser
        FileChooser fc = new FileChooser();
  
        //Agrgare filtro para busqueda
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Music", files));
        fc.setTitle("Buscar Cancion");
        
        //Obtener la imagen seleccionada
        File f = fc.showOpenDialog(null);
        
        
        if (f != null) {
            
            lblCancion.setText(f.getAbsolutePath());    
        }    
    }
    
    public void agregarCancion() throws Exception{
        InputStream archivo = new ByteArrayInputStream(lblCancion.getText().getBytes());
        
        gestor.registroCancion(archivo,txtNombre.getText(),"genero","artista","compo", dpLanzamiento.getValue(),"","estado",Double.parseDouble(txtPrecio.getText()),Integer.parseInt(txtCalificacion.getText()));
        
    }
    
}
