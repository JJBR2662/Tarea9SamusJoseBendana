package tarea9samusjosebendaña;

public class Plasma extends Beam{

    private int litros, tiempocarga, disparosseguidos;

    public Plasma() {
        super();
    }

    public Plasma(int litros, int tiempocarga, int disparosseguidos, String tipocarga, double peso, int watts) {
        super(tipocarga, peso, watts);
        this.litros = litros;
        this.tiempocarga = tiempocarga;
        this.disparosseguidos = disparosseguidos;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public int getTiempocarga() {
        return tiempocarga;
    }

    public void setTiempocarga(int tiempocarga) {
        this.tiempocarga = tiempocarga;
    }

    public int getDisparosseguidos() {
        return disparosseguidos;
    }

    public void setDisparosseguidos(int disparosseguidos) {
        this.disparosseguidos = disparosseguidos;
    }

    @Override
    public String toString() {
        return super.toString()+" Plasma{" + "litros=" + litros + ", tiempocarga=" + tiempocarga + ", disparosseguidos=" + disparosseguidos + '}';
    }
    
    @Override
    public int muni(){
        return disparosseguidos;
    }
    
    @Override
    public Traje atacar(Traje samus) {
        samus.setMediroxido(samus.getMediroxido()+ 0.5);
        samus.setMedircarga(samus.getMedircarga()- 0.5);
        return samus;   
    }
    
    
    
    
}
