package testpackage;

import java.util.Scanner;

public class RechercheTableau {
    public static void main(String[] args) {
        char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int i = 0;
        char reponse = ' ',carac = ' ';
        Scanner sc = new Scanner(System.in);
        do {//boucle principale
            do {//repetition tant que lettre du tableau non saisie
                i = 0;
                System.out.println("Entrez une lettre en minuscule SVP.");
                carac = sc.nextLine().charAt(0);
                //boucle de recherche dans le tableau
                while (i < tableauCaractere.length && carac != tableauCaractere[i]) {
                    i++;
                }
                // si i<7 c'est que la boucle n'a pas dépassé le nb de cases du tableau
                if (i < tableauCaractere.length) {
                    System.out.println("La lettre " + carac + " se trouve bien dans le tableau.");
                }else{
                    System.out.println("La lettre " + carac + " ne se trouve pas dans le tableau.");
                }
            }while (i >= tableauCaractere.length);
           do {
                System.out.println("Voulez vous essayer à nouveau ? O/N");
                reponse = sc.nextLine().charAt(0);
            }while (reponse != 'O' && reponse != 'N');
        }while (reponse == 'O');
        System.out.println("Au revoir !");
    }
}

