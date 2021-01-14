/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours.list;

import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author acer
 */
public class Exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        1-creer une liste String
        2-ajouter des elements
        4-supprimer des elements
        3-affichage de la liste
        5-modifier un element de la liste
        6-rechercher un element de la liste
        */
        //1-creer une liste String
        List<String> lString=new ArrayList();
        //2-ajouter des elements
        lString.add("Bonjour");
        lString.add("Au Revoir");
        lString.add("Les Etudiants de la Liage 3");
       //3-affichage de la list
        //Methode1
        for(String elt:lString){
            System.out.println(elt);
        }
        lString.add(0, "Debut");
        lString.forEach((elt) -> {
            System.out.println(elt);
        });
        //4-supprimer des elements
        lString.remove("Debut");
        lString.remove(2);
        System.out.println("Affichage apres Suppression");
        lString.forEach((elt) -> {
            System.out.println(elt);
        });
        //5-modifier un element de la liste
        lString.set(0, "Bonsoir");
        System.out.println("Affichage apres Modification");
        lString.forEach((elt) -> {
            System.out.println(elt);
        });
        //6-rechercher un element de la liste
        if(lString.contains("Bonsoir")==true){
            System.out.println("Element existe");   
        }else{
            System.out.println("Element n'existe pas");
        }
        
        
        
        
        
    }
    
}
