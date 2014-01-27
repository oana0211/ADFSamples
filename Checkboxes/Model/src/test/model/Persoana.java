package test.model;

import java.util.ArrayList;
import java.util.List;

public class Persoana {
    
    private String nume;
    private List<Masina> listaMasini;
    
    public Persoana() {
      
        super();
        
        populareListaMasini();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setListaMasini(List<Masina> listaMasini) {
        this.listaMasini = listaMasini;
    }

    public List<Masina> getListaMasini() {
        return listaMasini;
    }
    
    private void populareListaMasini(){
        
        listaMasini = new ArrayList<Masina>();
        for (int i=0; i< 5; i++){
            Masina m = new Masina();
            m.setIsNoua(true);    
            m.setMarca("Ford" + i);
            listaMasini.add(m);
        }
    }
}
