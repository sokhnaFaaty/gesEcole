package GesEcole.Services;
import GesEcole.Entity.Prof;
public class profService {
    public Prof[] profs=new Prof[100];
    public int nbProfs=0;
    
    public void ajouter(Prof p){
        profs[nbProfs]=p;
        nbProfs++;
    }

    public void listerProfs() {
    for (int i = 0; i < nbProfs; i++) {
        profs[i].afficherInfo();
        System.out.println("------------------");
    }
}
}
