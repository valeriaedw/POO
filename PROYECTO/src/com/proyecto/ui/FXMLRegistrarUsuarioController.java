/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ui;

import com.proyecto.tl.Personas.PersonaController;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Valeria
 */
public class FXMLRegistrarUsuarioController implements Initializable {

    //Variable para subir foto
    @FXML
    private ImageView imgView;
    List<String> files;
    //Variables para calcular edad
    @FXML
    private DatePicker dpNacimiento;
    @FXML
    private TextField txtEdad;
    //Variables
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtapellido1;
    @FXML
    private TextField txtapellido2;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField pwdContrasenia;
    @FXML
    private Label lblTitulo;
   
    //Variables paises
    @FXML
    private ComboBox cbPais;
    ObservableList<String> listaCombo = FXCollections.observableArrayList();

    //Para validar formulario
    static boolean admin;

    //Controller
    PersonaController gestor = new PersonaController();

    //Metodo para subir foto
    public void subirFoto(ActionEvent event) {
        //Crear objeto FileChooser
        FileChooser fc = new FileChooser();

        //Agrgare filtro para busqueda
        fc.getExtensionFilters().add(new ExtensionFilter("images", files));
        fc.setTitle("Buscar Imagen");

        //Obtener la imagen seleccionada
        File f = fc.showOpenDialog(null);

        //Mostrar la imagen
        if (f != null) {

            Image image = new Image("file:" + f.getAbsolutePath());
            imgView.setImage(image);
        }
    }

    //Metodo para calcular edad 
    public void calcularEdad(ActionEvent event) {
        //Fecha que ponen y fecha de hoy
        LocalDate date = dpNacimiento.getValue();
        LocalDate now = LocalDate.now();
        //Se calculan los años
        int edad = Period.between(date, now).getYears();
        //Se imprimen los años en el campo de edad
        txtEdad.setText(Integer.toString(edad));

    }

    //Metodo que valida campos vacíos 
    public void validaVacio() {

        if (txtId.getText().isEmpty() || txtNombre.getText().isEmpty()
                || txtapellido1.getText().isEmpty() || txtId.getText().isEmpty()
                || txtCorreo.getText().isEmpty() || txtUsername.getText().isEmpty()
                || pwdContrasenia.getText().isEmpty() || dpNacimiento.getValue() == null || txtEdad.getText().isEmpty()) {

            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Validación de datos");
            alert.setHeaderText(null);
            alert.setContentText("Oops...Algunos espacios quedaron vacíos!");
            alert.showAndWait();
        } else {

            Alert alert = new Alert(AlertType.NONE);
            alert.setTitle("Registrado");
            alert.setContentText("Se ha registrado con éxito!");
            alert.getButtonTypes().clear();
            ButtonType boutonOk = new ButtonType("Ok");
            alert.getButtonTypes().add(boutonOk);
            alert.showAndWait();

        }
    }

    //Metodo para validar contrasenia prueba
    public void validaContrasenia() {
        //Define el patron de busqueda 
        Pattern p = Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%*!]).{8,12})");
        //Busca si el texto coincide con el patron definido
        Matcher m = p.matcher(pwdContrasenia.getText());

        if (m.matches()) {

        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Revisar Contraseña");
            alert.setHeaderText(null);
            alert.setContentText("La contraseña debe tener mínimo 8 carácteres y máximo 12, donde se incluya al menos: una minúscula, una MAYÚSCULA y un carácter especial (@#$%*!)");
            alert.showAndWait();
        }
    }

    public void botonRegistrar() {

        if (admin == false) {

            gestor.registroUsuario(txtId.getText(), txtNombre.getText(), txtapellido1.getText(), txtapellido2.getText(), "", txtCorreo.getText(), txtUsername.getText(), pwdContrasenia.getText(), null, 0, "", "admin");
        } else {
            gestor.registroUsuario(txtId.getText(), txtNombre.getText(), txtapellido1.getText(), txtapellido2.getText(), "", txtCorreo.getText(), txtUsername.getText(), pwdContrasenia.getText(), dpNacimiento.getValue(), Integer.parseInt(txtEdad.getText()), cbPais.getValue().toString(), "cliente");
        }
    }
    
    public void botonCancelar(ActionEvent event) throws IOException{
       
        Parent blah = FXMLLoader.load(getClass().getResource("FXMLinicio.fxml"));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();   
        
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        boolean validarAdmin = false;
        try {
            validarAdmin = gestor.validarAdmin();

            admin = validarAdmin;
            if (validarAdmin == false) {

                dpNacimiento.setVisible(false);
                cbPais.setVisible(false);
                txtEdad.setVisible(false);
                lblTitulo.setText("CREAR EL ADMIN");
            }
        } catch (Exception ex) {
            Logger.getLogger(FXMLRegistrarUsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Tipos de archivo de foto que va a recibir
        files = new ArrayList<>();
        files.add("*.jpg");
        files.add("*.jpeg");
        files.add("*.png");
        files.add("*.JPG");
        files.add("*.JPEG");
        files.add("*.PNG");

        //Lista paises en comboBox
        listaCombo.add("Costa Rica");
        listaCombo.add("Panamá");
        listaCombo.add("Ecuador");
        listaCombo.add("Guatemala");
        listaCombo.add("México");
        cbPais.setItems(listaCombo);

    }

}
