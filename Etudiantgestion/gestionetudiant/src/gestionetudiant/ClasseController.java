/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiant;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.security.Provider.Service;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Classe;
import model.Etudiant;
import static sun.net.www.MimeTable.loadTable;


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
    

     /*
       Mes attributs
    */
    private metier.Service service;
    //ObservableList
     ObservableList<Classe> obClasses;
     ObservableList<Etudiant> obEtudiants;
    @FXML
    private TextField txtlibelle;
    @FXML
    private TextField txtNbreEtudiant;
    @FXML
    private TableView<Classe> tblvClasse;
    @FXML
    private TableColumn<Classe, String> tblcId;
    @FXML
    private TableColumn<Classe, String> tblcLibelle;
    @FXML
    private TableColumn<Classe, String> tblcNbreEtudiant;
    @FXML
    private TableView<Etudiant> tblvEtudiant;
    @FXML
    private TableColumn<Etudiant, String> tblcEtuId;
    @FXML
    private TableColumn<Etudiant, String> tblcNomPrenom;
    @FXML
    private TableColumn<Etudiant, String> tblcTuteur;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       metier=new metier.Service();
       //Chargement de ObservableList à partir de List de Classe
       obClasses=FXCollections.
                 observableArrayList(
                          metier.listerClasse()
               );
          loadTable();
    }

    private void loadTable(){
         //Construction des cellule de Table
       tblcId.setCellValueFactory(new PropertyValueFactory<>("id"));
       tblcLibelle.setCellValueFactory(new PropertyValueFactory<>("libelle"));
       tblcNbreEtudiant.setCellValueFactory(new PropertyValueFactory<>("nbre"));
       //TableView se Souscrit à L'observable
       tblvClasse.setItems(obClasses);
    }
    

    @FXML
    private void handleCreerClasse(ActionEvent event) {
        String libelle=txtLibelle.getText();
        int nbre=Integer.parseInt(txtNbreEtudiant.getText());
        Classe cl=new Classe(libelle, nbre);
        if(metier.creerClasse(cl)){
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Classe ajoutée avec success");
            alert.setTitle("Information");
            alert.show();
            //Mettre Jour la Table View
             obClasses.add(cl);
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Erreur Insertion");
            alert.setTitle("Erreur");
            alert.show();
        }
        
    }

    @FXML
    private void handleShowEtudiant(javafx.scene.input.MouseEvent event) {
        //Recuperer la Classe Selectionnée
        Classe classeSelected=tblvClasse
                              .getSelectionModel()
                              .getSelectedItem();
        obEtudiants=FXCollections
                .observableArrayList(
                        metier.listerEtudiantParClasse(classeSelected)
                );
        //Construire les colonnes
        tblcEtuId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tblcNomPrenom.setCellValueFactory(new PropertyValueFactory<>("nomComplet"));
        tblcTuteur.setCellValueFactory(new PropertyValueFactory<>("tuteur"));
        //Souscription
        tblvEtudiant.setItems(obEtudiants);
    }
}
