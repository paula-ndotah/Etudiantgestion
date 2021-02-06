/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author user
 */
public interface IDao <T>{
    /*
     public int insert(Classe classe)
     public int insert(Personne pers)
     public int insert(Details details)
    //Genericité : Possibilité d'avoir des arguments dont le type est variable
    //interface=contrat contenant des méthodes abstraites
    
    */
    public int insert (T objet);
}
