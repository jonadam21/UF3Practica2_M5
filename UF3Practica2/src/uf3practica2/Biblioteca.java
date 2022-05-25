package uf3practica2;


import java.util.ArrayList;
import java.util.List;
import uf3practica2.CopiaLlibre;
import uf3practica2.Lector;
import uf3practica2.Llibre;

public class Biblioteca {

    private List<Llibre> llibres = new ArrayList();

    private List<CopiaLlibre> copies = new ArrayList();

    private List<Lector> lectors = new ArrayList();

    public List<Llibre> getLlibres() {
        return llibres;
    }

    public void setLlibres(List<Llibre> llibres) {
        this.llibres = llibres;
    }

    public List<CopiaLlibre> getCopies() {
        return copies;
    }

    public void setCopies(List<CopiaLlibre> copies) {
        this.copies = copies;
    }

    public List<Lector> getLectors() {
        return lectors;
    }

    public void setLectors(List<Lector> lectors) {
        this.lectors = lectors;
    }
    
    
}
