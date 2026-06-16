package GesEcole.Entity;

public class Etudiant extends Personne {
    private String matricule;
    private String filiere;
 
    public Etudiant(String nom, String prenom, String email, String matricule, String filiere) {
        super(nom, prenom, email);
        this.matricule = matricule;
        this.filiere = filiere;
    }
 
    public String getMatricule() { return matricule; }
    public String getFiliere() { return filiere; }
 
    @Override
    public void afficherInfo() {
        System.out.println("=== ETUDIANT ===");
        System.out.println("Nom       : " + nom);
        System.out.println("Prénom    : " + prenom);
        System.out.println("Email     : " + email);
        System.out.println("Matricule : " + matricule);
        System.out.println("Filière   : " + filiere);
    }
}

