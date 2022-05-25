package uf3practica2;

public class Lector {

    private String nom;

    private int MAXIM_LLIBRES;

    public Lector(String nom, int MAXIM_LLIBRES) {
        this.nom = nom;
        this.MAXIM_LLIBRES = MAXIM_LLIBRES;
    }
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMAXIM_LLIBRES() {
        return MAXIM_LLIBRES;
    }

    public void setMAXIM_LLIBRES(int MAXIM_LLIBRES) {
        this.MAXIM_LLIBRES = MAXIM_LLIBRES;
    }

    @Override
    public String toString() {
        return "Lector{" + "nom=" + nom + ", MAXIM_LLIBRES=" + MAXIM_LLIBRES + '}';
    }
    
    
}
