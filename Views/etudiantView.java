package GesEcole.Views;


import Entity.Etudiant;
import Services.etudiantService;
import java.util.Scanner;

public class etudiantView {
    etudiantService service = new etudiantService();
    Scanner sc = new Scanner(System.in);

    public void ajouterEtudiant() {
        System.out.println("--- Ajouter un Etudiant ---");

        System.out.print("Nom        : ");
        String nom = sc.nextLine();

        System.out.print("Prénom     : ");
        String prenom = sc.nextLine();

        System.out.print("Email      : ");
        String email = sc.nextLine();

        System.out.print("Matricule  : ");
        String matricule = sc.nextLine();

        System.out.print("Filière    : ");
        String filiere = sc.nextLine();

        Etudiant e = new Etudiant(nom, prenom, email, matricule, filiere);
        service.ajouter(e);

        System.out.println("Etudiant ajouté avec succès !");
    }

}
