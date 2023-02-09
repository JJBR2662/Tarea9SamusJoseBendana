package tarea9samusjosebendaña;

public class Dark extends Beam{
    private double veldisparo;
    private int municion;

    public Dark() {
        super();
    }

    public Dark(double veldisparo, int municion, String tipocarga, double peso, int watts) {
        super(tipocarga, peso, watts);
        this.veldisparo = veldisparo;
        this.municion = municion;
    }

    public double getVeldisparo() {
        return veldisparo;
    }

    public void setVeldisparo(double veldisparo) {
        this.veldisparo = veldisparo;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    @Override
    public int muni(){
        return municion;
    }
    @Override
    public String toString() {
        return super.toString()+" Dark{" + "veldisparo=" + veldisparo + ", municion=" + municion + '}';
    }

    @Override
    public Traje atacar(Traje samus) {
        samus.setMedirfuerza(samus.getMedirfuerza()-2);
        return samus;
    }
    
    
    
    
}
