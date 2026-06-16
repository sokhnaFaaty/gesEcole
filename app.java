package GesEcole;

import Views.profView;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        profView pView = new profView();
        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n=== MENU GES ECOLE ===");
            System.out.println("1. Ajouter un Prof");
            System.out.println("6. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            if (choix == 1) {
                pView.ajouterProf();
            }

            if (choix == 3) {
                pView.afficherProfs();
            }

        } while (choix != 6);

        System.out.println("Au revoir !");
    }
}
