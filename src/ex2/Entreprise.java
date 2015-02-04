/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Maxime BLAISE
 */
public class Entreprise implements Iterable<Employe>{

    /**
     * Nom de l'entreprise.
     */
    private String nom;

    /**
     * Liste des employés.
     */
    private ArrayList<Employe> listeEmployes;

    /**
     * Créer une entreprise à partir de son nom.
     *
     * @param nom
     */
    public Entreprise(String nom) {
        this.nom = nom;
        this.listeEmployes = new ArrayList<>();
    }
    
    /**
     * Méthode d'ajout d'un employé.
     * 
     * @param str Nom de l'employé
     */
    public void ajoutEmploye(String str) {
        this.listeEmployes.add(new Employe(str));
    }
    
    /**
     * Méthode d'ajout d'un employé.
     * 
     * @param str Nom de l'employé
     * @param salaire salaire de l'employé
     */
    public void ajoutEmploye(String str, int salaire) {
        this.listeEmployes.add(new Employe(str, salaire));
    }
    
    /**
     * Méthode qui décrit une entreprise 
     * En affichant son nom, et le nom de tous ses employés
     * 
     * @return ...
     */
    @Override
    public String toString() {
        // Nom de l'entreprise
        String res = "Nom de l'entreprise : " + nom + "\n\nListe des employes : \n";
        
        // Liste de ses employés
        for(Employe e : listeEmployes) {
            res += e.toString();
        }
        
        return res;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Employe> getListeEmployes() {
        return listeEmployes;
    }

    public void setListeEmployes(ArrayList<Employe> listeEmployes) {
        this.listeEmployes = listeEmployes;
    }

    @Override
    public Iterator<Employe> iterator() {
        return listeEmployes.iterator();
    }

    public static void main(String[] args) {
        // Création d'une nouvelle entreprise
        Entreprise entreprise = new Entreprise("BlaiseInfo");
        // Ajout d'employés dans l'entreprise
        entreprise.ajoutEmploye("Maxime", 50000);
        entreprise.ajoutEmploye("Denniiss", 20000);
        
        // Parcours pour affichage
        int salaire = 0;
        for(Employe e : entreprise) {
            salaire+=e.getSalaire();
        }
        
        System.out.println("Salaires : " + salaire);
    }

}
