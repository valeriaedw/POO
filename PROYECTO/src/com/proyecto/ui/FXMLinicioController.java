/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;


public class FXMLinicioController implements Initializable {

    @FXML private MenuItem mnInicio;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    
    
    public void abreRegistro(ActionEvent event) throws IOException{
        
        Parent blah = FXMLLoader.load(getClass().getResource("FXMLregistrarUsuario.fxml"));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();   
    }
    
    
    public void abreLogin(ActionEvent event) throws IOException{
        
        Parent blah = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();   
    }
    
  
    
    
    
}
