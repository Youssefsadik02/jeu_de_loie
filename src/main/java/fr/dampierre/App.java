package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
    Scanner clavier= new Scanner (System.in);
    Random generateur = new Random();
    System.out.println("Bienvenu dans notre jeu, Le but est de parcourir les 20 cases du jeu avec 5 lancers d'un dé. Un dé à 6 faces sera donc lancé 5 fois. On fait toujours les 5 lancers. ");
    int i;
    int rest=0;
    int increment=0;
    for ( i=1; i<=5; i++){
         int nbreAleatoire= generateur.nextInt(6) + 1;
         increment+=nbreAleatoire;
         rest = 20-increment;
         System.out.print("Lancer "+i+" : vous avez fait "+ nbreAleatoire+ ". vous etes sur la case "+increment+ " (encore "+rest +" cases)");
         clavier.nextLine();
        
        }
    
    if (rest == 0) {
        System.out.println("Vous avez gagné!");
    
    }
    else {
        System.out.println("Vous avez perdu!");
    } 
    }
    
}
