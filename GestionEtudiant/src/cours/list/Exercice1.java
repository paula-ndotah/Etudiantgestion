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
 * @author user
 */
public class Exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            1-creer une liste String
            Ajouter des elements
            Supprimer des elements
            Affichage de la liste
            Modifier un element de la liste
            Rechercher un element de la liste
        
        */
        //1-creer une liste String
        List<String> lString=new ArrayList();
        
        //2-ajouter des elements
        lString.add("Bonjour");
        lString.add("Au revoir");
        lString.add("les Etudiants de la Liage 3");
        
        //3- Affichage de la liste
        //Methode1
        lString.forEach((elt) -> {
            System.out.println(elt);
        });
            lString.add(0, "Debut");
            lString.forEach((elt) -> {
                System.out.println(elt);
        });
        
        //4- Supprimer les elements
        lString.remove("Debut");
        lString.remove(2);
        System.out.println("Affichage après supression");
        lString.forEach((elt) -> {
            System.out.println(elt);
        });
        
        //5-modifier un element de la liste
        lString.set(0, "Bonsoir");
        System.out.println("Affichage apres modification");
        lString.forEach((elt) -> {
            System.out.println(elt);
        });
        
        //6-rechercher un element de la liste
        if(lString.contains("Bonsoir")==true){
            System.out.println("Element existe");
        }else{
            System.out.println("Element Pas Exite");
        }
    }
    
}
