package tarea9samusjosebendaña;

public class Light extends Beam{
    private int numfotones, municion;
    private double velocidadshots;

    public Light() {
        super();
    }

    public Light(int numfotones, int municion, double velocidadshots, String tipocarga, double peso, int watts) {
        super(tipocarga, peso, watts);
        this.numfotones = numfotones;
        this.municion = municion;
        this.velocidadshots = velocidadshots;
    }

    public int getNumfotones() {
        return numfotones;
    }

    public void setNumfotones(int numfotones) {
        if (numfotones>=1&&numfotones<=10) {
            this.numfotones = numfotones;
        }else{
            this.numfotones = 1;
        }
        
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public double getVelocidadshots() {
        return velocidadshots;
    }

    public void setVelocidadshots(double velocidadshots) {
        this.velocidadshots = velocidadshots;
    }
    
    @Override
    public int muni(){
        return municion;
    }

    @Override
    public String toString() {
        return super.toString()+" Light{" + "numfotones=" + numfotones + ", municion=" + municion + ", velocidadshots=" + velocidadshots + '}';
    }

    @Override
    public Traje atacar(Traje samus) {
        samus.setMedirdanio(samus.getMedirdanio()+99);
        return samus;
    }
    
    
    
}
