package GesEcole.Views;
import Entity.Prof;
import Services.profService;
import java.util.Scanner;
 
public class profView {
profService service =new profService();
Scanner sc=new Scanner(system.in);

//methode pour a=saisir et ajouter un prof 
public void ajouterProf(){
    System.out.println("--- Ajouter un Professeur ---");
 
        System.out.print("Nom        : ");
        String nom = sc.nextLine();
 
        System.out.print("Prénom     : ");
        String prenom = sc.nextLine();
 
        System.out.print("Email      : ");
        String email = sc.nextLine();
 
        System.out.print("Grade      : ");
        String grade = sc.nextLine();
 
        System.out.print("Spécialité : ");
        String specialite = sc.nextLine();

        // On crée l'objet Prof
        Prof p = new Prof(nom, prenom, email, grade, specialite);
 
        // On l'envoie au service pour le stocker
        service.ajouter(p);
 
        System.out.println("Prof ajouté avec succès !");

}
}
