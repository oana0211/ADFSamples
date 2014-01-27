package test.model;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String nume;
    private List<Persoana> persoane;

    public Group() {
        super();

        populareGrupuri();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setPersoane(List<Persoana> persoane) {
        this.persoane = persoane;
    }

    public List<Persoana> getPersoane() {
        return persoane;
    }

    private void populareGrupuri() {

        persoane = new ArrayList<Persoana>();
        for (int i = 0; i < 8; i++) {
            Persoana p = new Persoana();
            p.setNume("Test" + i);

            List<Masina> listaMasini = new ArrayList<Masina>();
            for (int j = 0; j < 3; j++) {
                Masina m = new Masina();
                m.setMarca("Fiat" + j);
                m.setIsNoua(true);
                listaMasini.add(m);
            }

            p.setListaMasini(listaMasini);
            persoane.add(p);
        }

    }
}
