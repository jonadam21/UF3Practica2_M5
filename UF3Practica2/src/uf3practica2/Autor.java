package uf3practica2;

import java.time.LocalDate;

public class Autor {

    private String nom;

    private String nacionalidad;

    private LocalDate dataNaixement;

    public Autor(String nom, String nacionalidad, LocalDate dataNaixement) {
        this.nom = nom;
        this.nacionalidad = nacionalidad;
        this.dataNaixement = dataNaixement;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(LocalDate dataNaixement) {
        this.dataNaixement = dataNaixement;
    }
    
    
}
