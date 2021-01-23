/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiant;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import metier.Service;
import model.Classe;


/**
 * FXML Controller class
 *
 * @author user
 */
public class ClasseController implements Initializable {

    @FXML
    private Button handleCreerClasse;
    private TextField txtLibelle;
    private TextField txtNbre;
    private Service metier;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        metier=new Service();
    }    
    private void handleCreerClasse(ActionEvent event){
        String libelle=txtLibelle.getText();
        int nbre=Integer.parseInt(txtNbre.getText());
        Classe cl=new Classe(libelle, nbre);
        if(metier.creerClasse(cl)){
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Classe ajoutée avec succés");
            alert.setTitle("Information");
            alert.show();
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Erreur Insertion");
            alert.setTitle("Erreur");
            alert.show();
        }
    }
}
