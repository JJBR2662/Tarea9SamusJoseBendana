package tarea9samusjosebendaña;

public class Regularmisil extends Misiles{
    private double tamanio;

    public Regularmisil() {
        super();
    }

    public Regularmisil(double tamanio, double velocidad, double poderexplosivo) {
        super(velocidad, poderexplosivo);
        this.tamanio = tamanio;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return super.toString()+" Regularmisil{" + "tamanio=" + tamanio + '}';
    }
    
    @Override
    public Traje atacar(Traje samus){
        samus.setMedirfuerza(samus.getMedirfuerza()-0.1);
        return samus;
    }
}
