package uf3practica2;


import uf3practica2.Llibre;

public class CopiaLlibre extends Llibre {

    private String Identificador;

    private String estatCopia;

    public CopiaLlibre(String nom, String tipus, String editorial, Autor autor) {
        super(nom, tipus, editorial, autor);
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public String getEstatCopia() {
        return estatCopia;
    }

    public void setEstatCopia(String estatCopia) {
        this.estatCopia = estatCopia;
    }

    @Override
    public String toString() {
        return "CopiaLlibre{" + "Identificador=" + Identificador + ", estatCopia=" + estatCopia + '}';
    }
    
    
}
