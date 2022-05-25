package uf3practica2;

public class Llibre {

    private String nom;

    private String tipus;

    private String editorial;

    private Autor autor;

    public Llibre(String nom, String tipus, String editorial, Autor autor) {
        this.nom = nom;
        this.tipus = tipus;
        this.editorial = editorial;
        this.autor = autor;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString() {
        return "Llibre{" + "nom=" + nom + ", tipus=" + tipus + ", editorial=" + editorial + ", autor=" + autor + '}';
    }
  
}
