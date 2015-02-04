/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Maxime
 * @param <E>
 */
public class Seq<E extends Comparable<E>> extends ArrayList<E> {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Seq<String> s = new Seq<>(); 
        s.add("le"); 
        s.add("petit"); 
        s.add("chat"); 
        s.add("est"); 
        s.add("sur"); 
        s.add("le"); 
        s.add("fauteuil"); 
        
        //s[le, petit, chat, est, dans, le, fauteuil]
        afficherListe(s);
        
        //s.occursAt(chat,2) retourne vrai 
        if(s.occursAt("chat", 2)) {
            System.out.println("Le chat se trouve bien à la position 2");
        } else {
            System.out.println("Le chat NE se trouve PAS à la position 2");
        }
        
        //s.find(le) retourne 0 
        System.out.println("Position de l'occurence le : "+s.find("le"));
        
        //s.countOccurrences(le) retourne 2 
        System.out.println("Nombre d'occurence de \"le\" : " + s.countOccurrences("le"));
        
        Seq<String> sous = new Seq<>(); 
        sous.add("bien");
        sous.add("assis"); 
        s.insert(4,sous); //s[le, petit, chat, est, bien, assis, dans, le, fauteuil]
        
        afficherListe(s);
    }
    
    /**
     * Méthode qui affiche la liste
     * 
     * @param s liste
     */
    public static void afficherListe(Seq s) {
        // Parcours pour affichage
        System.out.println("\nAffichage de la liste : ");
        System.out.println("------------------------");
        for(Iterator i = s.iterator() ; i.hasNext() ; ) {
            // Affichage
            System.out.println(i.next().toString());
        }
        System.out.println("");
    }

    /**
     * Méthode qui retourne vrai si s se trouve à la position pos
     *
     * @param s L'élément cherché
     * @param pos Position
     * @return vrai ou faux
     */
    public boolean occursAt(E s, int pos) {
        return this.get(pos).equals(s);
    }

    /**
     * Méthode qui retourne la position de la première occurrence de s dans la
     * séquence ou -1 si s n'est pas dans la séquence
     *
     * @param s l'élément
     * @return position
     */
    public int find(E s) {
        return this.indexOf(s);
    }

    /**
     * Méthode qui retourne le nombre d'occurrences de s dans la séquence
     *
     * @param s l'élément
     * @return nombre
     */
    public int countOccurrences(E s) {
        // Initialisation du nombre d'occurences
        int nombreOccurences = 0;
        
        // Parcours de la liste
        for(int i=0;i<this.size();i++) {
            // On compare
            if(this.occursAt(s, i)) {
                // On incrémente le nombre d'occurences
                nombreOccurences++;
            }
        }
        
        return nombreOccurences;
    }

    /**
     * Méthode insère la sous-séquence sseq à la position pos dans la séquence
     *
     * @param pos position
     * @param sseq sous-séquence
     */
    public void insert(int pos, Seq<E> sseq) {
        this.addAll(pos, sseq);
    }

}
