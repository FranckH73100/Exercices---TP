package testpackage;

import java.util.Scanner;

public class Testdivers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e'}, reponse = ' ';

        do{
            int i =0;
            System.out.println("tapez un entier entre 1 et " + tableauCaractere.length);
            i = sc.nextInt();
            sc.nextLine();
            if (i <= tableauCaractere.length) {
                System.out.println("la lettre correspondate est :" + tableauCaractere[i -= 1]);
            }else {System.out.println("le nombre doit être compris entre 1 et " + tableauCaractere.length);
            }
            do {
                System.out.println("Voulez vous essayer à nouveau ? O/N");
                reponse = sc.nextLine().charAt(0);
            } while (reponse != 'O' && reponse != 'N');
        } while (reponse == 'O');
    }
}

