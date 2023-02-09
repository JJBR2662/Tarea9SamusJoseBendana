package tarea9samusjosebendaña;

public abstract class Beam {
    protected String tipocarga;
    protected double peso;
    protected int watts;

    public Beam() {
    }

    public Beam(String tipocarga, double peso, int watts) {
        this.tipocarga = tipocarga;
        this.peso = peso;
        this.watts = watts;
    }

    public String getTipocarga() {
        return tipocarga;
    }

    public void setTipocarga(String tipocarga) {
        this.tipocarga = tipocarga;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }
    
    public abstract int muni();

    @Override
    public String toString() {
        return "Beam{" + "tipocarga=" + tipocarga + ", peso=" + peso + ", watts=" + watts + '}';
    }
    
    public abstract Traje atacar(Traje samus);
}
