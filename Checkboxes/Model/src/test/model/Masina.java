package test.model;

public class Masina {
    
    private String marca;
    private boolean isNoua;
    
    public Masina() {
        super();
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setIsNoua(boolean isNoua) {
        this.isNoua = isNoua;
    }

    public boolean isIsNoua() {
        return isNoua;
    }
}
